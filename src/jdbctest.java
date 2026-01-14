import java.sql.*;

public class jdbctest {
	public static void main(String[] args) {
		try {
			String url = 	"jdbc:sqlserver://localhost:1433;databaseName=mydb;encrypt=true;trustServerCertificate=true";
			String user = "system";
			String password = "1234";
			String driver = "oracle.jdbc.driver.OracleDriver";

			Class.forName(driver);

			Connection con = DriverManager.getConnection(url, user, password);
			
			System.out.println("오라클 DB 서버 연결 성공");
			
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO sungjuk(sno, uname, kor, eng, mat, addr, wdate)");
			sql.append("VALUES(sungjuk_seq.nextval,'코리아', 80, 65, 90, 'Jeju', sysdate)");
			
			PreparedStatement pstmt = con.prepareStatement(sql.toString());

			int cnt = pstmt.executeUpdate();
			System.out.println("실행결과" + cnt);
			
			pstmt.close();
			con.close();

		} catch (Exception e) {
			System.out.println("오라클 DB 서버 연결 실패 : "+e);
		}
	}

}