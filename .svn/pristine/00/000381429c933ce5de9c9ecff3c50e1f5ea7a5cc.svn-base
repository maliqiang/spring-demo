package com.mark.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 初始化测试
 * Created by maliqiang on 2017/2/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestDB {
    private static Logger log = LoggerFactory.getLogger(TestDB.class);
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testConn(){
        String testSql = "SELECT SYSDATE() FROM DUAL";
        List list = jdbcTemplate.queryForList(testSql);
        log.warn("execute sql success,Today is:"+list.get(0));
    }
}
