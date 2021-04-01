package board.model;

public class BoardDto {
	private Long no;
	private String title;
	private String content;
	private String regdate;
	private int readcount;
	private MemberDto memberDto; //id를 memberDto에서 얻어옴
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getReadcount() {
		return readcount;
	}
	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}
	public MemberDto getMemberDto() {
		return memberDto;
	}
	public void setMemberDto(MemberDto memberDto) {
		this.memberDto = memberDto;
	}
	@Override
	public String toString() {
		return "BoardDto [no=" + no + ", title=" + title + ", content=" + content + ", regdate=" + regdate
				+ ", readcount=" + readcount + ", memberDto=" + memberDto + "]";
	}
}
