package com.sul.pattern;

import com.sul.pattern.sqlstrategy.MysqlStrategy;
import com.sul.pattern.sqlstrategy.OracleStrategy;
import com.sul.pattern.sqlstrategy.SQLServerStrategy;
import com.sul.pattern.sqlstrategy.SqlStrategy;

import java.util.HashMap;
import java.util.Map;

public class SqlStrategyFactory {
    private static Map<String, SqlStrategy> SQLSTRATEGY_MAP = new HashMap<String,SqlStrategy>();
    static {
        SQLSTRATEGY_MAP.put("MYSQL",new MysqlStrategy());
        SQLSTRATEGY_MAP.put("ORACLE",new OracleStrategy());
        SQLSTRATEGY_MAP.put("SQLSERVER",new SQLServerStrategy());
    }

    public static SqlStrategy getSql(String type){
        SqlStrategy sqlStrategy = SQLSTRATEGY_MAP.get(type);
        if(sqlStrategy == null ) {
            throw new RuntimeException("类型错误");
        }
        return sqlStrategy;
    }
}
