package com.louis.kitty.admin.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;


public class SummaryUtils {
    public  static String callSummary(String raw_content) throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://127.0.0.1:5000/summary";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        String json = "{\"text\": " + raw_content +"}";
        HttpEntity<String> requestEntity = new HttpEntity<>(json, headers);
        System.out.println(requestEntity.getBody().toString());
        ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, requestEntity, String.class);
        String response = responseEntity.getBody();
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(response);
        String summary = rootNode.get("message").asText();
        System.out.println(summary);
        return summary;
    }
}