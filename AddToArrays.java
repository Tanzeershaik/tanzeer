package tanzeerdemo;

import java.util.Scanner;

public class AddToArrays {
		public static void main(String[] args)
		{
			int firstArray[] = {10,20,30,40,50};
			int SecondArray[] = {60,70,80,90,100};
			
			int ThirdArray[] = new int [firstArray.length+SecondArray.length];
			
			System.out.println("First Array");
			
			for(int i=0;i<firstArray.length;i++)
			{
				System.out.println(firstArray[i]+ " ");
			}
			System.out.println("*************");
			System.out.println("Second Array");
			
			for(int i =0;i<SecondArray.length;i++)
			{
				System.out.println(SecondArray[i]+" ");
			}
			int count= 0;
			for(int i=0;i<firstArray.length;i++)
			{
				ThirdArray[count]=firstArray[i];
				count++;
			}
			for (int i =0;i<SecondArray.length;i++)
			{
				ThirdArray[count]=SecondArray[i];
				count++;
			}
			System.out.println("***************");
			System.out.println("Third Array");
			for (int i=0; i<ThirdArray.length;i++)
			{
				System.out.println(ThirdArray[i]+" ");
			}

	}
}
