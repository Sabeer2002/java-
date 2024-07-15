
// default constructor
import java.util.Scanner;

class Example {
	int a, b;

	Example() {// default constructor
		this.a = 10;
		this.b = 20;
	}

	Example(int a, int b) {// parameterized constructor
		this.a = a;
		this.b = b;
	}

	Example(Example e2) {// copy constructor
		a = e2.a;
		b = e2.b;
	}

	void output() {
		System.out.println("a= " + a + "\t" + "b= " + b);
	}

}

class Main {
	public static void main(String... arg) {
		Scanner sc = new Scanner(System.in);
		
		Example e1 = new Example();		
		
		System.out.println("Enter value of a,b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Example e2 = new Example(a, b);
		
		System.out.println("Enter two values:");
		a = sc.nextInt();
		b = sc.nextInt();
		Example e3 = new Example(a, b);
		
		Example e4 = new Example(e2);

		System.out.println("1st object");
		e1.output();
		System.out.println("2nd object");
		e2.output();
		System.out.println("3rd object");
		e3.output();
		System.out.println("4th object");
		e4.output();
	}
}