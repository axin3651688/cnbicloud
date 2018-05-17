## [统一的安全认证](https://www.cnblogs.com/Mainz/p/3230077.html)
   
     Spring Security默认的行为是每个登录成功的用户会新建一个Session。但其实对大规模的网站是致命的。用户越多，新建的session越多，最后的结果是JVM内存耗尽，你的web服务器彻底挂了。 有session的另外一个严重的问题是scalability能力，用户压力上来了不能马上新建一台Jetty/Tomcat服务器，因为要考虑Session同步的问题。
     
     大家知道，Spring Security在认证的过程中，Spring Security会运行一个过滤器（SecurityContextPersistenceFilter）来存储请求的Security Context，这个上下文的存储是一个策略模式，但默认的是保存在HTTP Session中的HttpSessionSecurityContextRepository。现在我们设置了 create-session=”stateless”，就会保存在NullSecurityContextRepository，里面没有任何session在上下文中保持。既然没有为何还要调用这个空的filter？因为需要调用这个filter来保证每次请求完了SecurityContextHolder被清空了，下一次请求必须re-authentication。