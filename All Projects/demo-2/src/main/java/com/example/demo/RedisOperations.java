package com.example.demo;

public interface RedisOperations {
	public interface RedisOperationInterface {
	    public void save(May2017 redisObject);
	    public void update(May2017 redisObject);
	    public void delete(May2017 redisObject);
	    public May2017 select(String key);
	}

}
