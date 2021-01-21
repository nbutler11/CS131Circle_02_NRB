
public class Circle {
	private double radius;
	
	public Circle() {
		radius=1;
	}
	
	public Circle(double r) {
		radius=r;
	}
	
	public double calculateArea(double r) {
		double area = Math.PI*Math.pow(r,2);
		return area;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double r) {
		radius=r;
	}

}
