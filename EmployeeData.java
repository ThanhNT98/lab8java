package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeData {
	ArrayList empList=new ArrayList();
	void addEmployee() {
		String name, address, code;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee code: ");
		code=sc.nextLine();
		System.out.println("Enter the name: ");
		name=sc.nextLine();
		System.out.println("Enter the address: ");
		address=sc.nextLine();
		EmployeeDetail emp=new EmployeeDetail(code.toUpperCase(),name,address);
		empList.add(emp);
	}
	
	void removeEmployee() {
		String searchCode;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee code: ");
		searchCode=sc.nextLine();
		for(Object obj:empList) {
			EmployeeDetail emp=(EmployeeDetail)obj;
			if(emp.empCode.equals(searchCode.toUpperCase())){
				empList.remove(emp);
				System.out.println("Employee Code "+searchCode+" was removed!");
				return;
			}
		}
		System.out.println("Employee not found!");
	}
	
	void findEmployee() {
		String searchCode;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee code: ");
		searchCode=sc.nextLine();
		for(Object obj:empList) {
			EmployeeDetail emp=(EmployeeDetail)obj;
			if(emp.empCode.equals(searchCode.toUpperCase())) {
				System.out.println("Employee details: ");
				System.out.println(emp);
				return;
				
			}
		}
		System.out.println("Empolyee not found!");
	}
	void printEmployeeList() {
		int i=0;
		System.out.println("The size of list = "+empList.size());
		for(Object emp:empList) {
			System.out.printf("------------Number %d-------------",++i);
			System.out.println(emp);
		}
	}
	
}
