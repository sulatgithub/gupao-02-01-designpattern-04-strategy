package com.sul.pattern.sqlstrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OracleStrategy extends SqlStrategy {
    public List<Map<String,Object>> findList(String sql,Map<String,Object> param){
        return new ArrayList<Map<String,Object>>();
    }
    public void insert(String sql, Map<String,Object> param){
        //执行插入操作
    }
    public int update(String sql, Map<String,Object> param){
        return /*执行update，返回其结果*/1;
    }
    public int delete(String sql, Map<String,Object> param){
        return /*执行delete，返回其结果*/1;
    }
}
