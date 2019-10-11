package com.example.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;


@EnableAutoConfiguration
@EnableTurbine
@EnableDiscoveryClient
public class TurbineApplication
{

    public static void main(String[] args) {
        SpringApplication.run(TurbineApplication.class, args);
    }

}
