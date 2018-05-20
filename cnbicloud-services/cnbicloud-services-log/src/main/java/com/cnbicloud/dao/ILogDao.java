package com.cnbicloud.dao;

import org.springframework.stereotype.Repository;

import com.cnbicloud.vo.log.Log_Login;

@Repository
public interface ILogDao extends CnbiJpaRepository<Log_Login, Long>{

}
