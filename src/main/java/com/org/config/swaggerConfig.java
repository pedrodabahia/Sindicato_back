/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.org.config;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pedro
 */
@RestController
@Configuration
@Hidden
public class swaggerConfig {
    
    public ResponseEntity<Void> redirectSwagger(HttpServletRequest request, HttpServletResponse response){
        String url = "swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config";
        response.setHeader("Location", url);
        response.setStatus(302);
        return null;
    }
    
    @Bean
    public OpenAPI customAPI(){
        return new OpenAPI().info(new Info().title("Sindiservim").version("1.0.0"));
    }
}
