package com.sul.pattern;

import com.sul.pattern.sqlstrategy.SqlStrategy;

import java.util.HashMap;

public class SqlStrategyTest {
    public static void main(String[] args) {
        String type = "MYSQL";
        SqlStrategy sqlStrategy = SqlStrategyFactory.getSql(type);
        sqlStrategy.findList("",new HashMap<String, Object>());
        sqlStrategy.update("",new HashMap<String, Object>());
    }
}
