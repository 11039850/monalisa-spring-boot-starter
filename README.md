# Spring-boot-auto-config

example: application.yml 

```yml
monalisa:
  db: 
    cfg: #default config
      debug: true
      datasource-class: C3p0DataSource 
      pool:
        initialPoolSize: 5
        minPoolSize:     30
    mysql1: #db1 
      url:      jdbc:mysql://127.0.0.1:3306/test_monalisa?allowMultiQueries=true
      username: monalisa
      password: monalisa
       
      pool: 
        maxPoolSize: 100
    mysql2: #db2 
      url:      jdbc:mysql://127.0.0.1:3306/test_monalisa2?allowMultiQueries=true
      username: monalisa
      password: monalisa
       
      pool: 
        maxPoolSize: 100   
``` 


```java
@DB(configName="mysql1")
public interface Mysql1 {  
	public static DBConfig DB = DBConfig.fromClass(Mysql1.class);
}


@DB(configName="mysql2")
public interface Mysql2 {  
	public static DBConfig DB = DBConfig.fromClass(Mysql2.class);
 
``` 


# Maven: 
```xml	
	<dependency>
		<groupId>com.tsc9526</groupId>
		<artifactId>monalisa-spring-boot-starter</artifactId>
		<version>1.0.0</version>
	</dependency>
``` 
