package dubiumdao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ConPooling {
	private static ConPooling connectionPooling;

	private ArrayList pooling;

	private String driver;

	private String user;

	private String password;

	private String dbURL;

	private int nuConnection;

	public ConPooling() {
		pooling = new ArrayList();
		Configuracao config = new Configuracao();
		driver = config.getDriver();
		user = config.getUser();
		password = config.getPassword();
		dbURL = config.getDbURL();
		try {
			Class.forName(driver);
		} catch (Exception e) {
		}
	}

	public static ConPooling getInstance() {
		if (connectionPooling == null)
			connectionPooling = new ConPooling();
		return connectionPooling;
	}

	public synchronized Connection getConnection() {
		Connection connection = null;
		if (pooling.isEmpty()) {
			try {
				connection = DriverManager.getConnection(dbURL, user, password);
				nuConnection++;
			} catch (SQLException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null,
						"N�o foi poss�vel conectar ao banco de dados!",
						"ERRO!", JOptionPane.ERROR_MESSAGE);
				System.exit(0);
			}
		} else {
			connection = (Connection) pooling.remove(0);
		}
		return connection;
	}

	public synchronized void retConnection(Connection con) {
		try {
			if (!con.getAutoCommit()) {
				con.rollback();
				con.setAutoCommit(true);
			}
			pooling.add(con);
		} catch (Exception e) {
		}
	}
}
