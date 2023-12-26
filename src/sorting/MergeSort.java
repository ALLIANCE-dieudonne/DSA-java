package src.sorting;
/*
*
*
*
* --------------needs a review-----------
*
*
*
* */





public class MergeSort {
  public static void main(String[] args) {
    int[] nums = {12, 56, 78, 9, 0};
    System.out.println("Numbers before sorting!!");
    for (int n : nums) {
      System.out.print(n);
    }

    mergeSort(nums, 0, nums.length - 1);


    System.out.println("\n Numbers after sorting!!");
    for (int n : nums) {
      System.out.print(n);
    }
  }

  private static void mergeSort(int[] nums, int left, int right) {
    if (left < right) {
      int mid = (right + left) / 2;
      mergeSort(nums, left, mid);
      mergeSort(nums, mid + 1, right);
      merge(nums, left, right, mid);
    }
  }

  private static void merge(int[] nums, int left, int right, int mid) {

    int length1 = mid - left ;
    int length2 = right - mid;

    int[] lArray = new int[length1];
    int[] rArray = new int[length2];

    for (int x = 0; x < length1; x++) {
      lArray[x] = nums[length1 + x];
    }
    for (int y = 0; y < length2; y++) {
      rArray[y] = nums[mid + 1 + y];
    }

    int i = 0;
    int j = 0;
    int k = left;

    while (i < length1 && j < length2) {
      if (lArray[i] < rArray[j]) {
        nums[k] = lArray[i];
        i++;
      } else {
        nums[k] = rArray[j];
        j++;
      }
      k++;
    }
    while (i <length1){
      nums[k] = lArray[i];
      i++;
      k++;
    }
    while (j <length1){
      nums[k] = rArray[j];
      j++;
      k++;
    }

  }
}
