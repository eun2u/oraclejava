package board.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDao { //DAO(Data Access Object)
	
	private static BoardDao boardDao = null;
	
	private BoardDao() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oraclejava", "oraclejava");
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
		String sql=
				"INSERT INTO m1board(no, title, name, password, content) " +
					"VALUES(m1board_seq.nextval, ?,?,?,?)";
		
		boolean result=false;
		
		Connection cn= null;
		PreparedStatement ps = null;
		
		try{
			cn=getConnection();
			ps=cn.prepareStatement(sql);
			
			ps.setString(1, boardDto.getTitle());
			ps.setString(2, boardDto.getName());
			ps.setString(3, boardDto.getPassword());
			ps.setString(4, boardDto.getContent());
			
			ps.executeUpdate();
			result=true;
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			dbClose(cn, ps);
		}
		return result;
	}
	
	
	public List<BoardDto> getBoardList(){
		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null; //결과 데이터를 얻어오기 위한 인스턴스 참조. 
		List<BoardDto> list = new ArrayList<BoardDto>();
		
		String sql = 
			"SELECT no, title, name, to_char(writeday, 'YYYY-MM-DD') AS writeday, readcount "+
			"from m1board "+
			"order by no desc";
		
		try{
			cn=getConnection();
			
			ps=cn.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()){
				BoardDto boardDto= new BoardDto();
				boardDto.setNo(rs.getLong("no"));
				boardDto.setTitle(rs.getString("title"));
				boardDto.setName(rs.getString("name"));
				boardDto.setWriteday(rs.getString("writeday"));
				boardDto.setReadcount(rs.getInt("readcount"));
				
				list.add(boardDto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			dbClose(cn, ps, rs);
		}
		
		return list;
	}
	
	public BoardDto getBoardView(Long no) { //상세보기
		
		Connection cn= null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		BoardDto boardDto = null;
		
		String sql = "SELECT no, title, name, content, writeday, readcount "+ 
					 "FROM m1board "+
					 "WHERE no = ?";
		
		try {
			cn = getConnection();
			ps = cn.prepareStatement(sql);
			ps.setLong(1, no);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				boardDto = new BoardDto();
				boardDto.setNo(rs.getLong("no"));
				boardDto.setTitle(rs.getString("title"));
				boardDto.setName(rs.getString("name"));
				boardDto.setContent(rs.getString("content"));
				boardDto.setWriteday(rs.getString("writeday"));
				boardDto.setReadcount(rs.getInt("readcount"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(cn, ps,rs);
		}
		
		return boardDto;
	}
	public boolean updateReadcount(Long no) { //조회수 증가
		Connection cn=null;
		PreparedStatement ps = null;
		
		String sql= "UPDATE m1board "+ 
					"SET readcount = readcount+1 "+
					"WHERE no= ? ";
		
		boolean result = false;
		
		try {
			cn=getConnection();
			ps=cn.prepareStatement(sql);
			ps.setLong(1, no);
			
			if(ps.executeUpdate() > 0) {
				result = true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose(cn, ps);
		}
		
		return result;
	}
	public boolean updateBoard(BoardDto boardDto) { //수정
		Connection cn = null;
		PreparedStatement ps = null;
		
		String sql= "UPDATE m1board "+
					"SET title=?, name=?, content=? "+
					"WHERE no=? AND password=? ";
		
		boolean result=false;
		try {
			cn=getConnection();
			ps=cn.prepareStatement(sql);
			ps.setString(1, boardDto.getTitle());
			ps.setString(2, boardDto.getName());
			ps.setString(3, boardDto.getContent());
			ps.setLong(4, boardDto.getNo());
			ps.setString(5, boardDto.getPassword());
			
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

}
