package src.stack;


import java.sql.SQLOutput;

public class Runner {
  public static void main(String[] args) {
    Stack nums = new Stack();
    nums.push(12);
    nums.push(10);
    System.out.println("This is the top element" + nums.peek());
    System.out.println("This is the size" + nums.size());
    System.out.println(nums.isEmpty());
    nums.show();
  }
}
