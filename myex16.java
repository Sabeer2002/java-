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

	void process(Time a, Time b) {
		hr = a.hr + b.hr;
		min = a.min + b.min;
		sec = a.sec + b.sec;
		min = min + sec / 60;
		sec = sec % 60;
		hr = hr + min / 60;
		min = min % 60;
	}

}

class Main {
	public static void main(String... arg) {
		Time a = new Time();
		Time b = new Time();
		Time c = new Time();
		a.input();
		b.input();
		c.process(a, b);
		c.display();
	}
}
