package com.cnbicloud.vo.per;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name = "sys_user_role")
public class T_User_Role implements Serializable {

    private static final long serialVersionUID = 1L;
    

	@Id
	@Column( name =  "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    

  //@EmbeddedId
    @Column( name =  "role_id")
    private Integer role;
    
    //@EmbeddedId
    @Column( name =  "user_id")
    private Long user;
    
    @Column( name =  "company_id",length = 16)
    private String company;
    
    
    @Column( name =  "dept_id",length = 255)
    private String dept;
    
    /**
     * 当前所在维度,取值范围为[0,1]
     */
    @Column( name =  "nprimary")
    private Short primary;
    
    
    
    private T_User_Role() {}

	


}