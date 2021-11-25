package tanzeerdemo;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number to find Factoial");
		int j=scanner.nextInt();
		
		long k=1;
		for(int i=1;i<=j;i++) {
			k=k*i;
			
		}
		System.out.println(k);

	}

}
