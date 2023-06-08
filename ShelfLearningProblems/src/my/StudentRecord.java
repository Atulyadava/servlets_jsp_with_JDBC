package my;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRecord implements Comparable{
	String Name;
	int rollno;
	String address;
	//constructor to initialize Student name ,roll number and address
	StudentRecord(String Name,int rollno,String address){
		this.Name=Name;
		this.rollno=rollno;
		this.address=address;
	}
	//formating roll number ,name,address
	public String toString() {
		return this.rollno+","+this.Name +","+this.address;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List stud =new ArrayList();
		
		//adding Student records here
		stud.add(new StudentRecord("lahari",27922125,"Bengalore"));
		stud.add(new StudentRecord("Amulya",27922123,"Bengalore"));
		stud.add(new StudentRecord("Madhvi",27922122,"Chennai"));
		stud.add(new StudentRecord("MadhuBabu",27922126,"Bengalore"));
		stud.add(new StudentRecord("Varahalu",27922124,"Rajahmundry"));
		stud.add(new StudentRecord("Sarojini",27922121,"Rajahmundry"));
		stud.add(new StudentRecord("Hena Stish",27922127,"Hyderabad"));
		
		//sorting the student data
		Collections.sort(stud);
		System.out.println("the list after sorting : ");
		System.out.println(stud);
		
		//sorting by roll number
		System.out.println("After sorting by roll number\n");
		for(int i=0;i<stud.size();i++) {
			System.out.println(stud.get(i));
		}
		

	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return  this.rollno-((StudentRecord)o).rollno;
	}

}
