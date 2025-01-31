package atm;

import java.util.Scanner;

public class UserInterface {
	private static int status;
	public static void main(String[] args) {
		AtmOperationimpl impl = new AtmOperationimpl ();
		Scanner scan=new Scanner(System.in);
		int atmnumber=123456;
		int atmpin=123;
		System.out.println("WELCOME ATM MACHINE");
		System.out.println("ENTER THE ATM NUMBER ");
		int atmnum2=scan.nextInt();
		System.out.println("ENTER THE ATM PIN");
		int atmpin2=scan.nextInt();
		if(atmnumber==atmnum2 && atmpin==atmpin2) {
			while(true) {
		System.out.println(" 1.viewAvailabe\n 2.withdrawAmount\n 3.depositAmount\n 4.viewMinistatement\n 5.exit");
			System.out.println("enter the choice: ");
			int ch=scan.nextInt();
			if(ch==1) {
				impl.viewBlance();
			}
			else if(ch==2) {
				System.out.println("enter the amount to withdraw");
				double withdrawAmount = scan.nextDouble();
				impl.withdrawAmount(withdrawAmount);
			}
			else if(ch==3) {
				System.out.println("Enter the amount to deposit");
				double depositAmount = scan.nextDouble();
				impl.depositAmount(depositAmount);
			}
			else if(ch==4) {
				impl.viewMinistatement();
			}
			else if(ch==5) {
				System.out.println("REMOVE YOUR ATM CARD\n Thank you");
				System.exit(status);
			}
			}
		}
		else {
			System.out.println("INCORRECT ATMNUMBER OR PIN");
		}
	}

}
