package com.consul.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@RestController
@EnableFeignClients
public class SpringCloudConsulConsumerApplication {

	@Autowired
    private FeignInterface feignInterface;
	
	@RequestMapping(value="/say_hello_consumer")
	public String SayHello() {
		return feignInterface.sayHello();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsulConsumerApplication.class, args);
	}

}
