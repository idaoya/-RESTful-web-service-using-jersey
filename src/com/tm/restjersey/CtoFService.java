package com.tm.restjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/ctofservice")
public class CtoFService {
	@GET
	@Produces("application/xml")
	public String convertCtoF() {

		Double fahrenheit;
		Double celsius = 0.0d;
		fahrenheit = ((celsius * 9) / 5) + 32;

		String result = "Celsius to Fahrenheit : " + fahrenheit;
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>"
				+ "</ctofservice>";
	}

	@Path("{c}")
	@GET
	@Produces("application/xml")
	public String convertCtoFfromInput(@PathParam("c") Double c) {
		Double fahrenheit;
		Double celsius = c;
		fahrenheit = ((celsius * 9) / 5) + 32;

		String result = "Celsius to Fahrenheit : " + fahrenheit;
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>"
				+ "</ctofservice>";
	}
}
