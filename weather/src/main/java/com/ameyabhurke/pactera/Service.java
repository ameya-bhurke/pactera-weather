package com.ameyabhurke.pactera;

/**
 * 
 * A service interface. Implementating classes should perform
 * some sort of service.
 * 
 * @see ServiceRequest
 * @see ServiceResponse
 * 
 * @author Ameya Bhurke
 *
 */
public interface Service {

	
	public ServiceResponse service(ServiceRequest request);
}
