import java.util.Scanner;

public class ArrayInsertion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		int a[] = new int[100];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter " + (i + 1) + " elements:");
			a[i] = sc.nextInt();
		}

		System.out.println("Enter value and position:");
		int val = sc.nextInt();
		int pos = sc.nextInt();

		for (int i = size; i >= pos; i--) {
			a[i] = a[i - 1];
		}
		a[pos - 1] = val;
		size = size + 1;

		for (int i = 0; i < size; i++) {
			System.out.println(a[i]);
		}

	}

}
