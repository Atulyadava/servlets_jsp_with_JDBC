package my;
import java.util.*;
public class QuizProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("who is the founder of blue origin?");
		System.out.println("1.Bill gets\n2.Alon musk\n3.Tim cook\n4.Jeff bezos\5.Exit");
		
		while(true) {
			System.out.println("choose the opction (\1\2\3\4\5)");
			Scanner sc=new Scanner(System.in);
			int opction=sc.nextInt();
			
		if(opction==4) {
			System.out.println(" congratulation!!!  your answer is right ");
		}	
		else if(opction==5) {
			break;
		}
		else {
			System.out.println("sorry!!! but your answer is wrong !!! ");
		}
		}

	}

}
