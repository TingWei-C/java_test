
public class OverloadDemo {
	public int add(int a, int b) {
		return a + b;
	}

	public float add(float a, float b) {
		return a + b;
	}

	public double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		OverloadDemo obj = new OverloadDemo();
		System.out.println(obj.add(8, 6));
		System.out.println(obj.add(5.1F, 6.8F));
		System.out.println(obj.add(3.1415926, 8.6));
	}

}
