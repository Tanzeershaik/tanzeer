package tanzeerdemo;

import java.util.Scanner;

public class RevArray {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
 System.out.println("enter the array size");
 int size=scanner.nextInt();
 int[] array = new int[size];
 System.out.println("enter the array size");
 for(int i=0;i<array.length;i++) {
	 array[i]=scanner.nextInt();
 }
 for(int i =array.length-1;i>=0;i--) {
	 System.out.println(array[i]);
 }
	}

}
