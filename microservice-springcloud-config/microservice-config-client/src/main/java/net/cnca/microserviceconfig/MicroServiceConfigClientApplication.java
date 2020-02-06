package net.cnca.microserviceconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MicroServiceConfigClientApplication {

    @Value("${clientParam}")
    private String clientParam;

    @RequestMapping("/clientParam")
    public String getParam(){
        return clientParam;
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceConfigClientApplication.class, args);
    }

}
