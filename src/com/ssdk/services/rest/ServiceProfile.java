package com.ssdk.services.rest;

import java.io.IOException;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.apache.pdfbox.exceptions.COSVisitorException;

@Path("/profile")
public class ServiceProfile {

//	    @Inject
//	    ServiceWorkOrder serviceWorkOrder = new HelloService();

	    @GET
	    @Path("/create")
	    @Produces({ "application/json" })
	    public JsonObject createProfile() throws IOException, COSVisitorException {
	    	
	    	return Json.createObjectBuilder()
	                .add("result", "create" )
	                .build();
	    }
	    
	    @GET
	    @Path("/modify")
	    @Produces({ "application/json" })
	    public JsonObject modifyProfile() throws IOException, COSVisitorException {
	    	
	    	return Json.createObjectBuilder()
	                .add("result", "modify" )
	                .build();
	    }
	    
	    @GET
	    @Path("/delete")
	    @Produces({ "application/json" })
	    public JsonObject deleteProfile() throws IOException, COSVisitorException {
	    	
	    	return Json.createObjectBuilder()
	                .add("result", "delete" )
	                .build();
	    }
}
