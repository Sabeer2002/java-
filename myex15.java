import java.util.Scanner;

class Complex {
	int rp, ip;
	Scanner sc = new Scanner(System.in);

	void input() {
		System.out.println("Enter rp,ip");
		rp = sc.nextInt();
		ip = sc.nextInt();
	}

	void display() {
		if (ip > 0) {
			System.out.println(rp + "+" + ip + "i");
		} else {
			System.out.println(rp + " " + ip + "i");
		}
	}

	Complex process(Complex b) {
		Complex c = new Complex();
		c.rp = rp + b.rp;
		c.ip = ip + b.ip;
		return c;
	}
}

class Main {
	public static void main(String... arg) {
		Complex a = new Complex();
		Complex b = new Complex();
		a.input();
		b.input();
		Complex c = a.process(b);
		c.display();
	}
}