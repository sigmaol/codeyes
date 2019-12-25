package io.alpha.gateway.router;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Router {

    @Bean
    public RouteLocator apiRoute(RouteLocatorBuilder builder) {
        return builder.routes()
                //api proxy
                .route(r -> r.path("/api/**").uri("http://localhost:8081/api")
                ).build();
    }

}
