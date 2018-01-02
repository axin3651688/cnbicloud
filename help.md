# 统一修改maven版本号
	在命令行中，进入项目目录，依次执行如下命令：
	mvn versions:set -DnewVersion=1.0.0-SNAPSHOT
	mvn versions:commit
	执行后，所有文件中版本号都变更为：1.0.0-SNAPSHOT
	mvn versions:update-child-modules   如果子模块的版本号没变，再执行此命令
# maven顶级pom和子pom的版本号批量修改	
当一个版本发布，新起一个版本时，我们只需要手动修改一下项目中pom.xml的版本号就可以了。但是如果这个maven项目有很多的子模块项目，那么一个个手动的去改就显得费时费力又繁琐了。还好，maven为我们提供了以下三个命令（需要进入顶级pom所在的目录）来帮助我们解决这个问题。

# 设置新的版本号

mvn versions:set -DnewVersion=1.1.3

 

# 当新版本号设置不正确时可以撤销新版本号的设置

mvn versions:revert

 

# 确认新版本号无误后提交新版本号的设置

mvn versions:commit

[转载至:](http://www.yyjjssnn.cn/articles/717.html © www.yyjjssnn.cn	)


## [JPA官网](https://docs.spring.io/spring-data/jpa/docs/2.0.2.RELEASE/reference/html/#repositories.query-methods.details)

## springcloud-event-bus

   [CURL内网](curl -d "" "http://mldnjava:hello@192.168.1.118:7101/bus/refresh")

   [CURL外网](curl -d "" "http://mldnjava:hello@cnbigjx.eicp.net:36108/bus/refresh")

  