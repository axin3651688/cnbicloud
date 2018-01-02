##服务调用方,即consumer或client
+ Feign包含了Ribbon(负载均衡)和Hystrix(熔断技术),使用fein技术实现接口化调用，取消以前的远程接口用户
+ 在调用方做熔断和负载均衡的的处理

##与路由网关ZUUL-GATEWAY配套使用