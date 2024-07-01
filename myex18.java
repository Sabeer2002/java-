class Test {
	int a, b;

	void set(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void display() {
		System.out.println(a + "\t" + b);
	}
}

class Main {
	public static void main(String... arg) {
		Test t = new Test();
		t.set(10, 20);
		t.display();
	}
}