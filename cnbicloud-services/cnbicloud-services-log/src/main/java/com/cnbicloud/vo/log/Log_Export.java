package com.cnbicloud.vo.log;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 * @ClassName: T_exportLog
 * @Description: TODO(轨迹日志数据,此表数据量大，故设计为分库保存)
 * @author 龚佳新
 * @date 2017年11月29日
 *
 */
@Entity
@Table(name = "log_export")
public class Log_Export extends com.cnbicloud.vo.log.LogBean {private static final long serialVersionUID = 1L;}