package mypackage;

class student{
	String studentName;
	int regNumber;
	student(int reg_no,String name){
		this.regNumber=reg_no;
		this.studentName=name;
	}
}
public class studentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare an array integers
		student [] arr;
		arr=new student[5];
		
		arr[0]=new student(12341,"manish");
		arr[1]=new student(12342,"atul");
		arr[2]=new student(12343,"rahul");
		arr[3]=new student(12344,"intezar");
		arr[4]=new student(12345,"rovin");
		for(int i=0;i<arr.length;i++) 
			System.out.println(arr[i]);
		for(int i=0;i<arr.length;i++)
			System.out.println("student name with registration Number " +arr[i].studentName +"is "
		+arr[i].regNumber);
		

	}

	}

