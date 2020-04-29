
public class ValueTransferDemo {

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Swap方法裡，a的值是" + a + "；b的值是" + b);
	}
	public static void main(String[] args) {
		int a = 6;
		int b = 9;
		System.out.println("Swap方法前，a的值是" + a + "；b的值是" + b);
		swap(6, 9);
		System.out.println("Swap方法後，a的值是" + a + "；b的值是" + b);
		}
	}

