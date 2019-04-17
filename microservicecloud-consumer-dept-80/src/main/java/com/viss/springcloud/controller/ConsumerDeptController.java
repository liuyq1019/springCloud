package com.viss.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.viss.springcloud.entities.Dept;

@RestController
public class ConsumerDeptController {
	
//	private static String restUrl = "http://localhost:8001/";
									 
	private static String restUrl = "http://MICROSERVICECLOOUD-DEPT";
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "/consumer/list")
	public List<Dept> findList(){
		@SuppressWarnings("unchecked")
		List<Dept> list = restTemplate.getForObject(restUrl+"/dept/list", List.class);
		return list;
	}
	
	@RequestMapping(value = "/consumer/add")
	public boolean add(Dept dept) {
		return restTemplate.postForObject(restUrl+"/dept/add", dept, Boolean.class);
	}
	
	@RequestMapping(value = "/consumer/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return restTemplate.getForObject(restUrl+"/dept/get/"+id, Dept.class);
	}
	
	@RequestMapping("/consumer/disp")
	public Object disp() {
		return restTemplate.getForObject(restUrl+"/dept/disp", Object.class);
	}
}
