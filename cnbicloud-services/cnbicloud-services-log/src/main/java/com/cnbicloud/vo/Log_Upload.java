package com.cnbicloud.vo;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.cnbicloud.vo.base.LogBean;
/**
 * 
 * @ClassName: T_uploadLog
 * @Description: TODO(轨迹日志数据,此表数据量大，故设计为分库保存)
 * @author 龚佳新
 * @date 2017年11月29日
 *
 */
@Entity
@Table(name = "log_upload")
public class Log_Upload extends com.cnbicloud.vo.base.LogBean {private static final long serialVersionUID = 1L;}
