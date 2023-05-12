package com.evanskiprotich.imoney;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.evanskiprotich.imoney.dto.AcknowledgeResponse;

import okhttp3.OkHttpClient;

@SpringBootApplication
public class ImoneyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImoneyApplication.class, args);
    }

    @Bean
    public OkHttpClient getOkHttpClient() {
        return new OkHttpClient();
    }

    @Bean
    public ObjectMapper getObjectMapper() {
        return new ObjectMapper();
    }

    @Bean
    public AcknowledgeResponse getAcknowledgeResponse() {
        AcknowledgeResponse acknowledgeResponse = new AcknowledgeResponse();
        acknowledgeResponse.setMessage("Success");
        return acknowledgeResponse;
    }
}