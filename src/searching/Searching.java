package src.searching;


public class Searching {
  public static void main(String[] args) {
    int[] nums = new int[1000];
    int target = 500;
    int result1 = linearSearch(nums, target);
    int result2 = binarySearch(nums, target, 0, nums.length - 1);

    if (result1 != -1 || result2 != -1)
      System.out.println("Element found on index : " + result1);
    else System.out.println("Element not found!");
  }

  //linear search
  public static int linearSearch(int[] nums, int target) {
    //number of steps
    int steps = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      steps++;
      if (nums[i] == target) {
        System.out.println("Steps taken to get the element " + steps);
        return i;
      }
    }
    ;
    System.out.println("Steps taken to get the element by linear search " + steps);

    return -1;
  }

  //binary search
  public static int binarySearch(int[] nums, int target, int left, int right) {

    //using recursion
    if (left <= right) {
      int mid = (left + right) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] < target)
        binarySearch(nums, target, mid + 1, right);
      else binarySearch(nums, target, left, mid - 1);
    }


  // using while loop
//    while (left <= right) {
//      steps++;
//      int mid = (left + right) / 2;
//      if (nums[mid] == target) {
//        System.out.println("Steps taken to get the element by binary search " + steps);
//        return mid;
//      } else if (nums[mid] < target)
//        left = mid + 1;
//      else right = mid - 1;
//    }
//    System.out.println("Steps taken to get the element by binary  search "+steps);

    return-1;
}
}
