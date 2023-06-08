package my;
import java.util.*;
public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number to factorialize");
		int n=sc.nextInt();
		//declaring variables
		int fact=1;
		int i=1;
		//logic using for loop
//		for(int i=1;i<=n;i++) {
//			fact=fact*i;
//		}
		//logic for using while loop
		while(i<=n) {
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
		
	}
	
}
