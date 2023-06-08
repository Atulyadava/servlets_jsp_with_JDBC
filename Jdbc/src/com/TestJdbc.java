package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//load driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded");
		
		//Establish connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/amitdb1", "root", "Atulyadav123@");
		System.out.println("connection is establish");
		
		//insert a book
		Statement st=con.createStatement();
//		int res=st.executeUpdate("update books set name= 'OCPJP Guide exam' where id =3  ");
//		System.out.println("Number of rows will be affected: "+res);
		
		ResultSet rs=st.executeQuery("Select * from books");
		while(rs.next()) {
			System.out.println("id="+rs.getInt(1));
			System.out.println("Name="+rs.getString(2));
			System.out.println("Price="+rs.getFloat(3));
			System.out.println();
		}
		
		//close the connection
		con.close();
	}

}
