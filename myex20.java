// Method overloading (compile time polymorphism)
class Function {
	int fun(int a, int b) {
		return a + b;
	}

	float fun(float a, float b, float c) {
		return a + b + c;
	}

	float fun(float a, float b) {
		return a - b;
	}

	int fun(int a, int b, int c) {
		return a * b * c;
	}
}

class FunMain {
	public static void main(String... arg) {
		Function f = new Function();
		System.out.println("Add of 2 int value= " + f.fun(2, 3));
		System.out.println("Add of 3 float value= " + f.fun(4.0f, 5.0f, 6.0f));
		System.out.println("Sub of 2 flaot value= " + f.fun(6.0f, 7.0f));
		System.out.println("Mul of 3 int value= " + f.fun(2, 3, 4));
	}
}
