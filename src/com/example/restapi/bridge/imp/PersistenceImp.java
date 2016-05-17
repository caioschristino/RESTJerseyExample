package com.example.restapi.bridge.imp;

import com.example.restapi.bridge.Persistence;
import com.example.restapi.bridge.PersistenceImplementor;

public class PersistenceImp implements Persistence {
	private PersistenceImplementor implementor = null;
	
	public PersistenceImp(PersistenceImplementor implementor) {
		this.implementor = implementor;
	}

	@Override
	public void deleteById(String id) {
		implementor.deleteObject(Long.parseLong(id));
	}

	@Override
	public Object findById(String objectId) {
		return implementor.getObject(Long.parseLong(objectId));
	}

	
	
	@Override
	public String persist(Object object) {
		return Long.toString(implementor.saveObject(object));
	}

	@Override
	public Object getFirst() {
		// TODO Auto-generated method stub
		return implementor.getFirst();
	}
}