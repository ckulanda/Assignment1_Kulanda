import java.lang.Math;
public class Circle implements Shape{

	private int r;


	public Circle(int r){
		this.r=r;
	}


	public float totalArea() {
		int area;
		area= (int) (Math.PI*(Math.pow(r,2)));
		return area;
	}

}
