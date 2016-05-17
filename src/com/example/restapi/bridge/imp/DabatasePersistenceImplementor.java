package com.example.restapi.bridge.imp;

import com.example.restapi.bridge.PersistenceImplementor;
import com.example.restapi.utils.FamousPeopleMock;

public class DabatasePersistenceImplementor implements PersistenceImplementor{
	private FamousPeopleMock mock;
	
	public DabatasePersistenceImplementor() {
		// load database driver
		mock = new FamousPeopleMock();
	}
	
	@Override
	public void deleteObject(long objectId) {
		// open database connection
		// remove record
	}

	@Override
	public Object getObject(long objectId) {
		// open database connection 
		// read records
		// create object from record 
		return mock.getJsonObject();
	}

	@Override
	public long saveObject(Object object) {
		// open database connection 
		// create records for fields inside the object
		return 0;
	}

	@Override
	public Object getFirst() {
		// TODO Auto-generated method stub
		return mock.getJsonObject();
	}
}