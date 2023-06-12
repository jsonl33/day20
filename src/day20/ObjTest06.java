package day20;

class Board06{
	private String board_Name = "홍길동";
	private String board_Title = "게시판 제목입니다";
	private String board_Content = "게시판 내용입니다";
	
	public void board_pr() {
		System.out.println("글쓴이: "+board_Name+"\n제목: "+board_Title+"\n내용: "+board_Content);
	}
}

public class ObjTest06 {
	public static void main(String[] args) {
		Board06 board = new Board06();
		board.board_pr();
	}
}
