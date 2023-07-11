import java.util.Scanner;
public class Even_or_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int n1=sc.nextInt();
         if((n1&1)==0) {
        	 System.out.println("Number is even");
         }
         else {
        	 System.out.println("Number is odd");
         }
	}

}
