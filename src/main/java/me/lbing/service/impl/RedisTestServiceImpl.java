package me.lbing.service.impl;

import org.springframework.stereotype.Service;

import me.lbing.service.RedisTestService;

@Service
public class RedisTestServiceImpl implements RedisTestService {
	
	public String getTimestamp(String param) {
		Long timestamp = System.currentTimeMillis();
		return timestamp.toString();
	}

}
