package net.cnca.microserviceeurekauserhystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @date: 2020/2/3.23:25
 * @author: zpr
 * @description:
 */
@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findOrdersByUser/{id}")
    @HystrixCommand(fallbackMethod = "fallbackInfo")
    public String findOrdersByUser(@PathVariable String id){
        int oid = 123;
//        return this.restTemplate.getForObject("http://localhost:7900/order/"+oid, String.class);
        return this.restTemplate.getForObject("http://microservice-eureka-order/order/"+oid, String.class);
    }

    /**
     * 发生异常的回调方法，参数类型和返回值需要和原方法一致
     * @param id
     * @return
     */
    public String fallbackInfo(@PathVariable String id){
        return "服务不可用，请稍后再试!";
    }
}
