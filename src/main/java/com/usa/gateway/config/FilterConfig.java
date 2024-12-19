package com.usa.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@Deprecated
public class FilterConfig {
    @Deprecated
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/member-service/**")
                        .uri("lb://USER-SERVICE"))
                .route(r -> r.path("/order-service/**")
                        .uri("lb://ORDER-SERVICE"))
                .build();
    }
}
