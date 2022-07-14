package yuvaraj.practice.Practices.BankAccApp;

public class Savings extends Accounts{
	private int safetyDepositBox;
	private int safetyDepositKey;
	public Savings(String name,String sSN,double initDeposit) {
		// TODO Auto-generated constructor stub
		super( name, sSN, initDeposit);
		accountNUmber="1"+accountNUmber;
		setSafetyDepositBOX();
		//System.out.print("New Savings Account Number: ");
		//System.out.println(this.accountNUmber);
		//System.out.println("New Savings Account ");
		
	}
	private void setSafetyDepositBOX() {
		// TODO Auto-generated method stub
		safetyDepositBox=(int)(Math.random()*Math.pow(10, 3));
		safetyDepositKey=(int)(Math.random()*Math.pow(10, 3));
		
	}
	public void showINfo() {
		super.showINfo();
		System.out.println("Account Type: Savings");
		System.out.println(
				"Your Savings Account Feature\n"+
		"Safety Box ID: "+safetyDepositBox+
		"\nSafety Box Key: "+safetyDepositKey
				);
		
	}
	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		System.out.println("Implments the Interest Rate");
		rate=getRate() -0.25;
		
	}
	
	//List of  properties of Savings a account
		//constructor to intialize base properties
		//list savings methods
}
