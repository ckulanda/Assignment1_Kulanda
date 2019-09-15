import java.lang.Math;

public class Square implements Shape{

	private int A;

	public Square(int A) {
	this.A=A;
	}

	public float totalArea() {
		float area;
		area = (float) Math.pow(A, 2);
		return area;
	}

}
