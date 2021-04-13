package Demo;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount();
		BankAccount b3 = new BankAccount();
		Scanner sc = new Scanner(System.in);
		
		b1.setAccountHolderName("Sameera");
		b1.setBalance(1000);
		b1.doWithdrawl(2000);
		System.out.println(b1.getAccountHolderName()+" "+b1.getBalance()+" "+b1.accountStatus());
		System.out.println("Do you want to deposit money? Yes/No");
		String str = sc.next();
		int amount = sc.nextInt();
		b1.doDeposit(str, amount);
		System.out.println(b1.getAccountHolderName()+" Balance- "+b1.getBalance()+" The account status is: "+b1.accountStatus());
		
		
		b2.setAccountHolderName("Rishi");
		b2.setBalance(20000);
		b2.doWithdrawl(1000);
		System.out.println(b2.getAccountHolderName()+" "+b2.getBalance()+" "+b2.accountStatus());
		System.out.println("Do you want to deposit money? Yes/No");
		String str1 = sc.next();
		int amount1 = sc.nextInt();
		b1.doDeposit(str1, amount1);
		System.out.println(b2.getAccountHolderName()+" Balance- "+b2.getBalance()+" The account status is: "+b2.accountStatus());
		
		
		b3.setAccountHolderName("Sania");
		b3.setBalance(100);
		b2.doWithdrawl(100);
		System.out.println(b3.getAccountHolderName()+" "+b3.getBalance()+" "+b3.accountStatus());
		System.out.println("Do you want to deposit money? Yes/No");
		String str2 = sc.next();
		int amount2 = sc.nextInt();
		b1.doDeposit(str2, amount2);
		System.out.println(b3.getAccountHolderName()+" Balance- "+b3.getBalance()+" The account status is: "+b3.accountStatus());
		

	}

}
