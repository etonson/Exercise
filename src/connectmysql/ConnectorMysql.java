package connectmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorMysql {

	public static void main(String[] args) {
		Connection conn = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" + "user=sa&password=Aa123456");
			System.out.println(conn);
			// The newInstance() call is a work around for some
			// broken Java implementations
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}

	}

}
