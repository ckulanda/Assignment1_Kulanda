import java.lang.Math;
public class Triangle implements Shape{

	private int a;
	private int b;
	private int c;


	public Triangle(int a, int b, int c) {
		this.a =a;
		this.b=b;
		this.c=c;
	}


	public float totalArea() {
		int s;
		s=(a+b+c)/2;
		float area;
		area =(float) (Math.sqrt(s) + (s-a) + (s-b) + (s-c) );

		return  area;
	}

}
