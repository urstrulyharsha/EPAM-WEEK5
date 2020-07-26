package construction;

import java.util.*;

public class CostOfHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the type of materials");
		String material_standard= s.nextLine();
		System.out.println("Enter the area of the house");
		double area = s.nextDouble();
		System.out.println("Enter whether the house is fully automated or not 1.Yes 2.No");
		int fah = s.nextInt();
		ConstructionCost c = new ConstructionCost();
		int k = c.calc(material_standard, area, fah);
		System.out.println("The Construction Cost of the House is "+k);
		s.close();
		

	}

}
