/**
 * 
 */
package com.sample.rest.user.registration.interceptor;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import com.sample.user.service.exception.ServiceNotFoundException;

/**
 * @author maruthishanmugam
 *
 */
public class RestExceptionMapper implements ExceptionMapper<Exception> {

	@Override
	public Response toResponse(Exception exception) {
		
		if(exception instanceof ServiceNotFoundException)
		{
			return Response.status(Response.Status.NOT_FOUND).build();
		}else{
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
		
		// TODO Auto-generated method stub
		
	}

}
