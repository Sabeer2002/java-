import java.util.*;

class Stud {
	int sno;
	String name;
	double wt;
	Scanner sc = new Scanner(System.in);

	void input() {
		System.out.println("Enter stud number,name,wt");
		sno = sc.nextInt();
		name = sc.next();
		wt = sc.nextDouble();
	}

	void process(Stud s[], int n) {
		for (int i = 0; i < s.length - 1; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].wt > s[j].wt) {
					Stud c = s[i];
					s[i] = s[j];
					s[j] = c;
				}
			}
		}

	}

	void output() {
		System.out.println("student num= " + sno + "\t" + "stud name= " + name + "\t" + "student wt= " + wt);
	}
}

class Main {
	public static void main(String... arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int n = sc.nextInt();
		Stud s[] = new Stud[n];
		Stud d = new Stud();
		for (int i = 0; i < n; i++) {
			s[i] = new Stud();
		}
		for (int i = 0; i < n; i++) {
			s[i].input();
		}
		d.process(s, n);
		for (int i = 0; i < n; i++) {
			s[i].output();

		}
	}
}