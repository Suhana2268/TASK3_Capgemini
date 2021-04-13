package Demo;

public class BankAccount {
	private String accountHolderName;
	private int balance;
	private boolean status;
	private String accountStatus;

	
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
		
	}
	
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	
	
	
	public int doWithdrawl(int amount) {
		if(amount > balance || balance < 10000) {
			status = false;
			balance = balance; // return balance
		}
		else {
			if(balance > 10000) {
				status = true;
				balance = balance-amount;
			}
		}
		return balance;
	}
	public int doDeposit(String choice, int amount) {
		if(choice.equals("Yes") || choice.equals("yes")||choice.equals("y")) {
			balance = balance+amount;
			if(balance > 10000)
				status = true;
			else
				status = false;
		}
		
		else {
			if(choice.equals("No") || choice.equals("no")||choice.equals("n"))
				return balance;
			
		}
		return balance;
	}
	public String accountStatus()
	{
		if(status == false) {
			return "inactive";
		}
		return "active";
	}
	
	
}
