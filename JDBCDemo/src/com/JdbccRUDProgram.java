package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

class Emp{
	void addEmployee() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/project","root","Atulyadav123@");
			PreparedStatement pst=con.prepareStatement("insert into Emp values(?,?,?,?,? )");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter ID:");
			int id=sc.nextInt();
			System.out.println("Enter NAME:");
			String name=sc.next();
			System.out.println("Enter AGE:");
			int age =sc.nextInt();
			System.out.println("Enter SALARY:");
			int salary=sc.nextInt();
			System.out.println("Enter DESIG:");
			String desig=sc.next();
			
			pst.setInt(1,id);
			pst.setString(2,name);
			pst.setInt(3,age);
			pst.setInt(4,salary);
			pst.setString(5,desig);
			pst.execute();
			//st.execute("insert into Emp values(555,'jumba',22,50000,'dev')");
			pst.close();
			con.close();
			System.out.println("data inserted successfully...!");
		}catch(Exception e) {
			System.err.println(e);
		}
		
	}
	void display() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/project","root","Atulyadav123@");
			Statement st=con.createStatement();
			ResultSet res= st.executeQuery("select * from emp;");
			while(res.next()) {
				System.out.println(res.getInt(1)+" : "+res.getString(2)+" : "+res.getInt(3)+" : "+res.getInt(4)+" : "+res.getString(5));
			}
		}catch(Exception e) {
			System.err.println(e);
		}
	}
	void RaiseSalary() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/project","root","Atulyadav123@");
			PreparedStatement pst=con.prepareStatement("update emp set salary=salary+5000; ");
            
			pst.execute();
			pst.close();
			con.close();
			System.out.println("data Updated successfully...!");
		}catch(Exception e) {
			System.err.println(e);
		}
	}
	void deleteEmp() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/project","root","Atulyadav123@");
			PreparedStatement pst=con.prepareStatement("delete from emp where id=?");
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter ID:");
			int id=sc.nextInt();
			
			pst.setInt(1,id);
			System.out.println("Do you Realy want to Delete Record ? y/n ");
			String op=sc.next();
			if(op.equalsIgnoreCase("yes")|| op.equalsIgnoreCase("y"))
			{
				pst.execute();
				System.out.println("Data Deleted   Succsfully...!");
			}
			else {
				System.out.println("record not deleted...!");
			}						
			pst.close();
			con.close();
			System.out.println("data will be deleted successfully...!");
		}catch(Exception e) {
			System.err.println(e);
		}

	}
}
public class JdbccRUDProgram {
	

	public static void main(String[] args) {
		int ch=0;
		do {
			System.out.println("1) Creat");
			System.out.println("2) Display");
			System.out.println("3) Raise Salary");
			System.out.println("4) Delete Emp");
			System.out.println("5) Exiet");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Choce: ");
		    ch=sc.nextInt();
		    Emp e=new Emp();
		    if(ch==1) {
		     e.addEmployee();
		    }
		    if(ch==2) {
		    	e.display();
		    }
		    if(ch==3) {
		    	e.RaiseSalary();
		    }
		    if(ch==4) {
		    	e.deleteEmp();
		    }
		}while(ch <=4);

	}

}
