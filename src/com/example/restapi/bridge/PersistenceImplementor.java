package com.example.restapi.bridge;

public interface PersistenceImplementor {

	public long saveObject(Object obj);

	public void deleteObject(long id);

	public Object getObject(long id);

	public Object getFirst();
}