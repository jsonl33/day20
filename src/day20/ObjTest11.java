package day20;

public class ObjTest11 {
	static {
		System.out.println("static{}");
	}
	{
		System.out.println("인스턴스 초기화 블록");
	}
	public ObjTest11() {
		System.out.println("기본 생성자");
	}
	public static void main(String[] args) {
		new ObjTest11();
		new ObjTest11();
	}
}
