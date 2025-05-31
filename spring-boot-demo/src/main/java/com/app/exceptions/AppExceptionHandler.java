package com.app.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler
{

	@ExceptionHandler(value = {NullPointerException.class} )
	public ResponseEntity<Object> handleAnyException(NullPointerException ex, WebRequest request)
	{
//		String msg = ex.getMessage();
		//return new ResponseEntity<Object>("Error", HttpStatus.INTERNAL_SERVER_ERROR,);
		return handleExceptionInternal(ex, "ERROR", new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
	}
		
}
