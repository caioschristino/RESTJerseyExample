package com.example.restapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;

import com.example.restapi.mock.FamousPeopleMock;

@Path("/simpleservice")
public class SimpleService {
	@GET
	@Produces("application/json")
	public Response convertFtoC() throws JSONException {
		FamousPeopleMock mock = new FamousPeopleMock();
		return Response.status(200).entity(mock.getJsonObject()).build();
	}

	@Path("{f}")
	@GET
	@Produces("application/json")
	public Response convertFtoCfromInput(@PathParam("f") float f) throws JSONException {
		FamousPeopleMock mock = new FamousPeopleMock();
		return Response.status(200).entity(mock.getJsonObject()).build();
	}
}