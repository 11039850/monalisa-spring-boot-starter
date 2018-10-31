package com.tsc9526.monalisa.spring.boot.starter;

import com.tsc9526.monalisa.orm.annotation.DB;
import com.tsc9526.monalisa.orm.datasource.DBConfig;

/**
 *  @author zzg.zhou(11039850@qq.com)
 */
@DB(configName="mysql1")
public interface Mysql1 {  
	public static DBConfig DB = DBConfig.fromClass(Mysql1.class);
}

