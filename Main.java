package casestudy;

import java.util.Scanner;

public class Main {

	public static void main(String []args) {
		
	Scanner scanner = new Scanner(System.in);
	Store.menu();
		int num=1;
		while(num==1) {
			System.out.println("Enter your input");
			int i = scanner.nextInt();
             num=0;
		switch(i) {
		case 1:
			Store.add();
	
			break;
		case 2:
			Store.view();
			
			break;
		case 3:
			Store.modify();
			break;
		case 4:
			Store.remove();
			break;
		case 5:
		    Store.search();
		    break;
		case 6:
		    Store.exit();
		    break;
		}
		System.out.println("enter 1 to continue");
		Store.menu();
		num = scanner.nextInt();

			
		}
	}
}
