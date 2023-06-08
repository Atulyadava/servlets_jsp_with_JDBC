package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAOImpl implements UserDAO {
	public static Connection con;
	public static void initDatabase() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded.");

			con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "Atulyadav123@");
			System.out.println("Connection is established.");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	@Override
	public boolean Signin(User user) {
		try {
			PreparedStatement pst=con.prepareStatement("slect * from user where username=? and password =?");
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			ResultSet res=pst.executeQuery();
			if(res!=null && res.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean Signup(User user) {
		int res=-1;
		try {
			PreparedStatement pst=con.prepareStatement("insert into users(username,password) value(?,?)");
			pst.setString(1,user.getUsername());
			pst.setString(2,user.getPassword());
			res=pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (res==1) ? true:false;
	}

}
