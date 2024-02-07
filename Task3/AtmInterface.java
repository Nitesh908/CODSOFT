package Task3;

import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

class ATM {
    private BankAccount bankAccount;

    public ATM(BankAccount account) {
        bankAccount = account;
    }

    public void displayOptions() {
        System.out.println("Welcome to the ATM");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void processOption(int option) {
        Scanner scanner = new Scanner(System.in);
        double amount;

        switch (option) {
            case 1:
                System.out.print("Enter amount to withdraw: ");
                amount = scanner.nextDouble();
                if (bankAccount.withdraw(amount)) {
                    System.out.println("Withdrawal successful.");
                } else {
                    System.out.println("Insufficient balance.");
                }
                break;
            case 2:
                System.out.print("Enter amount to deposit: ");
                amount = scanner.nextDouble();
                bankAccount.deposit(amount);
                System.out.println("Deposit successful.");
                break;
            case 3:
                System.out.println("Your balance is: " + bankAccount.getBalance());
                break;
            case 4:
                System.out.println("Thank you for using the ATM.");
                System.exit(0);
            default:
                System.out.println("Invalid option.");
        }
    }
}




public class AtmInterface {

	
	
	 public static void main(String[] args) {
	        BankAccount account = new BankAccount(1000); // WE have set a  Initial balance
	        ATM atm = new ATM(account);
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            atm.displayOptions();
	            System.out.print("Enter your choice: ");
	            int option = sc.nextInt();
	            atm.processOption(option);
	        }
	    }
	
	
	
	
	
	
}
