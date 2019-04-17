package com.viss.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viss.springcloud.dao.DeptDao;
import com.viss.springcloud.entities.Dept;
import com.viss.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService{
	
	@Autowired
	private DeptDao dao;
	@Override
	public boolean addDept(Dept dept) {
		// TODO Auto-generated method stub
		return dao.addDept(dept);
	}
	@Override
	public Dept findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}
	
	@Override
	public List<Dept> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
}
