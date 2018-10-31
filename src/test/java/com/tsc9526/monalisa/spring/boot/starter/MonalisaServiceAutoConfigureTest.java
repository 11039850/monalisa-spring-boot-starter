package com.tsc9526.monalisa.spring.boot.starter;

import java.util.Set;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@SpringBootApplication
public class MonalisaServiceAutoConfigureTest {
	protected ConfigurableApplicationContext application;
  
	@Test
	public void init() {
		Set<String> tables = Mysql1.DB.getTables();
		System.out.println("tables: "+  tables ); 
		
		String table = tables.iterator().next();
		System.out.println("==="+table+"===\r\n"+ Mysql1.DB.selectList(10,0,"select * from "+table).format());
	}
	
	
	@BeforeTest
	public void beforeTest() {
		application = new SpringApplicationBuilder(MonalisaServiceAutoConfigureTest.class).web(false).run();
	}
	
	@AfterTest
	public void afterTest() {
		application.close();
	}
}
