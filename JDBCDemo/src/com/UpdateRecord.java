package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateRecord {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/project","root","Atulyadav123@");
			PreparedStatement pst=con.prepareStatement("update emp set salary=? where id=?");
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter ID:");
			int id=sc.nextInt();
			
			System.out.println("Enter SALARY:");
			int salary=sc.nextInt();
			
			pst.setInt(1,salary);
			pst.setInt(2,id);
			
						
			pst.execute();
			//st.execute("insert into Emp values(333,'atul',22,50000,'dev')");
			pst.close();
			con.close();
			System.out.println("data Updated successfully...!");
		}catch(Exception e) {
			System.err.println(e);
		}
		
	}

	}


