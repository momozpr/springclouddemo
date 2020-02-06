package net.cnca.microservicefeign.controller;

import net.cnca.microservicefeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date: 2020/2/4
 * @author: zpr
 * @description: Feign使用面向接口编程
 */
@RestController
public class UserController {
    @Autowired
    private FeignService feignService;

    @GetMapping("/findOrdersByUser/{id}")
    public String findOrdersByUser(@PathVariable String id){
        String oid = "123";
//        return this.restTemplate.getForObject("http://localhost:7900/order/"+oid, String.class);
        return this.feignService.findOrdersByUser(oid);
    }
}
