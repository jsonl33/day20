package day20;

class MyDate10 {
	private int year;
	private int month;
	private int date;

	public MyDate10() {
		this(2023, 2, 1);
	}

	public MyDate10(int year, int month) {
		this(year, month, 10);
	}

	public MyDate10(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}

	public void pr() {
		System.out.println(year+"년"+month+"월"+date+"일");
	}
}

public class ObjTest10 {
	public static void main(String[] args) {
		MyDate10 md = new MyDate10();
		md.pr();
		MyDate10 md2 = new MyDate10(2024,5);
		md2.pr();
		MyDate10 md3 = new MyDate10(2025,6,7);
		md3.pr();
	}
}
