package yuvaraj.practice.Practices.BankAccApp;

public class Checking extends Accounts {
	private int debitCardNumber;
	private int debitCardPIN;
	public Checking(String name,String sSN,double initDeposit) {
		// TODO Auto-generated constructor stub
		super( name, sSN, initDeposit);
		accountNUmber="2"+accountNUmber;
		

		//System.out.print("New Checking Account Number: ");
		//System.out.println(this.accountNUmber);
		//System.out.println("New Checking Account ");
		setDebitCard();
	}
	private void setDebitCard() {
		// TODO Auto-generated method stub
		debitCardNumber=(int)(Math.random()* Math.pow(12, 14));
		debitCardPIN=(int)(Math.random()* Math.pow(10, 4));
	}
	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		System.out.println("Implments the Interest Rate");
		rate=getRate() +0.15;
		
	}
	
	public void showINfo() {
		super.showINfo();
		
		
		System.out.println("Account Type: Checking");
		System.out.println("Your Checking Account Feature: "
		
				+"\nDebit Card Number: "+debitCardNumber+
				"\nDebit Card PIN: "+debitCardPIN
				);
	}
	//List of  properties of  checking account
		//constructor to intialize base properties
		//list checking methods
}
