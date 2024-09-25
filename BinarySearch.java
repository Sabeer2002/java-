import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { -20, -4, 0, 2, 3, 6, 9, 22, 45, 88, 90 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to search:");
		int target = sc.nextInt();
		int ans = binarySearch(arr, target);
		System.out.println("Index of elemlent= " + ans);

	}

	// if the element found it return index of an element
	// else it return -1
	static int binarySearch(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
