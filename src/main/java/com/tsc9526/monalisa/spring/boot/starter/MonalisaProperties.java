package com.tsc9526.monalisa.spring.boot.starter;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *  @author zzg.zhou(11039850@qq.com)
 */
@ConfigurationProperties("monalisa")
public class MonalisaProperties {
	private Map<String,String> db = new LinkedHashMap<String,String>();

	public Map<String,String> getDb() {
		return db;
	}

	public void setDb(Map<String,String> db) {
		this.db = db;
	}
}

