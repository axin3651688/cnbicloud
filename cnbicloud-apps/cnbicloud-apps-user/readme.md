##服务调用方
+ Feign包含了Ribbon(负载均衡)和Hystrix(熔断技术),使用fein技术实现接口化调用，取消以前的远程接口用户

##与路由网关ZUUL-GATEWAY配套使用

## 部门调用地址
> http://192.168.1.118:85/api/user/get?username=cnbigjx  consumers

> http://192.168.1.118:82/user/get?username=cnbigjx    services

> http://192.168.1.118:9501/user/get?username=cnbigjx    zuul


> http://mldnjava:hello@192.168.1.118:85/api/user/get?username=cnbigjx  consumers

> http://mldnjava:hello@192.168.1.118:82/user/get?username=cnbigjx    services

> http://zdmin:mldnjava@192.168.1.118:9501/user/get?username=cnbigjx    zuul