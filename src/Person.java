
public class Person {

	// �m�W
	private String name;
	// �~��
	private int age;
	// �a�}
	private String add;

	public Person() {
	}

	public Person(String name, int age, String add) {
		this.name = name;
		this.age = age;
		this.add = add;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public void display() {
		System.out.println("�m�W�G" + name + "�A�~�֡G" + age + "�A�a�}�G" + add);
	}
}
