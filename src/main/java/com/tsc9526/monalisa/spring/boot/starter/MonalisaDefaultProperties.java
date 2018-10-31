package com.tsc9526.monalisa.spring.boot.starter;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *  @author zzg.zhou(11039850@qq.com)
 */
@ConfigurationProperties("monalisa.db")
public class MonalisaDefaultProperties {
	private DefaultCfg cfg;
	
	public static class DefaultCfg{
		/**
		 *  JDBC url, for example:  
		 *  <li> jdbc:mysql://localhost:3306/your_database                     </li>
		 *  <li> jdbc:oracle:thin:@//localhost:1521/your_database              </li>
		 *  <li> jdbc:postgresql://localhost:5432/your_database                </li>
		 *  <li> jdbc:sqlserver://localhost:1433;databaseName=your_database    </li>
		 */
		private String url;

		/**
		 * database's username
		 */
		private String username;
		
		/**
		 * database's password
		 */
		private String password;
		
		
		/**
		 * jdbc driver class
		 */
		private String driver;
		
		/**
		 * database's catalog
		 */
		private String catalog;
		
		/**
		 * database's schema
		 */
		private String schema;
		
		/**
		 * database connection pool, one of the following:
		 * <li> C3p0DataSource 
		 * <li> DruidDataSource
		 */
		private String datasourceClass;
		
		/**
		 * print the executing sql statement
		 */
		private boolean debug;
		
		/**
		 * datasource pool's properties, Depends on the datasourceClass you set up.
		 */
		private Map<String, String> pool = new HashMap<String, String>();
			     
		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getDriver() {
			return driver;
		}

		public void setDriver(String driver) {
			this.driver = driver;
		}

		public String getCatalog() {
			return catalog;
		}

		public void setCatalog(String catalog) {
			this.catalog = catalog;
		}

		public String getSchema() {
			return schema;
		}

		public void setSchema(String schema) {
			this.schema = schema;
		}

		public String getDatasourceClass() {
			return datasourceClass;
		}

		public void setDatasourceClass(String datasourceClass) {
			this.datasourceClass = datasourceClass;
		}

		public boolean isDebug() {
			return debug;
		}

		public void setDebug(boolean debug) {
			this.debug = debug;
		}

		public Map<String, String> getPool() {
			return pool;
		}

		public void setPool(Map<String, String> pool) {
			this.pool = pool;
		}
		
	}

	public DefaultCfg getCfg() {
		return cfg;
	}

	public void setCfg(DefaultCfg cfg) {
		this.cfg = cfg;
	}
}

