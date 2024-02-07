package Task2;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks Subject1");
		
		int subject1= sc.nextInt();
		
		System.out.println("Enter the marks Subject2");
		int subject2= sc.nextInt();
		
		System.out.println("Enter the marks Subject3");
		int subject3= sc.nextInt();
		
		int Total_Marks= subject1+subject2+subject3;
		
		
		double percentage = (Total_Marks*100)/300;
		
		
		
		char grade;
		
		if(percentage>=90) {
			
			grade='A';
		} else if(percentage>=80) {
			grade='B';
			
		} else if(percentage>=70) {
			
			grade='C';
		}else if(percentage>=60) {
			
			grade='D';
		}else  {
			grade='E';
		}
		System.out.println("Toal marks"+Total_Marks);
		System.out.println("Toatal Percentage= "+percentage);
		System.out.println("Grade "+ grade);
		
	}

}
