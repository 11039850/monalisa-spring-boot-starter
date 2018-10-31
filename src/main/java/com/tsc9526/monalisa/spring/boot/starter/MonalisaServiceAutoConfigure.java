package com.tsc9526.monalisa.spring.boot.starter;

import java.util.Map.Entry;
import java.util.Properties;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.tsc9526.monalisa.orm.datasource.DbProp;

/**
 * @author zzg.zhou(11039850@qq.com)
 */
@Configuration
@EnableConfigurationProperties(value = MonalisaProperties.class)  
public class MonalisaServiceAutoConfigure {

	@Autowired
	private MonalisaProperties properties;

	@PostConstruct
	public void init() {
		Properties dbCfgProps = new Properties();
		for (Entry<String, String> entry : properties.getDb().entrySet()) {
			String key   = mappingKey(entry.getKey());
			String value = entry.getValue();

			dbCfgProps.put("db." + key, value);
		}
		
		DbProp.setDbCfgProps(dbCfgProps);
	}
	
	private String mappingKey(String key) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<key.length();i++) {
			char c =  key.charAt(i);
			if(c=='-') {
				c =  key.charAt(i+1);
				sb.append(Character.toUpperCase(c));
				i++;
			}else {
				sb.append(c);
			}
		}
		
		return sb.toString();
		
	}
}
