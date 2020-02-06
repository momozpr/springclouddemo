# 端口：
### 8761：eureka信息面板
### 8000：eureka-user端口
### 7900：eureka-order端口
### 8030：hystrix-user端口（可测试容错）
### 8020：feign-user端口
### 8050: zuul 端口

# ribbon负载均衡：
### 根据https://blog.csdn.net/Poiscorpion/article/details/91892421 配置多端口启动同一个微服务进行测试

# hystrix容错保护：
### 1.启动多个服务提供者order，服务消费者hystrix-user访问时，若是出现故障，则显示提示语句
### 2.访问http://localhost:8030/hystrix.stream 可看到微服务实时监控
### 3.访问http://localhost:8031/hystrix.stream 可以通过工具查看微服务实时监控

# feign采用面向接口编程方式:
### 1.启动多个服务提供者order，服务feign-user可以通过扫描注解@FeignClient获取远程调用的服务的方法
### 2.可以结合ribbon和hystrix


# zuul 网关
### 1. 调用网关的暴露接口可以直接调用order服务