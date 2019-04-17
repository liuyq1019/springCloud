package com.viss.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * 消费提供者注册到eureka中需要在注解中新增一个新的注解
 * @EnableEurekaClient
 * 
 * 对外服务发现的注解标识
 * @EnableDiscoveryClient
 * @author liu.yongquan
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ProviderMain_8003 {
	public static void main(String[] args) {
		SpringApplication.run(ProviderMain_8003.class, args);
	}
}
