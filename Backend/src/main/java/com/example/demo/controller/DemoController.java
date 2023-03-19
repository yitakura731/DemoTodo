package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import com.example.demo.response.DemoReponse;
import com.example.demo.service.DemoService;

@Controller
public class DemoController {
	
	private DemoService service;
	
	@Autowired 
	public DemoController(DemoService service) {
		this.service = service;
	}

	@SchemaMapping(typeName="Query", field = "getTodos")
    public List<DemoReponse> getTodos() {
		return service.getTodos();
    }
	
	@SchemaMapping(typeName="Query", field = "getTodo")
	public DemoReponse getTodos(String id) {
		return service.getTodo(id);
	}	
}
