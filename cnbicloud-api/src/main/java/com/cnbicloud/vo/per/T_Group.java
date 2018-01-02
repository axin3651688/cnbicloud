package com.cnbicloud.vo.per;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.cnbicloud.vo.abs.AbstractUser;

/**
 * @ClassName: T_Group
 * @Description: TODO(组表)
 * @author 龚佳新
 * @date 2017年12月8日
 *
 */
@Entity
@Table(name = "sys_group")
public class T_Group extends AbstractUser {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	@Column(length = 24)
	private String text;

	public T_Group() {
	}

	public T_Group(Long id, String text) {
		this.id = id;
		this.text = text;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
