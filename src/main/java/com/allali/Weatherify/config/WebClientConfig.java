package com.allali.Weatherify.config;

import lombok.Builder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@Builder
public class WebClientConfig {
    @Bean
    public WebClient webClient(){

        WebClient webClient = WebClient.builder()
                .baseUrl("http://localhost:3000")
                .defaultCookie("cookie-name", "cookie-value")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
        return webClient ;
    }

}
