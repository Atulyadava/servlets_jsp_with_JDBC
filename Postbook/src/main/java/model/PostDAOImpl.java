package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PostDAOImpl implements PostDAO {
	//need to load the driver and get a connection
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
	public int addpost(Post post) {
		int res=-1;
		// assuming post object has correct data
		try {
			PreparedStatement pst=con.prepareStatement("insert into posts(body) values(?)");
			//?- means a placeholder for actual data
			pst.setString(1, post.getBody());
			res=pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

}
