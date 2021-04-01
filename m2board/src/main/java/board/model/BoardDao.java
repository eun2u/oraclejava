package board.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDao { //DAO(Data Access Object)
	
	private static BoardDao boardDao = null;
	private DataSource ds=null;
	
	private BoardDao() {
		try {
			//Class.forName("oracle.jdbc.OracleDriver");
			Context context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/OracleCP");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private Connection getConnection() throws SQLException {
	//	return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oraclejava", "oraclejava");
		return ds.getConnection(); //미리 준비된 커넥션 풀에서 하나 반환
	}
	

	public static BoardDao getInstance() {
		if(boardDao==null) {
			boardDao=new BoardDao();
		}
		
		return boardDao;
	}
	
	private void dbClose(Connection cn, PreparedStatement ps, ResultSet rs) {
		if(rs!=null) try{rs.close();} catch(Exception e){}
		if(ps!=null) try{ps.close();} catch(Exception e){}
		if(cn!=null) try{cn.close();} catch(Exception e){}		
	}
	
	private void dbClose(Connection cn, PreparedStatement ps) {
		if(ps!=null) try{ps.close();} catch(Exception e){}
		if(cn!=null) try{cn.close();} catch(Exception e){}		
	}

}
