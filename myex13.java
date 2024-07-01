import java.util.*;

class Stud {
	int sno;
	double wt;
	Scanner sc = new Scanner(System.in);

	void input() {
		System.out.println("Enter no and wt");
		sno = sc.nextInt();
		wt = sc.nextDouble();
	}

	public String toString() {
		return this.sno + "\t" + this.wt;
	}
}

class Main {
	public static void main(String... arg) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of students");
		int n = sc.nextInt();
		Stud s[] = new Stud[n];

		for (int i = 0; i < n; i++) {
			s[i] = new Stud();
		}

		for (int i = 0; i < n; i++) {
			s[i].input();
		}

		Arrays.sort(s, (x, y) -> Integer.compare(x.sno, y.sno));

		for (int i = 0; i < n; i++)
			System.out.println(s[i]);

	}
}
