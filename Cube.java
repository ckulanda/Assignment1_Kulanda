import java.lang.Math;

public class Cube implements Shape{

	private int a;


	public Cube(int a){
		this.a =a;
	}

	
	public float totalArea() {
		int area;
		area = (int) (6 * (Math.pow(a,2)));
		return area;
	}

}
