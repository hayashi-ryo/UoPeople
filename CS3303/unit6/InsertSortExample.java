public class InsertionSortExample {
  public static void insertionSort(int array[]) {
    int n = array.length;
    for (int j = 1; j < n; j++) {
      int key = array[j];
      int i = j - 1;
      while ((i > -1) && (array[i] > key)) {
        array[i + 1] = array[i];
        i--;
      }
      array[i + 1] = key;
    }
  }

  public static void main(String a[]) {
    int[] arr1 = { 12, 9, 4, 99, 120, 1, 3, 10, 23, 45, 75, 69, 31, 88, 101, 14, 29, 91, 2, 0, 77 };
    System.out.println("Printing unsorted array before Insertion sort");
    for (int i : arr1) {
      System.out.print(i + " ");
    }
    System.out.println();
    insertionSort(arr1);// sorting array using insertion sort
    System.out.println("Printing sorted array after Insertion sort");
    for (int i : arr1) {
      System.out.print(i + " ");
    }
  }
}