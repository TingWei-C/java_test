
public class ReferenceTransferDemo {
	public static void swap(Mydata data) {
		int tmp = data.a;
		data.a = data.b;
		data.b = tmp;
		System.out.println("Swap��k�̡Aa���ȬO" + data.a + "�Fb���ȬO" + data.b);
	}
	public static void main(String[] args) {
		Mydata data = new Mydata();
		data.a = 6;
		data.b = 9;
		System.out.println("Swap��k�e�Aa���ȬO" + data.a + "�Fb���ȬO" + data.b);
		swap(data);
		System.out.println("Swap��k��Aa���ȬO" + data.a + "�Fb���ȬO" + data.b);
	}

}
