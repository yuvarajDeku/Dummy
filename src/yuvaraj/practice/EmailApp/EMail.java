package yuvaraj.practice.EmailApp;

import java.util.Random;
import java.util.Scanner;

public class EMail {

	private String firstName;
	private String lastName;
	private String department;
	private int mailboxCapacity=300;
	private String Password;
	private String companyname="Prudential.com";
	private int passlength=8;
	private String alternateEmail;
	public EMail(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Details Created for Employee: "+ this.firstName+" "+this.lastName);
	
		//Call method asking for department and returning the department
		this.department=setDepartment();
		//System.out.println("Department of Employee: "+ this.department);
	//System.out.println(this.firstName+"."+this.lastName+"@"+ this.department+".Pru.in");
	//Call method to return Random Password
		this.Password=rpass(passlength);
		System.out.println("Employee Password is: "+ this.Password);
		
	}
		//Adding random number in mail
	//	Random randomGenerator=new Random();
        
       // System.out.println(randomGenerator.nextInt(10));
		//Combine all to create EMAIL
		//String email = firstName.toLowerCase()+lastName.toLowerCase()+randomGenerator.nextInt(10)+"@"+department +"."+companyname;
		//String email = firstName.toLowerCase()+lastName.toLowerCase()+"@"+department +"."+companyname;
		
	//System.out.println(email);}
	
	
	



	//Constructor to Receive First and Last name
	private String setDepartment() {
		System.out.println("New Hire Departmenal Codes: \n1 for Sales\n2 for Marketing\n3 for Technology\n0 for None \n Enter the Codes");
		Scanner in =new Scanner(System.in);
		int DeptChoice=in.nextInt();
		if(DeptChoice==1) {return "Sales";}
		else if(DeptChoice==2) return "Marketing";
		else if(DeptChoice==3) return "Technology";
else  return "";

	}

	//Generate Random password
	
	private String rpass(int length) {
		String passset="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random()*passset.length());
			password[i]=passset.charAt(rand);
			//System.out.println(rand);
			//System.out.println(passset.charAt(rand));
		}
		return new String (password);
	}
	
	

	//set mailbox capacity
	

	public void setMailboxcapacity(int capcity) {
		this.mailboxCapacity = capcity;
		}
	//set alternate mail
	public void SetAlternateEMail(String mail) {
		this.alternateEmail = mail;
	}
	
	//change password
	public void ChangePassword(String passw) {
		this.Password=passw;
	}
	
	//Get method
	public int MailBoxCapacity() {return mailboxCapacity;}
	public String AlternateMail() {return alternateEmail;}
	public String Changepassw0rd() {return Password;}
	
	
	//Show info or Display
	
	public String ShowInfo() {
		String email = firstName.toLowerCase()+lastName.toLowerCase()+"@"+department +"."+companyname;
		
		
		return "Display Name: " +firstName+ " "+lastName+
				"\nCompany Email: " + email +"\n"+
				"Mailbox Capcity: "+mailboxCapacity+"mb";
				
		
	}
}
