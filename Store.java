package casestudy;

import java.util.ArrayList;
import java.util.Scanner;


public class Store {
	static Scanner scanner = new Scanner(System.in);
	static ArrayList list = new ArrayList();
	
	public static void add() {
	
	System.out.println("Enternumber of item to add ");
	int n = scanner.nextInt();
	System.out.println("Enter the Product Name");
	for(int i=0;i<n;i++) {
	list.add(scanner.next());
	}
	System.out.println("*****Adding is Done******");
}
	public static void view() {
		for(int i =0;i<list.size();i++) {
			System.out.print("-->");
		System.out.println(list.get(i));
		}
		System.out.println("*****View is Done******");
	}
	
	
	public static void remove() {
		System.out.println("Enter the value to be remove");
		String str=scanner.next();
		list.remove(str);
		System.out.println(list);
		System.out.println("*****Remove is Done*******");
	}
	
	public static void modify() {

		System.out.println("enter the  old value to be modified/replaced from the list");
		String so1 = scanner.next();
		System.out.println("enter the new item");
		String sn1 = scanner.next();

		if (so1 != sn1) {
			list.remove(so1);
			list.add(sn1);
		}
		System.out.println(list);
	}

	public static void search() {
		System.out.println("enter item to search");
		String str=scanner.next();
		for(int i=0;i<list.size();i++)
		{
			if(list.contains(str))
				System.out.println("Found in your cart");
			else
				System.out.println("Item not found");
			break;
		}
	}
	public static void exit() {
		System.out.println("u have exited have nice day");
		System.exit(0);
	}
	public static void menu() {
		
		System.out.println("Enter Your Choices");
		System.out.println("Enter 1 to add");
		System.out.println("Enter 2 to view");
		System.out.println("Enter 3 to modify");
		System.out.println("Enter 4 to remove");
		System.out.println("Enter 5 to search");
		System.out.println("Enter 6 to Exit");
		
		
	}
	
}


