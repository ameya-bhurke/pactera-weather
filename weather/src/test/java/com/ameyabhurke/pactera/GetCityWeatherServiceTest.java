package com.ameyabhurke.pactera;

import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GetCityWeatherServiceTest {

	@Test
	public void test() {
		GetCityWeatherServiceResponse response = (GetCityWeatherServiceResponse)
				new GetCityWeatherService().service(
						new GetCityWeatherServiceRequest("Sydney"));
		assertNotNull(response.getJsonResponse());
		assertTrue(response.getJsonResponse().contains("weather"));
	}

}
