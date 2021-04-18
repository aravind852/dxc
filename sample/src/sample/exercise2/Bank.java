package sample.exercise2;

public class Bank {
	int getbalance() {
	return 0;	
	}
	
public static void main(String args[])
{
	Bank b=new Bank();
	BankA ba=new BankA();
	BankB bb=new BankB();
	BankC bc=new BankC();
	System.out.println("Deposited in A:"+ba.getbalance());
	System.out.println("Deposited in B:"+bb.getbalance());
	System.out.println("Deposited in C:"+bc.getbalance());
}
}
