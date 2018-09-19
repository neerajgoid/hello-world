package demo;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		System.out.println("Printing fibonnaci series");
		int a = 0,b = 1;
		
		System.out.println("Enter limit");
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		int c=a+b;
		System.out.print(a + " " + b + " ");
		while(c<limit)
		{
			
			System.out.print(c + " ");
			a=b;
			b=c;
			c=a+b;
		}
		
		

	}

}
