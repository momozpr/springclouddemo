# 端口：
### 8761：eureka信息面板
### 8000：eureka-user端口
### 7900：eureka-order端口
### 8030：hystrix-user端口（可测试容错）

# ribbon负载均衡：
### 根据https://blog.csdn.net/Poiscorpion/article/details/91892421 配置多端口启动同一个微服务进行测试

# hystrix容错保护：
### 1.启动多个服务提供者order，服务消费者hystrix-user访问时，若是出现故障，则显示提示语句
### 2.访问http://localhost:8030/hystrix.stream可看到微服务实时监控
### 3.访问http://localhost:8031/hystrix.stream可以通过工具查看微服务实时监控