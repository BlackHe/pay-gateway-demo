package com.peony.servicekq;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceKqApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceKqApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/kq")
    public String home(@RequestBody RequestBean param){
        System.out.printf(param.toString());
        return param.toString();
    }

}
