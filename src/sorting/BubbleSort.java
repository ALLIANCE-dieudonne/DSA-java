package src.sorting;

public class BubbleSort {
  public static void main(String[] args) {
    int[] nums = {1, 35, 6, 7, 8, 9,};
    int size = nums.length;
    int temp = 0;

    System.out.println("numbers before sorting ");
    for (int num : nums) {
      System.out.print(num + " ");
    }

    // the bubble sort
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size - i - 1; j++) {
        if (nums[j] > nums[j + 1]) {
          temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;
        }
      }
    }

    System.out.println("\n");
    System.out.println("numbers after sorting");
    for (int num : nums) {
      System.out.print(num + " ");
    }
  }

  /*
   *
   * pseudocode for bubble sort
   *
   * pseudocode bubbleSort(A(array to be sorted))
         * size = length of A
         * temp = 0
         *
         * for i from o to size
           * for j from to size-1
                 * if A[j] > A[j+1] then
                 * temp = A[j]
                 * A[j] = A[j+1]
                 * A[j+1] = A[j]
                 * end if
           * end for
         * end for
   * end pseudocode
   * */
}
