import java.util.Scanner;

public class calculate {

	public static void main(String[] args) {
		
Scanner scan =new Scanner (System.in);
System.out.println("Enter the first number:");
double num1 = scan.nextDouble();
System.out.println("Enter second number:");
double num2 = scan.nextDouble();
 System.out.println("Enter the operator(+,-,*,/): ");
 char calculate = scan.next().charAt(0);
 switch (calculate)
 {
 case '+':
	 System.out.println(num1+num2 );
	 break;
	 
 case '-':
	 System.out.println(num1-num2);
	 break;

 case '*':
	 System.out.println(num1*num2);
	 break;
	
 case '/':
	 System.out.println(num1/num2);
	 break;	 
	 
	 
	 
 }
 
 
	}
	

}
