package yuvaraj.practice.Practices.BankAccApp;

public abstract class Accounts implements InterestRates{
//List of Common properties of Savings and checking account
	//constructor to set base properties
	//list common methods
	
	private String name;
	private String sSN;
	
	protected String accountNUmber;
	private double balance;
	protected double rate;
	private static int index=10000;
	
	public Accounts(String name,String sSN,double initDeposit) {
		this.name=name;
		this.sSN=sSN;
		this.balance=initDeposit;
		//System.out.println("Customer Name: "+name+" "+ "SSN: "+sSN+" "+"Deposit Balance: "+initDeposit+"0Cr");
	index++;
		this.accountNUmber=setAccountNumber();
	
	}
	
	
	public  abstract void setRate();
	
	String setAccountNumber() {
		String lastTwoSSN=sSN.substring(sSN.length()-2,sSN.length());
		int uniqueID=index;
		int random=(int) (Math.random()*Math.pow(10, 3));
		return lastTwoSSN+uniqueID+random;
	}
	//Transaction Methods
	
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Deposted Amount is :"+amount+"$");
		printBalance();
	}
public void withdraw(double amount) {
	balance=balance-amount;
	System.out.println("Withdrawn Amount is :"+amount+"$");
	printBalance();
	}
public void transfer(String toWhere,double amount) {
	balance=balance-amount;
	System.out.println("Transfer Amount is "+amount+"$"+ " "+"To Account "+toWhere);
	printBalance();
}
public void compound() {
	double AccuInterst=balance*(rate/100);
	balance=balance+AccuInterst;
	System.out.println("Compund Interest:"+AccuInterst);
}
public void printBalance() {
	System.out.println("Your Balance is :"+balance+"$");
}
	public void showINfo() {
		setRate();
		System.out.println(
				"Name of Customer: "+name+
				"\nAccount Number: "+accountNUmber+
				"\nAccount Balance: "+balance+"$"+
				"\nImplements the Interest Rate: "+rate+"%"
				);
	}
}
