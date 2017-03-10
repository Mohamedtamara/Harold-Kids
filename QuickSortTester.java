import java.util.Arrays;

public class QuickSortTester {
    /**
       class QuickSortTester tests the runtime in miliseconds for the QuickSort algorithim
       tester() creates a 2D array, with 50 arrays of length n
       *each array is sorted using quicksort
       *time is calculated from start to finish, and then averaged by 50
       *besides qsort(), the only other operation being timed is accessing arrays from the 2D array
       *but this time is negligable
       *tests are preformed for arrays of length: 100, 1000, 10,000, 100,000
    **/

    public static double tester(int n) {

	int[][] tester = new int[50][n];
	for (int i = 0; i < tester.length; i++) {
	    for (int j = 0; j < tester[i].length; j++) {
		tester[i][j] = (int) (Math.random() * 1000);
	    }
	}

	//get start time
	long startTime = System.currentTimeMillis();
	//System.out.println(startTime);

	//sort every array
	for (int[] arr : tester) {
	    QuickSort.qsort(arr);
	    //System.out.println(Arrays.toString(arr));
	}

	//get end time
	long endTime = System.currentTimeMillis();
	//System.out.println(endTime);

	//return average time
	//System.out.println(endTime - startTime);
	return (double)(endTime - startTime) / 50.0;
    }

    public static void main(String[] args) {
	for (int i = 2; i < 8; i++) {
	    System.out.println("Length " + (int) Math.pow(10, i) + ": " + tester((int)(Math.pow(10, i))) + " milliseconds");
    }

}

}
