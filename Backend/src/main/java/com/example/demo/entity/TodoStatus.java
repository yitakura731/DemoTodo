package com.example.demo.entity;

import java.util.stream.Stream;

public enum TodoStatus {
	
	FINISH(1),
	RUNNING(2),
	NOT_YET(3),
	;
	
	private int id;
	
	TodoStatus(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	public static TodoStatus valueFromId(int id) {
		return Stream.of(TodoStatus.values())
		.filter(e -> e.getId() == id)
		.findFirst()
		.get();
	}
}
