/*****************************************************
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr): 
 * Runs one partition, guarenteeing the value at pivot position is now in its proper place
 * Runs partitions on left and right side of pivot
 * Recursively does this until array is sorted
 * One portion that is sorted by partition while be completed when its left and right bounds overlap
 *x
 * 2a. Worst pivot choice / array state and associated runtime: 
 * When array is in descending order, and pivot choice is at 0, then runtime will be O(n^2)
 *
 * 2b. Best pivot choice / array state and associated runtime:
 * When array is in ascending order and pivot choice is at 0, then runtime will be O(1)
 *
 * 3. Approach to handling duplicate values in array:
 * This handles dupilcates as they will always be pushed to the immediate right of the pivot, and the next pivot position is always 0. I didn't really think about coding this to work, but I ran it and it seemed to work just fine. I don't see why duplicates would present a problem.
 *
 *****************************************************/

import java.util.Arrays;

public class QuickSort {


    //partitions arr into left and right sides
    //left side's lower bound is start, and it contains values smaller than target's
    //righ side's upper bound is end, and it contains values larger than target's
    public static int partition(int[] arr, int start, int end, int target) {
	int v = arr[target];
	
	//swap arr[target], arr[end]
	arr[target] = arr[end];
	arr[end] = v;

	int s = start;
	for (int i = start; i < end; i++) {
	    if (arr[i] < v) {
		//swap arr[s], arr[i]
		int temp = arr[s];
		arr[s] = arr[i];
		arr[i] = temp;
		
		s++;
	    }}
	//swap arr[end], arr[s]
	int temp = arr[end];
	arr[end] = arr[s];
	arr[s] = temp;

	//System.out.println(Arrays.toString(arr));
	return s;
    }//end partition()

    //wrapper method for qsortHelper
    public static void qsort(int[] d) {
	 qsortHelper(d, 0, d.length - 1);
    }//end qsort()


    //sorts array d in acending order
    //algorithim details at top of class
    public static void qsortHelper(int[] d, int left, int right) {
	//when left >= right, that portion of array is already sorted
	if (left < right) {
	    //partition array from left to right with arbitrarily chosen pivot position, left
	    int pvtPos = partition(d, left, right, left);
	    //sort left side
	    qsortHelper(d, left, pvtPos - 1);
	    //sort right side
	    qsortHelper(d, pvtPos + 1, right);
	}
    }//end qsortHelper()


    //return int array of size s, with each element fr range [0,maxVal)
    public static int[] buildArray( int s, int maxVal ) {
	int[] retArr = new int[s];
	for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = (int)( maxVal * Math.random() );
	return retArr;
    }//end buildArray()

    public static void main(String[] args) {
	int[] a = {4, 5, 8, 1, 3, 7, 9, 10, 11, 23, 2};
	System.out.println(Arrays.toString(a));
	qsort(a);
	System.out.println(Arrays.toString(a));

	int[] b = buildArray(50, 100);
	System.out.println(Arrays.toString(b));
	qsort(b);
	System.out.println(Arrays.toString(b));
    }//end main()


}//end class QuickSort
