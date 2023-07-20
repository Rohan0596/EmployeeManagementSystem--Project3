package com.rohan.employee_management_system.exceptions;

public class InvalidSalaryException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage()
{
	return "Salary cannot contain alphabet and special characters";
}
}
