package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
class Emp
{
	void AddEmployee()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Atulyadav123@");
		PreparedStatement stmt=con.prepareStatement("insert into emp values(?,?,?,?,?)");
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter ID : ");
		int id=sc.nextInt();
		System.out.print("Enter Name : "); 
		String name=sc.next();
		System.out.print("Enter Age : ");
		int age=sc.nextInt();
		System.out.print("Enter Salary : ");
		int salary=sc.nextInt();
		System.out.print("Enter Desig: ");
		String desig=sc.next();
		
		stmt.setInt(1, id);
		stmt.setString(2, name);
		stmt.setInt(3,age);
		stmt.setInt(4, salary);
		stmt.setString(5, desig);
		
		stmt.execute();
		stmt.close();
		con.close();
		System.out.println("Data Inserted Succsfully...!");
		} catch (Exception e) {
			System.err.println(e);
		}	
	
	}
	
	
	void display()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		Statement stmt=con.createStatement();
	ResultSet rs =stmt.executeQuery("select * from emp");
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" : "+rs.getString("name")+" : "+rs.getInt(3)
		+" : "+rs.getInt(4)+" :"+rs.getString(5));
	}
		} catch (Exception e) {
			System.err.println(e);
		}	

	}
	
	void raiseSalary()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		PreparedStatement stmt=con.prepareStatement("update emp set salary= salary+5000;");
		stmt.execute();
		stmt.close();
		con.close();
		System.out.println("Data Updated  Succsfully...!");
		} catch (Exception e) {
			System.err.println(e);
		}	
	}
	void deleteEmp()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		PreparedStatement stmt=con.prepareStatement("delete from emp where id=?;");
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter ID : ");
		int id=sc.nextInt();

		stmt.setInt(1,id);
		System.out.println("Deo you Realy want to Delete Record ? y/n ");
		String op=sc.next();
		if(op.equalsIgnoreCase("yes")|| op.equalsIgnoreCase("y"))
		{
			stmt.execute();
			System.out.println("Data Deleted   Succsfully...!");
		}
		else {
			System.out.println("record not deleted...!");
		}
		
		stmt.close();
		con.close();
		
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
public class JdbcCRUDprogram {

	public static void main(String[] args) {
		int ch=0;
		do {
			System.out.println("1) Create");
			System.out.println("2 ) Display");
			System.out.println("3) Raise Salary ");
			System.out.println("4 ) Delete Emp ");
			System.out.println("5 ) Exit ");
			
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter Choce : ");
			ch=sc.nextInt();
			Emp e = new Emp();
			if(ch==1)
			{
				e.AddEmployee();
			}
			if(ch==2)
			{
				e.display();
			}
			if(ch==3)
			{
				e.raiseSalary();
			}
			if(ch==4)
			{
				e.deleteEmp();
			}
			
		}while(ch<=4);
		

	}

}



