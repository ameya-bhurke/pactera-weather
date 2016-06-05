package com.ameyabhurke.pactera;

import static org.junit.Assert.*;

import org.junit.Test;

public class GetAllCityServiceTest {

	@Test
	public void testGetAllCityService() {
		GetAllCityServiceResponse response = (GetAllCityServiceResponse)new GetAllCityService().service(new ServiceRequest() {
			}) ; 
		// Test that there is a response
		assertTrue(response.getResponse() != null);
		//Test that the number of cities loaded are more than 1 atleast.
		// we can safely assume that length greater than 5 would
		// qualify that the response has atleast one city loaded.
		assertTrue(response.getResponse().length() > 5);
	}

}
