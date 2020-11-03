package controller.db;

import java.sql.*;
public class clsJDBC {
	
	public clsJDBC() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("loading failed,,,ㅜㅜ");
		}
	}
	
	public Connection getCon() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hello","hello");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public Statement getSTMT(Connection con) {
		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.CONCUR_READ_ONLY, ResultSet.TYPE_SCROLL_INSENSITIVE);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return stmt;
	}
	
	public PreparedStatement getPSTMT(Connection con, String sql) {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql,ResultSet.CONCUR_READ_ONLY, ResultSet.TYPE_SCROLL_INSENSITIVE);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return pstmt;
	}
	
	//자원 반환해주는 함수
	public void close(Object o) {
		try {
			if(o instanceof Connection) {
				((Connection)o).close();
			}else if(o instanceof Statement){
				((Statement)o).close();
				
			}
			else if(o instanceof PreparedStatement){
				((PreparedStatement)o).close();
				
			}else if(o instanceof ResultSet){
			
				((ResultSet)o).close();
			}	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
