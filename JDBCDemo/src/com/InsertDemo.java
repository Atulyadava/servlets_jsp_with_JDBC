package com;
import java.sql.*;
import java.util.*;
public class InsertDemo {

	public static void main(String[] args) {
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

}
//id integer,name varchar(15),age integer,salary integer,desig varchar(20));