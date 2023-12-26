package src.sorting;

public class InsertionSort {
  public static void main(String[] args) {
    int[] nums = {1, 35, 6, 7, 8, 9,};
    int size = nums.length;


    System.out.println("numbers before sorting ");
    for (int num : nums) {
      System.out.print(num + " ");
    }

    // the insertion sort
    for (int i = 1; i < size; i++) {
      int key = i;
      int j = i - 1;

      while (j <= 0 && nums[j] > key) {
        nums[j + 1] = nums[j];
        j--;
      }
      nums[j + 1] = key;
    }


    System.out.println("numbers before sorting ");
    for (int num : nums) {
      System.out.print(num + " ");
    }
  }
  /*
  * pseudocode for insertion sort
  *
  * pseudocode insertionSort(A array of values to be sorted)
          * for i from i+ 1 to size(A)
              * j=i-1
              * key = i
              * while(j>=0 and A[j] > key)
                  * A[j+1] = A[j]
                  * j--
              * end while
              * A[j+1] = key
          * end for
  * end pseudocode
  * */


}
