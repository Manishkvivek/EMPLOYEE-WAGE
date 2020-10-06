package src.codewithvivek;

import java.util.Scanner;

public class EmployeeWage {
	public static void main(String[] args) {
		
	
System.out.println("Welcome to Employee Wage Computation program");
System.out.println(""
		
		+ ""
		+ ""
		+ "");
System.out.println("Here we go;");
System.out.println(""
		+ ""
		+ ""
		+ "");



Scanner sc= new Scanner(System.in);

String name = "EMPLOYEE NAME is --";
System.out.println(name);

int Attendance= (int)(Math.random()*1);

System.out.println("ATTENDANCE = "+Attendance);
System.out.println("IF ATTENDANCE = 1 , then PRESENT"
		+ " otherwise if ATTENDANCE = 0 , then absent");

double wageperhour= 300;
System.out.println("WAGE PER HOUR = 300");
System.out.println("FULL TIME = 8 hrs");
System.out.println("PART TIME = 4 HRS");

double workinghour= (double)(Math.random()*8);
System.out.println("WORKING HOUR OF EMOLOYEE  : "+workinghour);

double wageearnedinaday= wageperhour*workinghour ;
System.out.println("WAGE EARNED IN A DAY = "+wageearnedinaday);
System.out.println(""
		+ ""
		+ ""
		+ "");
System.out.println("TOTAL WAGE EARNED IN A MONTH = sum of wage of all working days");

















}
}