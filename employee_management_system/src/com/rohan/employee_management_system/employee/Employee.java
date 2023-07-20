package com.rohan.employee_management_system.employee;

import com.rohan.employee_management_system.exceptions.InvalidIdException;
import com.rohan.employee_management_system.exceptions.InvalidNameException;
import com.rohan.employee_management_system.exceptions.InvalidSalaryException;

public class Employee {

    public void compareTo(Employee otherEmployee) {
       
    }
    
	String name;
	String id;
	double salary;
	public Employee(String name, String id, double salary) throws InvalidNameException, InvalidIdException, InvalidSalaryException
	{
		if (name.charAt(0)>=97 && name.charAt(0)<=122 || name.charAt(0)>=65 && name.charAt(0)<=90)
		{
			this.name = name;
		}
		else 
		{
			throw new InvalidNameException ();
		}
		this.id=id;
		this.salary=salary;
		
	}
	 @Override
	    public String toString() {
	        // Create a custom string representation of the Employee object
	        return "Employee [Name: " + name + ", ID: " + id + ", Salary: " + salary + "]";
	    }
}
