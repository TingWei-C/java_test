
public class ValueTransferDemo {

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Swap��k�̡Aa���ȬO" + a + "�Fb���ȬO" + b);
	}
	public static void main(String[] args) {
		int a = 6;
		int b = 9;
		System.out.println("Swap��k�e�Aa���ȬO" + a + "�Fb���ȬO" + b);
		swap(6, 9);
		System.out.println("Swap��k��Aa���ȬO" + a + "�Fb���ȬO" + b);
		}
	}

