package tanzeerdemo;

import java.util.Scanner;

public class ArrayLarge {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		 System.out.println("enter the array size");
		 int size=scanner.nextInt();
		 int[] array = new int[size];
		 System.out.println("enter the array size");
		 for(int i=0;i<array.length;i++) {
			 array[i]=scanner.nextInt();
		 }
		 int large=array[0];
		 for(int i=0;i<array.length;i++) {
			 if(large>array[i]) {
				 large=array[i];
			 }
		 }
		 System.out.println("the largest array value"+large);

	}
}
