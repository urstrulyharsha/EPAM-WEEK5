package interest;

import java.util.Scanner;

public class InterestCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Choice 1.Simple interest 2.Compound Interest");
		int n = s.nextInt();
		System.out.println("Enter Principle amount");
		float p = s.nextInt();
		System.out.println("Enter rate of Interest");
		float r = s.nextInt();
		System.out.println("Enter time period");
		float t = s.nextInt();
		InterestCalculation i = new InterestCalculation();
		if(n==1) {
			double k = i.simpleinterest(p, t, r);
			System.out.println("Simple Interest is "+k);
		}
		else if(n==2) {
			double k = i.compoundinterest(p, t, r);
			System.out.println("Simple Interest is "+k);
		}
		else {
			System.out.println("Invalid Operation");
		}
	}

}
