package javaConcept;

public class BinarySearchImplementaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] a = { 10, 15, 30, 40, 50, 60, 70, 80, 90 };

		//boolean found = binarySearch(a, 20);
		// System.out.println(found);

		int[] b = { 30, 40, 50, 60, 70, 80, 90, 10, 15 };

		int index = modifiedBinarySearch(b, 80);
		System.out.println("index found in : " + index);

	}

	static int modifiedBinarySearch(int[] a, int n) {

		int low = 0;
		int high = a.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (a[mid] == n) {
				return mid;
			} else if (a[mid] >= a[low]) {// if mid element is grater then low element then low to mid is sorted

				if (n <= a[mid] && n >= a[low]) { // to check if my searching element is between low and mid
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else if (a[mid] <= a[high]) {// if mid element is less then high element then mid to high is sorted

				if (n >= a[mid] && n <= a[high]) {// to check if my searching element is between mid and high
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}

		}

		return -1;
	}

//	static boolean binarySearch(int[] a, int n) {
//
//		int i = 0;
//		int j = a.length - 1;
//
//		while (i < j) {
//
//			int mid = (i + j) / 2;
//
//			if (a[mid] == n) {
//				return true;
//			} else if (a[mid] > n) {
//				j = mid - 1;
//			} else {
//				i = mid + 1;
//			}
//
//		}
//		return false;
//	}

}
