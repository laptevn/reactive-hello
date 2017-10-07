package com.laptev.reactivehello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RouterFunctionFactory {
    @Bean
    RouterFunction<ServerResponse> createRouter() {
        return RouterFunctions.route(
                RequestPredicates.GET("/hello"),
                request -> ServerResponse.ok().body(BodyInserters.fromObject("Hello World")));
    }
}