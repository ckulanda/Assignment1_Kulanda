
public class TestGeometricObjects {

	public static void main(String[] args) {
		Triangle t = new Triangle(5,6,3);
		Square s = new Square(2);
		Rectangle r = new Rectangle(6,8);
		Circle cir = new Circle(7);
		Cube cu = new Cube(5);
		System.out.println("Triangle Area is: " + t.totalArea());
		System.out.println("Square Area is: " + s.totalArea());
		System.out.println("Rectangle Area is: " + r.totalArea());
		System.out.println("Circle Area is: " + cir.totalArea());
		System.out.println("Cube Area is: " + cu.totalArea());
	}

}
