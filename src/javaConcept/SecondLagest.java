package javaConcept;

public class SecondLagest {
	
	public static void main(String[] args) {
		
	
	int arr[] = { 3,7,9,6};
    int largest = arr[0];
    int secondLargest = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > largest) {
            secondLargest = largest;
            largest = arr[i];
        } else if (arr[i] > secondLargest && arr[i] != largest) {
             secondLargest = arr[i];
        }
    }
    System.out.println("Second largest number in an array is:" + secondLargest);
}


}
