package com.example.bruteforce.Controller;

import com.example.bruteforce.Entity.Request;
import com.example.bruteforce.Service.RequestService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.net.ConnectException;

@Controller
public class RequestController {

    private RequestService requestService;

    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }

    @ResponseBody
    @PostMapping("")
    public HttpStatus sendRequest(@RequestBody Request request, @RequestParam int limit) throws IOException {
        try {
            requestService.sendRequest(request.getUrl(), request.getRequestBody(), limit);
            return HttpStatus.FOUND;
        }catch (ConnectException ce){
            return HttpStatus.NOT_FOUND;
        }
    }
}
