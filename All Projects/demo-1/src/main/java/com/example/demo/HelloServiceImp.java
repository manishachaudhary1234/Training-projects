package com.example.demo;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImp implements HelloService {

	@Override
	public String greeting() {
		// TODO Auto-generated method stub
		return "Hey There";
	}
	public String greetRedis(){
		return "Redis";
	}
       
}
