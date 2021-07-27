package com.factotum.oaka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OakaApplication {

    public static void main(String[] args) {
        SpringApplication.run(OakaApplication.class, args);
    }

    @Bean
    @LoadBalanced
    WebClient.Builder builder() {
        return WebClient.builder();
    }

}

