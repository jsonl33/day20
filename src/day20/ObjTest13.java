package day20;

class Product13{
	static int count=0;
	int serialNumber;
	{
		++count;
		serialNumber=count;
	}
}

public class ObjTest13 {
	public static void main(String[] args) {
		Product13 p01=new Product13();
		Product13 p02=new Product13();
		Product13 p03=new Product13();
		
		System.out.println("p01 재품번호: "+p01.serialNumber);
		System.out.println("p01 재품번호: "+p02.serialNumber);
		System.out.println("p01 재품번호: "+p03.serialNumber);
		System.out.println(Product13.count);
	}
}
