package com.demo.fds.exception;

public class OrderDetailsFoundException  extends RuntimeException{
	

	public OrderDetailsFoundException() {
		super();
		
	}

	public OrderDetailsFoundException(String message) {
		super(message);
		
	}

	public OrderDetailsFoundException(Throwable cause) {
		super(cause);
		
	}

}
