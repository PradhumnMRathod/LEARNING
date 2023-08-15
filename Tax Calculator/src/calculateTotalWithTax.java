import java.util.Scanner;

public class calculateTotalWithTax {

	public static void main(String[] args) {
Scanner scan =new Scanner(System.in);
System.out.println("Enter the purchase amount: ");
double x = scan.nextDouble();
System.out.println("Enter the tax rate (in decimal form): ");
double y = scan.nextDouble();
System.out.println(calculateTotalWithTax(x,y));
	}
	public static double calculateTotalWithTax(double x,double y) {
		System.out.println("Total cost including tax");
		return x*y+(x);
	}

}


 