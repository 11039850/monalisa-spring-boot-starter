# Spring-boot-auto-config

example: application.yml 

```yml
monalisa:
  db: 
    cfg:
      debug: true
      datasource-class: C3p0DataSource 
      pool:
        initialPoolSize: 5
        minPoolSize:     30
    mysql: 
      url:      jdbc:mysql://127.0.0.1:3306/test_monalisa?allowMultiQueries=true
      username: monalisa
      password: monalisa
       
      pool: 
        maxPoolSize: 100
``` 


```java
@DB(configName="mysql")
public interface StaticCfgMysqlDB {    
	public static DBConfig DB = DBConfig.fromClass(StaticCfgMysqlDB.class);
}
```


# Maven: 
```xml	
	<dependency>
		<groupId>com.tsc9526</groupId>
		<artifactId>monalisa-spring-boot-starter</artifactId>
		<version>1.0.0</version>
	</dependency>
``` 
