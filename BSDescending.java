import java.util.Scanner;

public class BSDescending {

	public static void main(String[] args) {
		int a[] = { 98, 76, 34, 23, 10, 4 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter search element:");
		int target = sc.nextInt();
		int ans = binarySearch(a, target);
		System.out.println(ans);

	}

	static int binarySearch(int a[], int target) {
		int start = 0;
		int end = a.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target > a[mid]) {
				end = mid - 1;
			} else if (target < a[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}

		}
		return -1;
	}

}
