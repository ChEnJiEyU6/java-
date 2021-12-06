package 实验;

import 实验.*;
public class TestBanking {
	public static void main(String[] args) {
		Customer customer;
		Account account;
		System.out.println("Creating the customer Jane Smith.");
		customer = new Customer("Jane", "Smith", 26);
		System.out.println("Creating her account with a 500.00 balance.");
		customer.setAccount(new Account(500.00));
		account = customer.getAccount();
		System.out.println("Withdraw 150.00:" + account.withdraw(150.00));
		System.out.println("Deposit 22.50:" + account.deposit(22.50));
		System.out.println("Withdraw 47.62:" + account.withdraw(47.62));
		System.out.println("Withdraw 400.00:" + account.withdraw(400.00));
		System.out.println("Customer[" + customer.getLastName() + ","+customer.getFirstName() + ","+customer.getage()+"]has a balance of " + account.getBalance());
        Customer cus = new Customer(28);
        System.out.println("修改后的年龄为:"+cus.age());
        
		
		}
 
}

