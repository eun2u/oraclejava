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
	
	public boolean insertBoard(BoardDto boardDto) {
		Connection cn = null;
		PreparedStatement ps = null;
		boolean result=false;
		String sql = "INSERT INTO TBL_BOARD(no,title,content,id) "+
					 "VALUES(seq_board.nextval, ?, ?,?) ";
		
		try {
			cn=getConnection();
			ps=cn.prepareStatement(sql);
			
			ps.setString(1, boardDto.getTitle());
			ps.setString(2, boardDto.getContent());
			ps.setString(3, boardDto.getMemberDto().getId());
		
			ps.executeUpdate();
			result=true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(cn, ps);
		}
		
		return result;
	}

	public List<BoardDto> getBoardList(Long startnum, Long endnum) {
		Connection cn=null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<BoardDto> list = new ArrayList<BoardDto>();
		
//		String sql = "SELECT b.no, b.title, b.id, b.regdate, b.readcount, m.name "
//					+ "FROM tbl_board b join tbl_member m "
//					+ "ON b.id=m.id "
//					+ "ORDER BY b.no DESC ";
		
		String sql="SELECT B.* "
				+ "        FROM (SELECT rownum AS rnum, A.* "
				+ "              FROM (SELECT b.no, b.title, m.id,  "
				+ "                           case when to_char(b.regdate, 'YYYY-MM-DD') = to_char(sysdate, 'YYYY-MM-DD') "
				+ "                                then to_char(b.regdate, 'HH24:MI:SS')   "
				+ "                                else to_char(b.regdate, 'YYYY-MM-DD') end AS regdate, b.readcount, m.name  "
				+ "                    FROM tbl_board b join tbl_member m "
				+ "                    ON b.id = m.id  	 "
				+ "                    ORDER BY no DESC) A) B "
				+ "        WHERE ?<=rnum AND rnum<=? ";
		
		try {
			cn=getConnection();
			ps=cn.prepareStatement(sql);
			ps.setLong(1, startnum);
			ps.setLong(2, endnum);
			rs=ps.executeQuery();

			while(rs.next()) {
				MemberDto memberDto = new MemberDto();
				memberDto.setId(rs.getString("id"));
				memberDto.setName(rs.getString("name"));
				
				BoardDto boardDto = new BoardDto();
				boardDto.setNo(rs.getLong("no"));
				boardDto.setTitle(rs.getString("title"));
				boardDto.setReadcount(rs.getInt("readcount"));
				boardDto.setRegdate(rs.getString("regdate"));
				boardDto.setMemberDto(memberDto);
				
				list.add(boardDto);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(cn, ps, rs);
		}
		
		return list;
	}

	public BoardDto getBoardView(Long no) {
		Connection cn=null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		
		String sql="SELECT b.no, b.title, m.name, b.readcount, b.regdate, b.content, b.id "
				+ "FROM tbl_board b JOIN tbl_member m "
				+ "ON b.id=m.id "
				+ "WHERE b.no= ? ";
		BoardDto boardDto = new BoardDto();
		
		
		try {
			cn=getConnection();
			ps=cn.prepareStatement(sql);
			ps.setLong(1, no);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				MemberDto memberDto=new MemberDto();

				boardDto.setNo(rs.getLong("no"));
				boardDto.setTitle(rs.getString("title"));
				memberDto.setName(rs.getString("name"));
				memberDto.setId(rs.getString("id"));
				boardDto.setMemberDto(memberDto);
				boardDto.setReadcount(rs.getInt("readcount"));
				boardDto.setRegdate(rs.getString("regdate"));
				boardDto.setContent(rs.getString("content"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			dbClose(cn, ps, rs);
		}
		
		return boardDto;
	}

	public boolean updateReadCount(Long no) {
		
		Connection cn=null;
		PreparedStatement ps = null;
		
		String sql="UPDATE tbl_board "
				+ "SET readcount= readcount+1 "
				+ "WHERE no=? ";
		boolean result =false;
		
		try {
			cn=getConnection();
			ps=cn.prepareStatement(sql);
			ps.setLong(1, no);
			
			if(ps.executeUpdate() > 0) {
				result=true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			dbClose(cn, ps);
		}
		return result;
	}

	public boolean updateBoard(BoardDto boardDto) {
		Connection cn=null;
		PreparedStatement ps = null;
		
		String sql="UPDATE tbl_board "
				+ "SET title=? , content=? "
				+ "WHERE no=? AND ID=?";
		boolean result =false;
		
		try {
			cn=getConnection();
			ps=cn.prepareStatement(sql);
			ps.setString(1, boardDto.getTitle());
			ps.setString(2, boardDto.getContent());
			ps.setLong(3, boardDto.getNo());
			ps.setString(4, boardDto.getMemberDto().getId());
			
			if(ps.executeUpdate() > 0) {
				result=true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			dbClose(cn, ps);
		}
		return result;
	}

	public boolean deleteBoard(Long no) {
		Connection cn=null;
		PreparedStatement ps = null;
		
		String sql="DELETE tbl_board "
				 + "WHERE no=? ";
		boolean result =false;
		
		try {
			cn=getConnection();
			ps=cn.prepareStatement(sql);
			ps.setLong(1, no);

			if(ps.executeUpdate() > 0) {
				result=true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			dbClose(cn, ps);
		}
		return result;
	}

	public long getRecordCount() { //전체 레코드 수
		Connection cn =null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		
		long result=0L;
		String sql="SELECT count(*) as cnt FROM tbl_board ";
		
		try {
			cn=getConnection();
			ps=cn.prepareStatement(sql);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				result=rs.getLong("cnt");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(cn, ps);
		}
		
		return result;
	}

}
