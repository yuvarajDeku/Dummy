package yuvaraj.practice.Practices.BankAccApp;

import java.util.LinkedList;
import java.util.List;

public class bankAccountApp {

	public static void main(String args[]) {
		List<Accounts> account=new LinkedList<>();
		String file = "C:\\Users\\yuvaraj\\Documents\\Reader.csv";
		System.out.println("Welcome to NEW BANK of YUVARAJ");
		System.out.println();
		//Checking chac1 = new Checking("yuvaraj Loganathan", "345671234", 1500);
	//	Savings saac1 = new Savings("Kanimozhi Loganathan", "435674356", 200);

		// Read CSV File contain account holders
		List<String[]> newAccountholders = utilities.CSV.read(file);
		System.out.println("New Account Holders");
		for (String[] newAccountholder : newAccountholders) {
			String name = newAccountholder[0];
			String sSN = newAccountholder[1];
			String accountNUmber=newAccountholder[2];
String accountType=newAccountholder[3];
double initDeposit=Double.parseDouble(newAccountholder[4]);
System.out.println(name+" "+sSN+" "+accountType+" "+initDeposit+"$");
if(accountType.equals("savings")) {
	account.add(new Savings(name,sSN,initDeposit));
}else if(accountType.equals("checking")) {
	account.add(new Checking(name,sSN,initDeposit));
}else System.out.println("Error in Reading Account Type");


		}for(Accounts acc:account) {
			System.out.println("\n*********");
			acc.showINfo();
	}
	
		
	}
}

/*
 * saac1.showINfo(); System.out.println(); System.out.println("***********");
 * System.out.println();
 * 
 * chac1.showINfo(); System.out.println(); System.out.println("***********");
 * System.out.println(); System.out.println("Transaction Details: ");
 * saac1.deposit(5000); saac1.withdraw(400); saac1.transfer("Yuvaraj", 700);
 * saac1.compound(); chac1.compound();
 */