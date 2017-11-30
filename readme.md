## 经邦云平台互联网微服务架构所包含的模块有：
	+ cnbicloud
       - cnbicloud-server                 服务注册中心(高可用HA集群)
       - cnbicloud-config                 服务配制中心(高可用HA集群)
	   - cnbicloud-api                    公共api模块-------
	   - cnbicloud-service                公共服务模块-------
       - cnbicloud-fastdfs                分布式文件系统模块(负载均衡集群)
	   - cnbicloud-security               安全认证模块(高可用HA集群)
       - cnbicloud-zuul-gateway           路由网关代理模块(高可用HA集群) 
       - cnbicloud-websocket              Web端双向通讯模块----------
       - cnbicloud-socket                 客户端双向通讯模块---------
	   + cnbicloud-provides               服务提供模块(负载均衡集群)
	      - cnbicloud-provides-license       牌照（个人，企业。【开源，商业】）
          - cnbicloud-provides-datadict      数据字典
	      - cnbicloud-provides-company       公司
	      - cnbicloud-provides-dept          部门
	      - cnbicloud-provides-user          用户
          - cnbicloud-provides-auth          授权（公司，部门，角色，应用）
	      - cnbicloud-provides-online        在线(用户,设备，企业等)
	      - cnbicloud-provides-log           日志
	      - cnbicloud-provides-role          角色 
	      - cnbicloud-provides-chatmsg       单聊消息
	      - cnbicloud-provides-groupmsg      群聊消息
	      - cnbicloud-provides-appmsg        应用消息
          - cnbicloud-provides-msgbus        消息集成总线          
          - cnbicloud-provides-voice         集成讯飞语音
          - cnbicloud-provides-datas         数据
	   + cnbicloud-consumers              服务消费应用模块(负载均衡集群)
          - cnbicloud-consumers-dashboard    仪表盘
          - cnbicloud-consumers-indicator    重点指标
          - cnbicloud-consumers-datasource   数据源
          - cnbicloud-consumers-table        报表
          - cnbicloud-consumers-report       报告
          - cnbicloud-consumers-design       设计器（图，表,文字）
          - cnbicloud-consumers-machine      消息总线及机器人个性服务

## 高可用性(High Availability),简称HA：

    集群中的一个节点失效，它的任务可传递给其他节点。可以有效防止单点失效。HA有三种工作方式：

    1. 主从方式 （非对称方式）
    工作原理：主机工作，备机处于监控准备状况；当主机宕机时，备机接管主机的一切工作，待主机恢复正常后，按使用者的设定以自动或手动方式将服务切换到主机上运行，数据的一致性通过共享存储系统解决。

    2. 双机双工方式（互备互援）
    工作原理：两台主机同时运行各自的服务工作且相互监测情况，当任一台主机宕机时，另一台主机立即接管它的一切工作，保证工作实时，应用服务系统的关键数据存放在共享存储系统中。

    3. 集群工作方式（多服务器互备方式）
    工作原理：多台主机一起工作，各自运行一个或几个服务，各为服务定义一个或多个备用主机，当某个主机故障时，运行在其上的服务就可以被其它主机接管。

	   
