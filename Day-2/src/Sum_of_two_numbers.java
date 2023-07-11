import java.util.Scanner;

public class Sum_of_two_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        System.out.print("Enter a number:");
	        int number1=sc.nextInt();
	        System.out.print("Enter a number:");
	        int number2=sc.nextInt();
	        if((number1+number2)%2==0) {
	        	System.out.println("Sum of two Numbers is even");
	         }
	         else {
	        	 System.out.println("Sum of two Numbers is odd");
	         }
	        }
	}


