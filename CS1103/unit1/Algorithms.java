package unit1;
import java.util.Arrays;

public class Algorithms {
	static int MAX_VALUE=10000;
	public static void main(String[] args) {
		runSort(1000);
		runSort(10000);
		runSort(100000);
	}
	
	static void runSort(int ARRAY_SIZE) {
		// perform three different sorts and measure the time it takes
				
		// Generate an array and store random numbers.
		int[] InsertSort = new int[ARRAY_SIZE];
		int[] SelectionSort = new int[ARRAY_SIZE];
		int[] BuiltinSort = new int[ARRAY_SIZE];
		int i;
		for(i=0;i<ARRAY_SIZE;i++) {
			InsertSort[i]=(int) (Math.random()*MAX_VALUE);
			SelectionSort[i]=InsertSort[i];
			BuiltinSort[i]=InsertSort[i];
		}
		// Measure InsertSort time
		System.out.println(ARRAY_SIZE+"records");
		long startTime = System.currentTimeMillis();
		insertionSort(InsertSort);
		long runTime = System.currentTimeMillis() - startTime;
		System.out.println("InsertSort:"+runTime/1000.0+"sec");
		
		// Measure SelectionSort
		startTime = System.currentTimeMillis();
		selectionSort(SelectionSort);
		runTime = System.currentTimeMillis() - startTime;
		System.out.println("SelectionSort:"+runTime/1000.0+"sec");
		
		// Measure Built-inSort
		startTime = System.currentTimeMillis();
		Arrays.sort(BuiltinSort);
		runTime = System.currentTimeMillis() - startTime;
		System.out.println("Built-inSort:"+runTime/1000.0+"sec");
	}
	
	static void insertionSort(int[] A) {
	      // Sort the array A into increasing order.
	      
	   int itemsSorted; // Number of items that have been sorted so far.

	   for (itemsSorted = 1; itemsSorted < A.length; itemsSorted++) {
	         // Assume that items A[0], A[1], ... A[itemsSorted-1] 
	         // have already been sorted.  Insert A[itemsSorted]
	         // into the sorted part of the list.
	         
	      int temp = A[itemsSorted];  // The item to be inserted.
	      int loc = itemsSorted - 1;  // Start at end of list.
	      
	      while (loc >= 0 && A[loc] > temp) {
	         A[loc + 1] = A[loc]; // Bump item from A[loc] up to loc+1.
	         loc = loc - 1;       // Go on to next location.
	      }
	      
	      A[loc + 1] = temp; // Put temp in last vacated space.
	   }
	}
	static void selectionSort(int[] A) {
	      // Sort A into increasing order, using selection sort
	      
	   for (int lastPlace = A.length-1; lastPlace > 0; lastPlace--) {
	         // Find the largest item among A[0], A[1], ...,
	         // A[lastPlace], and move it into position lastPlace 
	         // by swapping it with the number that is currently 
	         // in position lastPlace.
	         
	      int maxLoc = 0;  // Location of largest item seen so far.
	      
	      for (int j = 1; j <= lastPlace; j++) {
	         if (A[j] > A[maxLoc]) {
	               // Since A[j] is bigger than the maximum we've seen
	               // so far, j is the new location of the maximum value
	               // we've seen so far.
	            maxLoc = j;  
	         }
	      }
	      
	      int temp = A[maxLoc];  // Swap largest item with A[lastPlace].
	      A[maxLoc] = A[lastPlace];
	      A[lastPlace] = temp;
	      
	   }  // end of for loop
	   
	}
	
}
