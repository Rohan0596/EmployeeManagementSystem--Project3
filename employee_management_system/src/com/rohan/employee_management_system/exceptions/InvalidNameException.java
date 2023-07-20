package com.rohan.employee_management_system.exceptions;

public class InvalidNameException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage()
{
	return "Name cannot start with number or special character";
}
}
