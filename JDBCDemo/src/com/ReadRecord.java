package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadRecord {

	public static void main(String[] args) {
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

}
