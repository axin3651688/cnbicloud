## 经邦云平台互联网微服务架构所包含的模块有：
	+ cnbicloud
       - cnbicloud-server                 注册中心服务(高可用HA集群)
       - cnbicloud-config                 配制中心服务(高可用HA集群)
	   - cnbicloud-api                    公共api服务-------
	   - cnbicloud-service                公共服务-------
       - cnbicloud-fastdfs                分布式文件系统服务(负载均衡集群)
	   - cnbicloud-security               安全认证服务(高可用HA集群)
       - cnbicloud-zuul-gateway           路由网关代理服务(高可用HA集群) 
       - cnbicloud-websocket              Web端消息服务
       - cnbicloud-socket                 客户端消息服务（单聊，群聊，应用）
	   + cnbicloud-services               业务中心服务模块(负载均衡集群)
	      - cnbicloud-services-license       牌照（个人，企业。【开源，商业】）
          - cnbicloud-services-datadict      数据字典
	      - cnbicloud-services-company       公司
	      - cnbicloud-services-dept          部门
	      - cnbicloud-services-user          用户
          - cnbicloud-services-auth          授权（公司，部门，角色，应用）
	      - cnbicloud-services-online        在线(用户,设备，企业等)
	      - cnbicloud-services-log           日志(按操作功能)
	      - cnbicloud-services-role          角色 
          - cnbicloud-services-msgbus        消息集成总线          
          - cnbicloud-services-voice         集成讯飞语音
          - cnbicloud-services-datas         数据转换（客户data->经邦data）
	   + cnbicloud-apps                  消费应用服务模块池(负载均衡集群)
          - cnbicloud-apps-dashboard         仪表盘
          - cnbicloud-apps-indicator         重点指标
          - cnbicloud-apps-datasource        数据源
          - cnbicloud-apps-table             报表
          - cnbicloud-apps-report            报告
          - cnbicloud-apps-design            设计器（图，表,文字等自定义分析）
          - cnbicloud-apps-disk              云盘或网盘
          - cnbicloud-apps-machine           消息总线及机器人个性服务
          - cnbicloud-apps-task              任务
          - cnbicloud-apps-calendar          日程管理
          - cnbicloud-apps-crm               客户关系
          - cnbicloud-apps-mgt               控制台或后台管理
          - cnbicloud-apps-turbine           服务调用追踪监控（运维的应用）


## Web端，Android端，IOS端可并行开发。。。

## 总共分10大库
### 核心:core，

       用户表   sys_users
       用户组   sys_groups
       牌照     sys_licenses
                个人客户：按用户授权     1
                企业客户:角色授权        2  
                混合客户:用户角色双授权  3
       公司     sys_companys
       部门     sys_depts
       角色     sys_roles
       系统模块 sys_sources
       数据字典 sys_dicts

个性 ：per[personality]



### 客户模块（资源），m

       数据源：  m_dataSource
       数据模型：m_model
       视图组件: m_view
       控制器：  m_controller 
       组合模块: m_sources

### 认证：auth
        
        是否为合法用户
        有无接口调用权限
        提供我的权限接口：用户权限+我的角色权限
        角色系统模块授权
        角色客户模块授权
        主要表有：
        auth_user_token  [id,token,user_id,type(授权的应用)]
        auth_user_group[id,group_id,user_id,join_time]
        auth_user_depts[id,user_id,dept_id]
        auth_user_group_action[id,ug_id,action(动作类型)]


按用户授权

        auth_user_sys_sources[id,source_id,user_id,type(系统模块)] 
        auth_user_m_sources[id,source_id,user_id,type(客户模块)]
        auth_user_sys_sources_action[系统模块的动作接口权限]
        auth_user_m_sources_action[客户模块的动作接口权限]
       

按角色授权

        auth_role_sys_sources[id,source_id,user_id,type(系统模块)] 
        auth_role_m_sources[id,source_id,user_id,type(客户模块)]
        auth_role_sys_sources_action[系统模块的动作接口权限]
        auth_role_m_sources_action[客户模块的动作接口权限]


    

### 日志：log, 按功能分表，在线用户为login表状态为online的用户，如果数据巨增的情
况下，再不影响页面调用的情况下，
 

## 高可用性(High Availability),简称HA：

    集群中的一个节点失效，它的任务可传递给其他节点。可以有效防止单点失效。HA有三种工作方式：

    1. 主从方式 （非对称方式）
    工作原理：主机工作，备机处于监控准备状况；当主机宕机时，备机接管主机的一切工作，待主机恢复正常后，按使用者的设定以自动或手动方式将服务切换到主机上运行，数据的一致性通过共享存储系统解决。

    2. 双机双工方式（互备互援）
    工作原理：两台主机同时运行各自的服务工作且相互监测情况，当任一台主机宕机时，另一台主机立即接管它的一切工作，保证工作实时，应用服务系统的关键数据存放在共享存储系统中。

    3. 集群工作方式（多服务器互备方式）
    工作原理：多台主机一起工作，各自运行一个或几个服务，各为服务定义一个或多个备用主机，当某个主机故障时，运行在其上的服务就可以被其它主机接管。

	
## 功能权限

 功能权限列表有以下N种：
     select：查看，
     update：修改，
     insert：新增，
     delete：删除，
     upload：上传，
     download：下载，
     export:导出
     export:导入

系统资源（菜单）权限列表有以下N种：
     
     组织机构（团队）：company
     部门：dept
     区域：region
     用户：user
     角色：role
     权限：permission
     应用：apps（dashboard,report,table,indicator,crm,task......）
     牌照：license
     数据字典：dict
     日志：log

功能与菜单权限组合为：

     insert:company 添加团队
     delete:company 删除团队
     update:company 更改团队
     select:company 查看团队
     .......................

牌照权限列表有以下4种：

     个人（开源），团队（开源），个人（商业），团队（商业）

内置角色列表：

     + 默认
       - 所有者            super
       - 管理员            admin
       - 部门主管          dept_mgt
       - 成员              member
     + 总监
       - 研发总监          dev_mgt
       - 市场总监          mark_mgt
       - 人力资源总监      hrm_mgt
       - 销售总监          sell_mgt
     + 职务
       - 财务
       - 客服
       - 出纳
       - 行政
       - HR
       - 采购
       - 人事
     + 区域
       - 南区
       - 华中区
       - 北区
       - 西区
       - 东区

## 行级数据授权 ： 
    角色拥有N多公司，N多部门的权限
    角色拥有N多应用里的N多行级数据的权限

## [基于表达式的权限控制 ]( http://elim.iteye.com/blog/2247073 )  
    
    表达式          描述
    hasRole([role])             当前用户是否拥有指定角色。
    hasAnyRole([role1,role2])  多个角色是一个以逗号进行分隔的字符串。如果当前用户拥有指定角色中的任意一个则返回true。
    hasAuthority([auth])          等同于hasRole
    hasAnyAuthority([auth1,auth2])  等同于hasAnyRole
    Principle   代表当前用户的principle对象
    authentication   直接从SecurityContext获取的当前Authentication对象
    permitAll   总是返回true，表示允许所有的
    denyAll   总是返回false，表示拒绝所有的
    isAnonymous()   当前用户是否是一个匿名用户
    isRememberMe()  表示当前用户是否是通过Remember-Me自动登录的
    isAuthenticated()表示当前用户是否已经登录认证成功了。
    isFullyAuthenticated()如果当前用户既不是一个匿名用户，同时又不是通过Remember-Me自动登录的，则返回true。

## 数据库主键id使用自动增长的坏处
    1. 程序后台添加测试
    2. 旧数据导入
    3. 数据库迁移
    4. 缓存 (如，两个库中id都为2时，缓存的时候会覆盖)




