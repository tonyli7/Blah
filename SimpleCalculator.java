import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
    
	System.out.println("Enter the first number: ");
	int num1=input.nextInt();
	input.nextLine();
	System.out.println("Enter the second number: ");
	int num2=input.nextInt();
	input.nextLine();
	System.out.println("Enter the operation to be performed: ");
	String s = input.nextLine();
	try{
	if (isValidOp(s)){
	    if(s.equals("+")) {
		addition(num1,num2);
		//System.out.println(s);	
	    }
	    if(s.equals("*")) {
		multiplication(num1,num2);
		//System.out.println(s);	
	    }
	}
	}catch (InvalidOperationException e){
	    System.out.println(e.getMessage());
	}
			
    }

    public static class InvalidOperationException extends Exception{

	public InvalidOperationException(String msg){
	    super(msg);
	}
    }
    
    public static boolean isValidOp(String op) throws InvalidOperationException{
	String[] validOps = {"+", "-", "*", "/", "%"};
	for (int i = 0; i < validOps.length; i++){
	    if (op.equals(validOps[i])){
		return true;
	    }
	}
	throw new InvalidOperationException("Invalid Operation");
    }


    public static void addition(int a, int b){
	int sum=0;
	sum=a+b;
	System.out.println(sum);
    }

    public static void subtraction(int a, int b){
	int diff = 0;
	diff = a-b;
	System.out.println(diff);
    }

    public static void division(int a, int b) throws ArithmeticException{
	int quotient=0;
	if(b==0) {
	    throw new ArithmeticException();
	}
	else {
	    quotient=a/b;
	    System.out.println(quotient);
	}
    }

    public static void multiplication(int a, int b){
	int product=0;
	product=a*b;
	System.out.println(product);
    }
}
