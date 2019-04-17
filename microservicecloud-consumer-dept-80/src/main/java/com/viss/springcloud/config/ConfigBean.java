package com.viss.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean { 
	//需要使用一个RestT面板
	@Bean
	@LoadBalanced //spring   cloud Ribbon 基于Netfilx Ribbon实现的一套客户端 负载均衡工具
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
