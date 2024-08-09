import java.util.Scanner;

class DynamicMethoDispatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		First f = new First();
		Second s = new Second();
		int ch;
		do {
			System.out.println("First==1");
			System.out.println("Second==2");
			System.out.println("Exit==3");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				f.display();
				break;
			case 2:
				s.display();
				break;
			case 3:
				break;
			default:
				System.out.println("Invalid choice!");
			}
		} while (ch != 3);

	}

}

class First {
	void display() {
		System.out.println("Iam First class method");
	}
}

class Second {
	void display() {
		System.out.println("Iam Second class method");
	}
}
