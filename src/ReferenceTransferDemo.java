
public class ReferenceTransferDemo {
	public static void swap(Mydata data) {
		int tmp = data.a;
		data.a = data.b;
		data.b = tmp;
		System.out.println("Swap方法裡，a的值是" + data.a + "；b的值是" + data.b);
	}
	public static void main(String[] args) {
		Mydata data = new Mydata();
		data.a = 6;
		data.b = 9;
		System.out.println("Swap方法前，a的值是" + data.a + "；b的值是" + data.b);
		swap(data);
		System.out.println("Swap方法後，a的值是" + data.a + "；b的值是" + data.b);
	}

}
