import java.util.Scanner;

// import Prog1Tools.IOTools;
public class Main {
  private static int exchangeCount = 0;

  public static void main(String[] args) {
    int[] array = { 12, 9, 4, 99, 120, 1, 3, 10, 23, 45, 75, 69, 31, 88, 101, 14, 29, 91, 2, 0, 77 };
    System.out.println("Before sorting:");
    printArray(array);

    mergeSort(array, 0, array.length - 1);

    System.out.println("\nAfter sorting:");
    printArray(array);

    System.out.println("\nNumber of exchanges: " + exchangeCount);
  }

  // Merge Sort function

  public static void mergeSort(int[] array, int left, int right) {

    if (left < right) {
      int middle = (left + right) / 2;

      mergeSort(array, left, middle);
      mergeSort(array, middle + 1, right);

      merge(array, left, middle, right);
    }
  }

  // Merge function to merge two halves
  public static void merge(int[] array, int left, int middle, int right) {
    int n1 = middle - left + 1;
    int n2 = right - middle;

    int[] leftArray = new int[n1];
    int[] rightArray = new int[n2];

    for (int i = 0; i < n1; ++i)
      leftArray[i] = array[left + i];
    for (int j = 0; j < n2; ++j)
      rightArray[j] = array[middle + 1 + j];

    int i = 0, j = 0;
    int k = left;

    while (i < n1 && j < n2) {
      if (leftArray[i] <= rightArray[j]) {
        array[k] = leftArray[i];
        i++;
      } else {
        array[k] = rightArray[j];
        j++;
        exchangeCount++;
      }
      k++;
    }

    while (i < n1) {
      array[k] = leftArray[i];
      i++;
      k++;
    }

    while (j < n2) {
      array[k] = rightArray[j];
      j++;
      k++;
    }
  }

  // Helper function to print the array
  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
}
