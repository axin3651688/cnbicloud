<<<<<<< HEAD
##服务调用方,即consumer或client
+ Feign包含了Ribbon(负载均衡)和Hystrix(熔断技术),使用fein技术实现接口化调用，取消以前的远程接口用户
+ 在调用方做熔断和负载均衡的的处理

##与路由网关ZUUL-GATEWAY配套使用

##MYSQL生成RestFulAPI
安装与用法

npm install -g xmysql

xmysql -h localhost -u root -p 1 -d gjx_jpa3

http://localhost:3000
1
2
3
4
5
6
这样就可以了。

特点

只要是MySql数据库，就都可以生成API
无论主键，外键，表等的命名约定如何，均可提供API
增删改查：日常操作
支持复合主键
分页
排序
字段
关系表
可运行动态查询
可以使用像Postman 或者类似的HTTP客户端工具来调用REST API。
=======
##服务调用方,即consumer或client
+ Feign包含了Ribbon(负载均衡)和Hystrix(熔断技术),使用fein技术实现接口化调用，取消以前的远程接口用户
+ 在调用方做熔断和负载均衡的的处理

##与路由网关ZUUL-GATEWAY配套使用
>>>>>>> 46849f9e614725c540dee6367c27eb9b7d1d51c4
