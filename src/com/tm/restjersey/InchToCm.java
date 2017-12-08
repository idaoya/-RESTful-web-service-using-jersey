package com.tm.restjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;

@Path("/intocmservice")
public class InchToCm {

	@GET
	@Produces("application/json")
	public Response convertInchToCm() throws JSONException {

		JSONObject jsonObject = new JSONObject();
		Double in = 0.0d;
		Double cm;
		cm = in * 2.54;
		jsonObject.put("in  = ", in);
		jsonObject.put("cm = ", cm);

		String result = "Inches  to Centimeters : " + jsonObject;
		return Response.status(300).entity(result).build();
	}

	@Path("{f}")
	@GET
	@Produces("application/json")
	public Response convertInchToCmfromInput(@PathParam("f") Double in) throws JSONException {

		JSONObject jsonObject = new JSONObject();
		Double cm;
		cm = in * 2.54;
		jsonObject.put("Inches ", in);
		jsonObject.put("Centimeters ", cm);

		String result = "Inches to Centimeters : " + jsonObject;
		return Response.status(300).entity(result).build();
	}
}
