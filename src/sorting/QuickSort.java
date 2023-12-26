package src.sorting;

public class QuickSort {
  public static void main(String[] args) {
    int[] nums = {1, 57, 88, 9, 0};

    System.out.println("Array before sorting");
    for (int num : nums) {
      System.out.print(num + " ");
    }

    quickSort(nums, 0, nums.length - 1);


    System.out.println("\n" + "Array after sorting");
    for (int num : nums) {
      System.out.print(num + " ");
    }
  }

  private static void quickSort(int[] nums, int low, int high) {
    if (low < high) {
      int pr = partition(nums, low, high);

      quickSort(nums, low, pr - 1);
      quickSort(nums, pr + 1, high);
    }
  }

  private static int partition(int[] nums, int low, int high) {
    int pivot = nums[high];
    int i = low - 1;
    for (int j = low; j < high; j++) {
      if (nums[j] < pivot) {
        i++;
        swap(nums, i, j);
      }
    }
    swap(nums, i + 1, high);
    return i + 1;
  }

  private static void swap(int[] arr, int n1, int n2) {
    int temp = arr[n1];
    arr[n1] = arr[n2];
    arr[n2] = temp;
  }
  /*
   * pseudocode for quick sort
   * main
   *   A(elements to be sorted)
   * quickSort(A,0,length(A)-1,)
   *
   * function quickSort(A, low, high)
   * if low < high
   * pr = partition(A, low, high)
   *
   * quickSort(A, low, pr-1)
   * quickSort(A, pr+1, high)
   * end function
   *
   * function partition(A, low, high)
   * pivot = A[high]
   * i = low-1
   * for j from low to high
   * if A[j] < pivot
   * i++
   * swap(A,A[i],A[j])
   *
   * end if
   * end for
   * swap(A, A[i+1], high)
   * return i+1
   *
   * end function
   *
   * function swap(A,e1, e2)
   * temp = e1
   * A[e1] = A[e2]
   * A[e2] = temp*/


}
