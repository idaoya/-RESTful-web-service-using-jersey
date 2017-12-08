package com.tm.restjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;

@Path("/ftocservice")
public class FtoCService {

	@GET
	@Produces("application/json")
	public Response convertFtoC() throws JSONException {

		JSONObject jsonObject = new JSONObject();
		Double fahrenheit = 0.0d;
		Double celsius;
		celsius = (fahrenheit - 32) * 5 / 9;
		jsonObject.put("Fahrenheit = ", fahrenheit);
		jsonObject.put("Celsius = ", celsius);

		String result = "Fahrenheit to Celsius : " + jsonObject;
		return Response.status(300).entity(result).build();
	}

	@Path("{f}")
	@GET
	@Produces("application/json")
	public Response convertFtoCfromInput(@PathParam("f") Double f) throws JSONException {

		JSONObject jsonObject = new JSONObject();
		Double celsius;
		celsius = (f - 32) * 5 / 9;
		jsonObject.put("Fahrenheit ", f);
		jsonObject.put("Celsius ", celsius);

		String result = "Fahrenheit to Celsius : " + jsonObject;
		return Response.status(300).entity(result).build();
	}
}