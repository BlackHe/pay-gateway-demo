package com.forezp.servicegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.InMemoryRouteDefinitionRepository;
import org.springframework.cloud.gateway.route.RouteDefinitionWriter;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
public class ServiceGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run( ServiceGatewayApplication.class, args );
    }



    @Bean
    public RequestTimeGatewayFilterFactory requestTimeGatewayFilterFactory() {
        return new RequestTimeGatewayFilterFactory();
    }

    @Bean
    public RouteDefinitionWriter routeDefinitionWriter() {
        return new InMemoryRouteDefinitionRepository();
    }

    @Bean
    public MysqlRouteDefinitionRepository mysqlRouteDefinitionRepository() {
        return new MysqlRouteDefinitionRepository();
    }

}
