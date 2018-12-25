package com.pioneer.zuul.gateway.pioneerzuulgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.pioneer.zuul.gateway.pioneerzuulgateway.filters.ErrorFilter;
import com.pioneer.zuul.gateway.pioneerzuulgateway.filters.PostFilter;
import com.pioneer.zuul.gateway.pioneerzuulgateway.filters.PreFilter;
import com.pioneer.zuul.gateway.pioneerzuulgateway.filters.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
public class PioneerZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PioneerZuulGatewayApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
	    return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
	    return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
	    return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
	    return new RouteFilter();
	}	
	
}

