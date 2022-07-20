package dubiumdao;

public class Configuracao extends Object {

	private String driver;

	private String user;

	private String password;

	private String dbURL;

	private String diretorioServidor;

	private String diretorioUpload;

	private String diretorioDownload;

	private String diretorioDownloadVirtual;

	private String smtp;

	/* CONFIGURA��O PARA O MYSQL */
	/*
	 * //driver para clausulas normais driver = "org.gjt.mm.mysql.Driver";
	 * 
	 * //driver para o jdeveloper driver = "com.mysql.jdbc.Driver";
	 * 
	 * user = "root"; password = "roger";
	 * 
	 * dbURL = "jdbc:mysql://127.0.0.1/bibliasagrada";
	 */

	/* CONFIGURA��O PARA O INTERBASE */
	/*
	 * driver = "org.firebirdsql.jdbc.FBDriver"; user = "SYSDBA"; password =
	 * "masterkey";
	 * 
	 * dbURL =
	 * "jdbc:firebirdsql:127.0.0.1/3050:D:/HEVistorias/BaseDados/VISTORIA.GDB";
	 */
   
   /* CONFIGURA��O PARA O POSTGRESQL */
	/*
	 * driver = "org.postgresql.Driver"; 
   * user = "postgres"; 
   * password = "";
	 * 
	 * dbURL = "jdbc:postgresql://127.0.0.1/agendainfo20";
	 */

	public Configuracao() {
		driver = "com.mysql.jdbc.Driver";
		user = "root";
		password = "admin";

		dbURL = "jdbc:mysql://localhost:3306/dubium";

	}

	public String getDriver() {
		return this.driver;
	}

	public String getUser() {
		return this.user;
	}

	public String getPassword() {
		return this.password;
	}

	public String getDbURL() {
		return this.dbURL;
	}

	public String getDiretorioServidor() {
		return this.diretorioServidor;
	}

	public String getDiretorioUpload() {
		return this.diretorioUpload;
	}

	public String getDiretorioDownload() {
		return this.diretorioDownload;
	}

	public String getDiretorioDownloadVirtual() {
		return this.diretorioDownloadVirtual;
	}

	public String getSmtp() {
		return this.smtp;
	}

  protected Object clone() throws CloneNotSupportedException
  {
    // TODO:  Override this java.lang.Object method
    return super.clone();
  }

  public boolean equals(Object obj)
  {
    // TODO:  Override this java.lang.Object method
    return super.equals(obj);
  }

  protected void finalize() throws Throwable
  {
    // TODO:  Override this java.lang.Object method
    super.finalize();
  }

  public int hashCode()
  {
    // TODO:  Override this java.lang.Object method
    return super.hashCode();
  }

  public String toString()
  {
    // TODO:  Override this java.lang.Object method
    return super.toString();
  }
}
