package com.rohan.employee_management_system.exceptions;

public class InvalidIdException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage()
{
	return "Id cannot contain special characters";
}
}
