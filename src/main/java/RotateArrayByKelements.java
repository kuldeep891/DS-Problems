/*
 * Array - 2,3,4,5,6 k=3  rotate array to left by k elements
   Output - 5,6,2,3,4
 * 
 */

package main.java;

public class RotateArrayByKelements {

	public static void main(String[] args) {
		int arr[] = {-2,3,4,5,6,7,8};
		int k = 3, n= arr.length;
		int replace = 0;
		for(int i=0; i<k;i++) {
			replace = arr[i];
			arr[i] = arr[k+i];
			arr[k+i] = replace;
		}
		for(int i=0;i<n;i++)
			System.out.print(arr[i] + ", " );
	}

}
