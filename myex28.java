
//multiole inheritance using interface
import java.util.Scanner;

interface InOut {
	void input();

	void read();

	void output();
}

interface Process {
	void area();

	void vol();
}

class Circle implements InOut, Process {
	double r, a;
	Scanner sc = new Scanner(System.in);

	public void input() {
		System.out.println("Enter radius");
		r = sc.nextDouble();
	}

	public void area() {
		a = 3.14 * r * r;
	}

	public void output() {
		System.out.println("Area of circle= " + a);
		System.out.println("Radius of circle= " + r);
	}

	public void read() {
	};

	public void vol() {
	};
}

class Cylinder extends Circle implements InOut, Process {
	double h, v;

	public void input() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Height:");
		h = sc.nextDouble();
		super.input();
	}

	public void vol() {
		super.area();
		v = a * h;
	}

	public void output() {
		super.output();
		System.out.println("Height of Cylinder= " + h);
		System.out.println("Volume of Cylinder= " + v);
	}
}

class MulInterfaceMain {
	public static void main(String... arg) {
		Cylinder c = new Cylinder();
		c.input();
		c.vol();
		c.output();
	}
}