package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 * Created by ppatchava on 1/3/17.
 */
@Repository
public class RedisOpsImp implements RedisOperations {

   private static final String REDIS_OBJ_KEY="Student";

   @Autowired
    private RedisTemplate<String,May2017> redisTemplate ;

   public RedisTemplate<String, May2017> getRedisTemplate() {
        return redisTemplate;
    }

   public void setRedisTemplate(RedisTemplate<String, May2017> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

   public void save(May2017 redisObject){
        redisTemplate.opsForHash().put(REDIS_OBJ_KEY, redisObject.getFirstName(), redisObject);
    }

   public void update(May2017 redisObject){
        redisTemplate.opsForHash().put(REDIS_OBJ_KEY, redisObject.getFirstName(), redisObject);
    }

   public void delete(May2017 redisObject){
        redisTemplate.opsForHash().delete(REDIS_OBJ_KEY,redisObject.getFirstName());
    }

   public May2017 select(String key){
        return (May2017)redisTemplate.opsForHash().get(REDIS_OBJ_KEY, key);
    }

}