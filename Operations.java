
public class Operations {
	double total;
	public void addition(double x, double y) {
		total=x+y;
		System.out.println("Addition total is:" + total);
	}
	public void subtraction(double x, double y) {
		total=x-y;
		System.out.println("Subtraction total is:" + total);
	}
	public void multiplication(double x, double y) {
	     total = x * y;
	     System.out.println("Multipucation total is:"+total);
	}
	public void division(double x, double y) {
		 total = x / y;
	     System.out.println("Division total is:"+total);
	}
	public void squareRoot(double x) {
		 total = Math.sqrt(x);
	     System.out.println("Square root total is:"+total);
	}
	public void factorial(double x) {
		double factorial=1; 
		for (int i=1;i<=x; i++)
		 {
			 
			 factorial= factorial*i; 
		 }
		System.out.println("Factorial total is:"+factorial);	
	     
	}
}
