package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Todo;
import com.example.demo.entity.TodoStatus;
import com.example.demo.repository.DemoRepository;
import com.example.demo.response.DemoReponse;

@Service
public class DemoService {

	private DemoRepository repository;

	@Autowired 
	public DemoService(DemoRepository repository) {
		this.repository = repository;
	}

    public List<DemoReponse> getTodos() {
		return repository.findAll().stream()
				.map(e -> toReponse(e))
				.collect(Collectors.toList());
    }
	
	public DemoReponse getTodo(String id) {
		return toReponse(repository.findById(id).get());
	}
	
	private DemoReponse toReponse(Todo e) {
		return DemoReponse.builder()
				.id(e.getId())
				.name(e.getName())
				.status(TodoStatus.valueFromId(e.getStatus()))
				.detail(e.getDetail())
				.build();
	}
}
