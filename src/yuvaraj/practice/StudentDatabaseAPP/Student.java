package yuvaraj.practice.StudentDatabaseAPP;

import java.util.Scanner;

public class Student {
private String firstName;
private String lastName;
private int gradeYear;
private String studentID;
private String courses="";
private static int courseFee=600;
private int Balance=0;;
private static int id=1000;
//Constructor
public Student() {
	Scanner ni=new Scanner(System.in);
	System.out.println("Enter the FirstName of the Student");
	this.firstName=ni.nextLine();
	System.out.println("Enter the LastName of the Student");
	this.lastName=ni.nextLine();
	System.out.println("Enter the GradeYear of the Student");
	System.out.println("1.Elementry \n2. Secondary \n3.Higher ");
	this.gradeYear=ni.nextInt();
	setStudentID();
	//System.out.println("Student Name is "+firstName + lastName+ "\nStudent Grade is "+gradeYear+"\nStudentID is "+studentID);
	
}
//Generate Student ID
private  void setStudentID() {
	id++;
	this.studentID= gradeYear+""+id;
}
//Get Enrolled Courses

public void enroll() {
	do {
		System.out.print("Enter the Courses to Enroll(Q to Quit)");
	Scanner ne=new Scanner(System.in);
	String course=ne.nextLine();
	if(!course.equalsIgnoreCase("Q")) {
		courses=courses+"\n "+course;
		Balance=Balance+courseFee;
	}else {
		
		break;}
	}while(1!=0) ;
		//System.out.println("Enrolled in : "+courses);
		//System.out.println("Total Course Fee: "+Balance);
	}
	//View Balance
public void viewBalance() {
	System.out.println("Your Balance is "+Balance);
}

//AfterPayment
public void Payment()
{
	
	if(Balance!=0) {
		viewBalance();
	System.out.println("Enter the Payment");
	Scanner sc=new Scanner(System.in);
	int payment=sc.nextInt();
	Balance=Balance-payment;
	System.out.println("Thanks for the Payment "+payment);
	//viewBalance();
}
	else System.out.println("Course Entrolled is 0");}

//Show info
public String showInfo() {
	return "Name :"+firstName+lastName+
			"\nStudentID is :"+studentID+
			"\nGrade Level :"+gradeYear+
			
			"\nCourses :"+courses+
			"\nBalance :"+Balance;
	
}
}

