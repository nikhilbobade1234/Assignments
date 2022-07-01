package Que_3_EmailPassword;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class User {
	int userid;
	public String email;
	String password;

	public User(String username, String password) {
		super();
		this.userid = userid;
		this.email = username;
		this.password = password;
	}

	public static boolean cheak(String s1, String s2) throws SQLException, ClassNotFoundException {
		boolean ufound = false;
		List<User> slist = new ArrayList<User>();

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tdd", "root", "root");
		System.out.println("Driver is uploaded");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select*from user ");
		while (rs.next()) {
			slist.add(new User(rs.getString("email"), rs.getString("password")));
		}
		for (User u : slist) {
			if (u.email.equals(s1) && (u.password.equals(s2)))
				ufound = true;
		}
		return ufound;

	}
}
