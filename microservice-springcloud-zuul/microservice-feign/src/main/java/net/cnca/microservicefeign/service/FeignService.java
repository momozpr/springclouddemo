package net.cnca.microservicefeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @date: 2020/2/4
 * @author: zpr
 * @description:
 */
@FeignClient(value = "microservice-eureka-order")
public interface FeignService {
    @GetMapping("/order/{id}")
    String findOrdersByUser(@PathVariable("id") String id);}
