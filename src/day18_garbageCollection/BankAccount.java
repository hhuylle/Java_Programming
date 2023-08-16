package day18_garbageCollection;

public class BankAccount {
    /*
    Create a custom class named BankAccount:
			Attributes:
				1. accountHolder
				2. accountNumber
				3. balance

			Actions:
				1. setInfo(): sets the accountHolder and accountNumber attributes
		            	2. toString(): displays the full account info
		                3. checkBalance():displays the available balance
		                4. deposit(amount): increases the balance by the specified amount
		        	5. withdraw(amount): decreases the balance by the specified amount
     */

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balance is: $" + balance);
        if (balance<10 || balance>=0){
            System.err.println("Your balance is too low, please keep your balance higher than 10! Please call or contact with any local closest Bank for more Information");
        }
    }

    public void deposit(double amount){
        if (amount<0){
            System.out.println("Insufficient deposit amount: " + amount);
            return;
        }
        System.out.println("Depositing is $" + amount + " to " + accountHolder);
        balance += amount;
    }

    public void withdraw(double amount){
        if (amount>balance){
            System.out.println("Insufficient withdraw amount: " + amount);
            return;
        }

        System.out.println("Withdrawing is $" + amount + " from " + accountHolder);
        balance -= amount;
    }



}
