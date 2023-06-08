package my;
import java.util.*;
class teacher{
	private String name;
	private int id;
	private String Subject;
	 int time=2 ;
	teacher(){
		name="ATUL";
		id =181106;
		Subject ="Mathe";
	}
	void data() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(Subject);
		System.out.println(time);
	}
	}
	
	class student extends teacher {
		int a=5;
		void Details(){ 
			System.out.println(a);
		}
	}


public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        int i;
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter the on of values");
//        i = sc.nextInt();
//        while(i<=5) {
//        	System.out.println(i);
//        	i++;
//        }
        teacher obj= new teacher();
        //obj.Details();
        obj.data();
        student s= new student();
       
	}

}
