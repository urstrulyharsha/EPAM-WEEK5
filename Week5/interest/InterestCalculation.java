package interest;
public class InterestCalculation {
	public double simpleinterest(float p,float t,float r) {
		return ((p*t*r)/100);
	}
	public double compoundinterest(float p,float t,float r) {
		return p*(Math.pow((1+(r/100)),t));
	}
}