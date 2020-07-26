package construction;

public class ConstructionCost {
	public int calc(String material_standard,double area, int fah) {
		if(material_standard.equals("high standard materials") && fah==1)
		{
			return (int) (2500*area);
		}
	   else if(material_standard.equals("standard materials"))
		{
			return (int) (area*1200);
		}
		else if(material_standard.equals("above standard materials"))
		{
			return (int) (1500*area);
		}
		else if(material_standard.equals("high standard materials"))
		{
			return (int) (1800*area);
		}
		return 0;
	}

}
