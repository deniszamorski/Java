package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import business.User;

public class userDB implements DAO<User> {

	private Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/prsdb";
		String username = "sblessing";
		String pwd = "login";
		Connection conn = DriverManager.getConnection(dbUrl, username, pwd);
		return conn;
	}

	@Override
	public User get(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> getAll() {
		String sql = "SELECT ID, userName, password, firstName, lastName, phoneNumber, email, isReviewer, isAdmin "
				+ "FROM User";
		List<User> users = new ArrayList<>();
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int ID = rs.getInt("ID");
				String userName = rs.getString("UserName");
				String password = rs.getString("Password");
				String firstName = rs.getString("FirstName");
				String lastName = rs.getString("LastName");
				String phoneNumber = rs.getString("PhoneNumber");
				String email = rs.getString("Email");
				boolean isReviewer = rs.getBoolean("isReviewer");
				boolean isAdmin = rs.getBoolean("isAdmin");
				User u = new User(ID, userName, password, firstName, lastName, phoneNumber, email, isReviewer, isAdmin);
				users.add(u);
			}
		} catch (SQLException e) {
			System.err.println(e);
			users = null;
		}
		return users;
	}
}
