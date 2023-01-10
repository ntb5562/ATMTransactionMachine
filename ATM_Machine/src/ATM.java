
import java.text.DecimalFormat;
import java.util.Scanner;

public class ATM {
	public static double deposit(double dep, double balance) {
		
			balance = balance + dep;
			return balance;
		
	}
	public static double withdraw(double w, double balance) {
		
		balance = balance - w;
		return balance;
	}
	public static void atm() {
		int select;
		double balance = 0;
		DecimalFormat f = new DecimalFormat("#0.00");
		do{
			Scanner input = new Scanner(System.in);
			System.out.printf("1. View your Balance%n2. Deposit Cash%n3. Withdraw Cash%n4. Exit%n");
			System.out.println("Enter your selection");
			select = input.nextInt();
			if (select > 4 || select < 1){
				System.out.println("Invalid input");
			}
			if(select==1) {
				//balance = balance;
				System.out.println("Your balance is: " + f.format(balance));
			}else if(select==2) {
				System.out.println("enter an amount to deposit");
				double deposit = input.nextDouble();
				if (deposit <0) {
					System.out.println("you must enter a positive amount to deposit");
					//deposit = input.nextDouble();
				}else {
					balance = deposit(deposit,balance);
				}
				
			}else if (select == 3) {
				System.out.println("Enter the amount you want to withdraw: ");
				double withdraw = input.nextDouble();
				if (withdraw>balance) {
					System.out.println("Sorry you don't have enough balance!");
					//withdraw=input.nextDouble();
				}else {
					balance = withdraw(withdraw,balance);
				}
				
			}
			
		}while(select!=4);
		if (select == 4) {
			System.out.println("Goodbye");
		}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		atm();
	}

}
