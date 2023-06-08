package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteRecord {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/project","root","Atulyadav123@");
			PreparedStatement pst=con.prepareStatement("delete from emp where id=?");
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter ID:");
			int id=sc.nextInt();
			
			pst.setInt(1,id);
			
						
			pst.execute();
			//st.execute("insert into Emp values(333,'atul',22,50000,'dev')");
			pst.close();
			con.close();
			System.out.println("data will be deleted successfully...!");
		}catch(Exception e) {
			System.err.println(e);
		}

	}

}
