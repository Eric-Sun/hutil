package com.hb.hutil.db;

/**
 * key-value数据库的访问接口
 * @author Eric
 *
 */
public interface KVConnection {
	
	public void set(String key,String value);
	
	public String get(String key,String value);
	
}
