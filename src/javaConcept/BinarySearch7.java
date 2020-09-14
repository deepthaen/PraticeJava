package javaConcept;

public class BinarySearch7 {
	public static void main(String[] args) {
		int[] a = {10,20,30,40,15,50,90};
		
		int index = binarySearch(a,20);
		System.out.println("Index of given element ::" + index);
		if(index == -1) {
			System.out.println("Given Number does not exist");
		}else {
			System.out.println("Given number exist");
		}
	}
	
	
	static int binarySearch(int[] a, int n) {
		int low = 0;
		int high = a.length-1;
		
		while(low <= high) {
			int mid = (low+high)/2;
			
			if(a[mid] == n) {
				return mid;
			}else if(a[mid] >= a[low]) {
				if(n <= a[mid] && n >= a[low]) {
					high = mid-1;
				}else {
					low = mid+1;
				}
			}else if(a[mid] <= a[high]) {
				if(n >= a[mid] && n <= a[high]) {
					low = mid+1;
				}else {
					high = mid-1;
				}
			}
		}
		return -1;
	}

}
