package demo;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your number");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= num; i++)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                count++;
               
            }
        }
        System.out.println("count is " + count);
        if (count<=2)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

	}

}
