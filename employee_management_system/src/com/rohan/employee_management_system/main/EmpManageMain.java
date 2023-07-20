package com.rohan.employee_management_system.main;

import java.util.Scanner;

import com.rohan.employee_management_system.employee.Employee;
import com.rohan.employee_management_system.exceptions.InvalidIdException;
import com.rohan.employee_management_system.exceptions.InvalidNameException;
import com.rohan.employee_management_system.exceptions.InvalidSalaryException;

public class EmpManageMain {

	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("How many Employees: ");
		int count = inp.nextInt();
		inp.nextLine();
		Employee [] empArr = new Employee[count];
        System.out.println("Enter the details: ");
		for (int i = 0;i<empArr.length;i++  )
		{
			System.out.println("Enter the name: ");
			String name = inp.next();
			System.out.println("Enter Id: ");
	        String id = inp.next();
			System.out.println("Enter Salary: ");
			double salary = inp.nextDouble();
			try
			{
				empArr[i] = new Employee(name,id,salary);
                System.out.println("Employee added...");
			}
			catch (InvalidNameException e)
			{
				System.out.println(e.getMessage());
				System.out.println("Employee was not added");
				i--;
			}
			catch (InvalidIdException e)
			{
				System.out.println(e.getMessage());
				System.out.println("Employee was not added");
				i--;
			}
			catch (InvalidSalaryException e)
			{
				System.out.println(e.getMessage());
				System.out.println("Employee was not added");
				i--;
			}
		}
		
//        System.out.println("Employee added...");
		for (Employee e1 : empArr )
		{
			System.out.println(e1);
		}
		inp.close();
	}
}
