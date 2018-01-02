package com.cnbicloud.vo.per;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
/**
* @ClassName: T_OAuthUser  
* @Description: TODO(第三方登录表 )  
* @author 龚佳新 
* @date 2017年12月19日  
*
 */
@Entity(name="sys_oauth_user")
public class T_OAuthUser implements Serializable{
    
    /**  
	* @Fields field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @OneToOne(cascade = { CascadeType.REMOVE, CascadeType.MERGE, CascadeType.REFRESH,CascadeType.DETACH }, optional = true, fetch = FetchType.LAZY)
    private T_User user;
    
    @Column(name = "user_id", unique = false, nullable = true, insertable = false, updatable = false)
    private Long userId;
    
  
    /**
     * 第三方登录的类型  qq,weixin,sina...
     */
    @Column(name = "typ")
    private String type;
    
    /**
     * 第三方服务器授权码
     */
    private String token;
    
    /**
     * 失效时间
     */
    private Date expireTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public T_User getUser() {
		return user;
	}

	public void setUser(T_User user) {
		this.user = user;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
    
    
	
    
    
    

}
