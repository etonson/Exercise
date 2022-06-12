package connectmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectorMysql {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement stat = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/IssueTrace?","sa","Aa123456"); 
			stmt = conn.createStatement();
			String sql = "select * from User where account = ? and pwd = ?";

			stat = conn.prepareStatement(sql);
			stat.setString(1, "eton");
			stat.setString(2, "123456");

			rs = stat.executeQuery();
			while (rs.next()) {
				String account = rs.getString(1);
				String  name= rs.getString(2);
				System.out.println(name);
			}

		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}catch(Exception e) {
			System.out.println("class error: " + e.getMessage());
		}

	}

}
