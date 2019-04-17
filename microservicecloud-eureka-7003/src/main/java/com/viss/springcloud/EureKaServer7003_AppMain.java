package com.viss.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * springboot启动服务时需要开启eureka
 * @author liu.yongquan
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EureKaServer7003_AppMain {
	public static void main(String[] args) {
		SpringApplication.run(EureKaServer7003_AppMain.class, args);
	}
}
