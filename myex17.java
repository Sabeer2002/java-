import java.util.Scanner;

class Time {
	int hr, min, sec;
	Scanner sc = new Scanner(System.in);

	void input() {
		System.out.println("Enter hr,mn,sec");
		hr = sc.nextInt();
		min = sc.nextInt();
		sec = sc.nextInt();
	}

	void display() {
		System.out.println(hr + ":" + min + ":" + sec);
	}

	Time process(Time b) {
		Time c = new Time();
		c.hr = hr + b.hr;
		c.min = min + b.min;
		c.sec = sec + b.sec;

		c.min = c.min + c.sec / 60;
		c.sec = c.sec % 60;
		c.hr = c.hr + c.min / 60;
		c.min = c.min % 60;

		return c;
	}

}

class Main {
	public static void main(String... arg) {
		Time a = new Time();
		Time b = new Time();
		a.input();
		b.input();
		Time c = a.process(b);
		c.display();
	}
}