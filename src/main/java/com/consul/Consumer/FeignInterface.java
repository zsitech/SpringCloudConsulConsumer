package com.consul.Consumer;
import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="springcloudconsulproducer") // 注册的服务名
public interface FeignInterface {
	
	@RequestMapping(method=RequestMethod.GET, value="/say_hello_producer")  // 映射的API路径
	public String sayHello();
	
}
