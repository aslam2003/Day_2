import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number:");
         int N=sc.nextInt();
         if(N>0) {
        	 System.out.println("Number is positive");
         }
         else if(N<0) {
        	 System.out.println("Number is negative");
         }
         else {
        	 System.out.println("Number is zero");
         }
	}

}
