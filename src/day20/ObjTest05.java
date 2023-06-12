package day20;

class MyDate05{
	private int year;
	private int month;
	private int date;
	
	public MyDate05() {
		this.year = 2023;
		this.month = 6;
		this.date = 1;
	}

	public MyDate05(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	public void pr() {
		System.out.println(year+"년"+month+"월"+date+"일");
	}
}

public class ObjTest05 {
	public static void main(String[] args) {
		MyDate05 md = new MyDate05();
		md.pr();
		MyDate05 md2 = new MyDate05(2023, 6, 12);
		md2.pr();
	}
}
