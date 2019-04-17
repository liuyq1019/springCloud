package com.viss.springcloud.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.viss.springcloud.entities.Dept;
import com.viss.springcloud.service.DeptService;

@RestController
public class ProviderDeptController {
	
	@Autowired
	private DeptService deptService;
	
	/**
	 * 对外提供一个了解自我的信息
	 */
	@Autowired
	private DiscoveryClient client;
	
	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> getAll(){
		return deptService.findAll();
	}
	
	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept getById(@PathVariable("id")Long id) {
		return deptService.findById(id);
	}
	
	@RequestMapping(value = "/dept/add" ,method = RequestMethod.POST )
	public boolean addDept(@RequestBody Dept dept) {
		return deptService.addDept(dept);
	}
	
	@RequestMapping("/dept/disp")
	public Object discovery() {
		List<String> list  = client.getServices();
		System.out.println("****************"+list);
		List<ServiceInstance> deptList = client.getInstances("MICROSERVICECLOOUD-DEPT");
		for (ServiceInstance serviceInstance : deptList) {
			System.out.println(serviceInstance.getServiceId()+
					"\t"+serviceInstance.getHost()+"\t"+serviceInstance.getUri());
		}
		return client;
	}
}
