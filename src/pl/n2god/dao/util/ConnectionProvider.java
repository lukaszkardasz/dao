package pl.n2god.dao.util;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author n2god on 23/12/2019
 * @project dao
 */
public class ConnectionProvider {
	private static DataSource dataSource;

	public static Connection getConnection() throws SQLException {
		return getDSInstance().getConnection();
	}

	private static DataSource getDSInstance() {
		if (dataSource == null){
			try {
				Context initContext = new InitialContext();
				Context envContext = (Context) initContext.lookup("java:comp/env");
				dataSource = (DataSource) envContext.lookup("jdbc/library");
			} catch (NamingException e) {
				e.printStackTrace();
			}
		}
		return dataSource;
	}
}
