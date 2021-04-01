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

public class MemberDao { //DAO(Data Access Object)
	
	private static MemberDao memberDao = null;
	private DataSource ds=null;
	
	private MemberDao() {
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
	

	public static MemberDao getInstance() {
		if(memberDao==null) {
			memberDao=new MemberDao();
		}
		
		return memberDao;
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

	public List<ZipcodeDto> searchZipcode(String area) {
		Connection cn=null;
		PreparedStatement ps = null;
		ResultSet rs =null;
		List<ZipcodeDto> zipcodeList= new ArrayList<ZipcodeDto>();
		
		String sql=	  "select substr(zipcode, 1, 3) as zipcode1, "
					+ " 	   substr(zipcode, 5, 3) as zipcode2, "
					+ " 	   sido || ' ' || gugun || ' ' || dong || ' ' || "
					+ " 	   ri || ' ' || bunji as address1 "
					+ "from zipcode "
					+ "where dong like '%' || ? || '%' ";
		
		try {
			cn=getConnection();
			ps=cn.prepareStatement(sql);
			ps.setString(1, area);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				ZipcodeDto zipcodeDto = new ZipcodeDto();
				zipcodeDto.setZipcode1(rs.getString("zipcode1"));
				zipcodeDto.setZipcode2(rs.getString("zipcode2"));
				zipcodeDto.setAddress1(rs.getString("address1"));
				
				zipcodeList.add(zipcodeDto);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(cn, ps, rs);
		}
		
		return zipcodeList;
	}

	public int checkId(String id) {
		
		Connection cn=null;
		PreparedStatement ps = null;
		ResultSet rs =null;
		int result=0;
		
		String sql=	  "select count(*) as cnt "
					+ "from tbl_member "
					+ "where id = ? ";
		
		try {
			cn=getConnection();
			ps=cn.prepareStatement(sql);
			ps.setString(1, id);
			rs=ps.executeQuery();
			
			if(rs.next())
				result=rs.getInt("cnt");
						
		}catch(Exception e) {
			e.printStackTrace();
			result=-1;
		}finally {
			dbClose(cn, ps, rs);
		}
		
		return result;	
	}

	public boolean registerMember(MemberDto memberDto) {
		Connection cn = null;
		PreparedStatement ps = null;
		boolean result=false;
		String sql = "INSERT INTO TBL_MEMBER(id,password,name,birth,phone, zipcode, address1, address2) "+
					 "VALUES(?, ?,?,?,?,?,?,?) ";
		
		try {
			cn=getConnection();
			ps=cn.prepareStatement(sql);
			
			ps.setString(1, memberDto.getId());
			ps.setString(2, memberDto.getPassword());
			ps.setString(3, memberDto.getName());
			ps.setString(4, memberDto.getBirth());
			ps.setString(5, memberDto.getPhone());
			ps.setString(6, memberDto.getZipcode());
			ps.setString(7, memberDto.getAddress1());
			ps.setString(8, memberDto.getAddress2());
			
			ps.executeUpdate();
			result=true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(cn, ps);
		}
		
		return result;
	}

	public MemberDto getUser(MemberDto memberDto) {
		
		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs =null;
		
		MemberDto userInfo = null;
		
		String sql ="SELECT id, name "+
					"FROM tbl_member "+
					"WHERE id=? AND password=? ";
		
		try {
			cn=getConnection();
			ps=cn.prepareStatement(sql);
			ps.setString(1, memberDto.getId());
			ps.setString(2, memberDto.getPassword());
			rs=ps.executeQuery();
			
			if(rs.next()) {
				userInfo = new MemberDto();
				userInfo.setId(rs.getString("id"));
				userInfo.setName(rs.getString("name"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(cn, ps, rs);
		}
		
		return userInfo;
	}

}
