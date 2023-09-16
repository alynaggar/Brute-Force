package com.example.bruteforce.Controller;

import com.example.bruteforce.Entity.Request;
import com.example.bruteforce.Response.HttpResponse;
import com.example.bruteforce.Service.RequestService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.ConnectException;

@Controller
public class RequestController {

    private RequestService requestService;

    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }

    @GetMapping("")
    public String getRequest(){
        return "home";
    }

    @PostMapping("")
    @ResponseBody
    public HttpResponse sendRequest(@RequestParam("url") String url,
                                    @RequestParam("username") String username,
                                    @RequestParam("limit") int limit) throws IOException {
        if(limit <= 0 || limit > 8){
            return HttpResponse.LIMIT_MUST_BE_BETWEEN_1_AND_8;
        }
        try {
            requestService.sendRequest(url, username, limit);
            return HttpResponse.MISSION_COMPLETE;
        }catch (ConnectException ce){
            return HttpResponse.CANNOT_CONNECT_TO_THIS_URL;
        }
    }
}
