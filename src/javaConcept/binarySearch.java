package javaConcept;

public class binarySearch {

	public static void main(String[] args) {

		int[] array = {12,12,63,63,63,3,3,4,4,1,5,5};

		//oddRepeat(array);
		 findRepeating(array);
		
	}
	public static void findRepeating(int[] A){
		int xor = 0;
		for (int i: A) { //o(N)
			xor ^= (1 << i);
		}

		System.out.printf(" ");
		for (int i: A){//o(N)
			if ((xor & (1 << i)) != 0){ // insertion operator
				System.out.print(i + " ");
				xor ^= (1 << i); // to avoid printing duplicates
			}
		}
		
		//o(N)+o(N) == o(2N) == o(N)
	}

	
	

//	public static void oddRepeat(int[] array) { //O(N)
//
//		int length = array.length;
//		//12,12,63,63,3,3,4,4,4,5,5,13,13,13,5
//
//		int i=0;
//
//		int j=1;
//
//		int count =1;
//
//		while(j<length) {
//
//			int start = array[i];
//
//			int next = array[j];
//
//			if(start == next) {
//
//				count++;
//
//			}else {
//
//				count=1;
//
//			}
//
//			if(count !=1 && count%2 != 0) {
//
//				System.out.print(start+" ");
//
//			}
//
//			j++;
//
//			i++;
//
//		}
//
//
//
//	}

}
