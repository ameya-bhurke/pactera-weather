package com.ameyabhurke.pactera;

import static org.junit.Assert.*;

import org.junit.Test;

public class CitiesDAOTest {

	@Test
	public void testLoadOnStartup() {
		CitiesDAO citiesDAO = CitiesDAO.getInstance();
		assertTrue(citiesDAO.read().size() > 0);
	}

}
