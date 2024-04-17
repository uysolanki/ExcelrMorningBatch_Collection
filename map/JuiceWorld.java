package day27.collection.map;

import java.util.Scanner;

public class JuiceWorld {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Quantity of Mango Juice");
		int mango=sc.nextInt();
		System.out.println("Enter Quantity of Orange Juice");
		int orange=sc.nextInt();
		System.out.println("Enter Quantity of PineApple Juice");
		int pineapple=sc.nextInt();
		
		MinimumTime mt=new MinimumTime(mango,orange,pineapple);
		int min=mt.calculateMinTime();
		System.out.println("Minimum Time taken to Serve the above order is "+ min + " seconds");

	}

}
