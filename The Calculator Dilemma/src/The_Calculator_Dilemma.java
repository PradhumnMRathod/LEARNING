import java.util.Scanner;

public class The_Calculator_Dilemma {

	public static void main(String[] args) 
	{
Scanner scan =new Scanner (System.in);
System.out.println("Enter two number to perform arthematic operations");
System.out.println("Enter first number:");
int x=scan.nextInt();
System.out.println("Enter second number:");
int y=scan.nextInt();
System.out.println("choose 1 for Addition");
System.out.println("choose 2 for Substraction");
System.out.println("choose 3 for Division");
System.out.println("choose 4 for Multiplication");
int i=scan.nextInt();
 
switch (i)
{
case 1:
	int add;
	add=x+y;
	System.out.println("Result :"+add);
	break;
	
case 2:
	int sub;
	sub=x-y;
	System.out.println("Result :"+sub);
	break;
	
case 3:
	int div;
	div=x/y;
	System.out.println("Result :"+div);
	break;
	
case 4:
	int mul;
	mul=x*y;
	System.out.println("Result :"+mul);
	break;
	
	
}
}
	}



