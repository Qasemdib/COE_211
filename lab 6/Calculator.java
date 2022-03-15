import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    
    public Calculator() {
        
        Scanner scan = new Scanner(System.in);
       
	System.out.print("Enter first number: ");
	num1 = scan.nextInt();operator = scan.next();
	System.out.print("Enter Second number: ");
	num2 = scan.nextInt();
	
		switch (operator){
			case "+":System.out.println( add( num1, num2));
			break;
			case "-" : System.out.println(subtract(num1 ,num2));
			break;
			case "*" : System.out.println(multiply( num1, num2));
			break;
			case "/": System.out.println(divide(num1 ,num2));
			break;
			}

	

        
    }

    public String add(int a, int b) {

	
		int result = a + b;
		String x = a + "+" + b + "=" + result;
		return x;

			

       
    }

    public String subtract(int a, int b) {


		
		int result = a - b;
		String x = a + "-" + b + "=" + result;
       
		return x;
    }

    public String multiply(int a, int b) {

		int result = a * b;
		String x = a + "*" + b + "=" + result;
       
		return x;
       
    }

    public String divide(int a, int b) {

		int result = a /b;
		String x = a + "/" + b + "=" + result;
       
		return x;
        
    }
}