package com.cnbicloud.vo.per;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name = "sys_user_group")
public class T_User_Group implements Serializable {

    private static final long serialVersionUID = 1L;
    

	@Id
	@Column( name =  "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    

  //@EmbeddedId
    @Column( name =  "group_id")
    private Long group;
    
    //@EmbeddedId
    @Column( name =  "user_id")
    private Long user;
   
    @Column( name =  "nadd")
    private Short add;
    
    /**
     * 是否为创建者,取值范围为[0,1]
     */
    @Column( name =  "nprimary")
    private Short primary;
    
    
    
    private T_User_Group() {}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Long getGroup() {
		return group;
	}



	public void setGroup(Long group) {
		this.group = group;
	}



	public Long getUser() {
		return user;
	}



	public void setUser(Long user) {
		this.user = user;
	}



	public Short getAdd() {
		return add;
	}



	public void setAdd(Short add) {
		this.add = add;
	}



	public Short getPrimary() {
		return primary;
	}



	public void setPrimary(Short primary) {
		this.primary = primary;
	}
    

	


}