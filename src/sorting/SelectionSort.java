package src.sorting;

public class SelectionSort {
  public static void main(String[] args) {
    int[] nums = {1, 35, 6, 7, 8, 9,};
    int size = nums.length;
    int temp = 0;
    int minIndex = 0;

    System.out.println("numbers before sorting ");
    for (int num : nums) {
      System.out.print(num + " ");
    }

    // the selection sort
    for (int i = 0; i < size - 1; i++) {
      minIndex = i;
      //finding the smallest number
      for (int j = i + 1; j < size; j++) {
        if (nums[minIndex] > nums[j]) {
          minIndex = j;
        }
      }

      //swapping the values
      temp = nums[minIndex];
      nums[minIndex] = nums[i];
      nums[i] = temp;

    }

    System.out.println("\n");
    System.out.println("numbers after sorting");
    for (int num : nums) {
      System.out.print(num + " ");
    }
  }

  /*
   * pseudocode selectionSort(A array of elements to be sorted)
         * size = length A
         * temp =0;
         * minIndex = -1
         *
             * for i from i to size-1
                   * for j from i+i to size
                         * if A[minIndex] > A[j] then
                              * minIndex = j
                         * end if
                   * end for
                 *
                 * temp = A[minIndex]
                 * A[minIndex] =A[i]
                 * A[i] = A[minIndex]
             * end for
   * end pseudocode
   */
}
