package com.cg.hotel_service.exception;

public class ResourceNotFoundException extends RuntimeException{
	
	public ResourceNotFoundException() {
		
		super("Hotel with the given Id not on the server, please enter an existing Id");
		
	}
	
	public ResourceNotFoundException(String message) {
		
		super(message);
	}

}
