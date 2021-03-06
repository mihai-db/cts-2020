package ro.ase.csie.cts.g1092.seminar1;

import ro.ase.csie.cts.g1092.seminar1.exceptions.InsufficientFundsException;

public class CurrentAccount extends BankAccount {
	
	public static final double MAX_CREDIT = 5000;

	public CurrentAccount(String iban) {
		super(iban, MAX_CREDIT);
	}

	@Override
	public void deposit(double amount) {
		this.balance += amount;
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(amount <= this.balance)
			this.balance -= amount;
		else
			throw new InsufficientFundsException();
	}

	@Override
	public void transfer(double amount, Account destination) {
		// TODO Auto-generated method stub
		
	}

}
