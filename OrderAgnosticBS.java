import java.util.Scanner;

public class OrderAgnosticBS {

	public static void main(String[] args) {
		// int arr[] = { -20, -4, 0, 2, 3, 6, 9, 22, 45, 88, 90 };
		int arr[] = { 98, 76, 34, 23, 10, 4 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to search:");
		int target = sc.nextInt();
		int ans = binarySearch(arr, target);
		System.out.println("Index of elemlent= " + ans);
	}

	static int binarySearch(int a[], int target) {
		int start = 0;
		int end = a.length - 1;
		boolean isAscending = a[start] < a[end];

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == a[mid]) {
				return mid;
			}
			if (isAscending) {
				if (target < a[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target > a[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return -1;
	}
}
