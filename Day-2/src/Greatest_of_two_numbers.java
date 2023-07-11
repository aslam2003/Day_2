import java.util.Scanner;
public class Greatest_of_two_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number1=sc.nextInt();
        System.out.print("Enter a number:");
        int number2=sc.nextInt();
        if(number1<number2) {
        	System.out.println( number2+" is greater");
        }
        else {
            System.out.println(number1+" is greater");
        }
	}

}
