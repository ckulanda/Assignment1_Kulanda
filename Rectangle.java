
public class Rectangle implements Shape{

	private int a;
	private int b;

	public Rectangle(int a, int b) {
		this.a=a;
		this.b=b;
	}

	public float totalArea() {
		int area;
		area = (a*b);
		return area;
	}

}
