package com.ustglobal.springcore.di;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("hello")
public class Hello 
{   
	public Hello() {
		System.out.println("Hello Object Created");
	}
	private String msg;

	private Map<String , Integer>Map;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Map<String, Integer> getMap() {
		return Map;
	}

	public void setMap(Map<String, Integer> map) {
		Map = map;
	}

	@PostConstruct
	public void init() {
		System.out.println("Init Method Executing from Hello");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Destroy Method Executing from Hello");
	}
}
