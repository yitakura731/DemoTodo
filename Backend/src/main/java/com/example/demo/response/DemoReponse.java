package com.example.demo.response;

import com.example.demo.entity.TodoStatus;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DemoReponse {

	private String id;

	private String name;

	private TodoStatus status;

	private String detail;
}
