/*package com.kfit.test.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kfit.test.bean.Demo;

@Repository
public class DemoDao {
    
	
	@Resource
    private JdbcTemplate jdbcTemplate;
	
	 *//**
     * 通过id获取demo对象.
     * @param id
     * @return
     *//*
    public Demo getById(long id){
       String sql = "select *from Demo where id=?";
       RowMapper<Demo> rowMapper = new BeanPropertyRowMapper<Demo>(Demo.class);
       return jdbcTemplate.queryForObject(sql, rowMapper,id);

    }


}
*/