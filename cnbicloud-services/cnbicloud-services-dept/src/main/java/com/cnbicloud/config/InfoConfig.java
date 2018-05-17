package com.cnbicloud.config;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
@Component      //不加这个注解的话, 使用@Autowired 就不能注入进去了
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "info", ignoreUnknownFields = true)
@RefreshScope	// 如果现在没有这个注解，则在通过SpringCloudBus获取配置信息的时候无法进行刷新
public class InfoConfig {	// 将所有可能动态获取的配置内容写在一个类之中，到处引用
	//@Value("${info.app.name}")
	private String appName ;
	//@Value("${info.company.name}")
	private String companyName ;
	//@Value("${info.app.version}")
	private String appVersion ;
	
	private String version;
	
	
	public String getAppName() {
		return appName;
	}
	public String getAppVersion() {
		return appVersion;
	}
	public String getCompanyName() {
		return companyName;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	@Override
	public String toString() {
		return "InfoConfig [appName=" + appName + ", companyName=" + companyName + ", appVersion=" + appVersion + ", version=" + version + "]";
	}
	
	
}
