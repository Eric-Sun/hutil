package com.hb.hutil.db;

/**
 * key-value���ݿ�ķ��ʽӿ�
 * @author Eric
 *
 */
public interface KVConnection {
	
	public void set(String key,String value);
	
	public String get(String key,String value);
	
}
