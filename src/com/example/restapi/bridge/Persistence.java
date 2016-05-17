package com.example.restapi.bridge;

public interface Persistence {
	/**
	 * @param object
	 * @return returns objectID
	 */
	public String persist(Object o);
	
	/**
	 * 
	 * @param objectId
	 * @return persisted Object
	 */
	public Object findById(String id);
	
	/**
	 * 
	 * @param id
	 */
	public void deleteById(String id);	
	
	/**
	 * 
	 * @param objectId
	 */
	public Object getFirst();
}