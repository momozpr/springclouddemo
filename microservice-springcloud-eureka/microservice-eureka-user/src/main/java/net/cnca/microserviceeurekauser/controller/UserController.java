package net.cnca.microserviceeurekauser.controller;

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
    public String findOrdersByUser(@PathVariable String id){
        int oid = 123;
        return this.restTemplate.getForObject("http://localhost:7900/order/"+oid, String.class);
    }
}
