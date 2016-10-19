package com.ssdk.services.rest;

import java.io.IOException;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.pdfbox.exceptions.COSVisitorException;

@Path("/messaging")
public class ServiceMessages {

//	    @Inject
//	    ServiceWorkOrder serviceWorkOrder = new HelloService();

	    @POST
	    @Path("/send/{profileID}/{destProfileID}")
	    @Produces({ "application/json" })
	    public JsonObject sendMessageToProfileID(@PathParam("profileID") String profileID,
	    		                                 @PathParam("destProfileID") String destProfileID) throws IOException, COSVisitorException {
	    	
	    	return Json.createObjectBuilder()
	                .add("result", "send" )
	                .add("profileID", profileID)
	                .add("destProfileID", destProfileID)	                
	                .build();
	    }
	    
	    
	    @GET
	    @Path("/get/{profileID}/{destProfileID}")
	    @Produces({ "application/json" })
	    public JsonObject getMessagesFromProfileID(@PathParam("profileID") String profileID,
                                                   @PathParam("destProfileID") String destProfileID) throws IOException, COSVisitorException {
	    	
	    	return Json.createObjectBuilder()
	                .add("result", "get" )
	                .add("profileID", profileID)
	                .add("destProfileID", destProfileID)
	                .build();
	    }
	    
	    @GET
	    @Path("/getAll/{profileID}/{destProfileID}")
	    @Produces({ "application/json" })
	    public JsonObject getAllMessagesFromProfileID(@PathParam("profileID") String profileID,
                                                      @PathParam("destProfileID") String destProfileID) throws IOException, COSVisitorException {
	    	
	    	return Json.createObjectBuilder()
	                .add("result", "getAll" )
	                .add("profileID", profileID)
	                .add("destProfileID", destProfileID)
	                .build();
	    }
}
