package p1;

public class MyClass1 {
	public int a = 5;
	private int b = 10;
	protected int c = 20;
	int d = 30;
	public void func1() {
		System.out.println("func1");
	}
	private void func2() {
		System.out.println("func2");
		System.out.println(b);
	}
	protected void func3() {
		System.out.println("func3");
	}
	void func4() {
		System.out.println("func4");
	}
}
