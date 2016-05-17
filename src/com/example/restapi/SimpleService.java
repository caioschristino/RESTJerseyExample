package com.example.restapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;

import com.example.restapi.bridge.Persistence;
import com.example.restapi.bridge.PersistenceImplementor;
import com.example.restapi.bridge.imp.DabatasePersistenceImplementor;
import com.example.restapi.bridge.imp.PersistenceImp;

@Path("/simpleservice")
public class SimpleService {
	@GET
	@Produces("application/json")
	public Response convertFtoC() throws JSONException {
		PersistenceImplementor implementor = null;
		if (databaseDriverExists())
			implementor = new DabatasePersistenceImplementor();

		Persistence persistenceAPI = new PersistenceImp(implementor);
		return Response.status(200).entity(persistenceAPI.getFirst()).build();
	}

	@Path("{id}")
	@GET
	@Produces("application/json")
	public Response convertFtoCfromInput(@PathParam("id") String id) throws JSONException {
		PersistenceImplementor implementor = null;
		if (databaseDriverExists())
			implementor = new DabatasePersistenceImplementor();

		Persistence persistenceAPI = new PersistenceImp(implementor);
		return Response.status(200).entity(persistenceAPI.findById(id)).build();	}

	private static boolean databaseDriverExists() {
		return true;
	}
}