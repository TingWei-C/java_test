
public class ChangeParamDemo {

	public static int add(int a, int... b) {
		int sum = a;
		for (int e : b) {
			sum += e;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("3+4=" + add(3, 4));
		System.out.println("3+4+5=" + add(3, 4, 5));
		System.out.println("3+4+5+6=" + add(3, 4, 5, 6));
		int[] ary = { 7, 8, 9, 10, 11, 12 };
		System.out.println("6+7+8+9+10+11+12=" + add(6,ary));
	}

}
