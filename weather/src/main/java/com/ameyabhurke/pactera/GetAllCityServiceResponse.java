package com.ameyabhurke.pactera;

/**
 * 
 * Gets all cities in a JSON array.
 * 
 * @author Ameya Bhurke
 *
 */
public class GetAllCityServiceResponse implements ServiceResponse {

	private final String jsonResponse;
	
	public GetAllCityServiceResponse(String response) {
		this.jsonResponse = response;
	}
	
	public String getResponse() {
		return this.jsonResponse;
	}
}
