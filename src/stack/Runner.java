package src.stack;


public class Runner {
  public static void main(String[] args) {
    Stack nums = new Stack();
//    nums.push(12);
//    nums.show();
//    nums.push(10);
//    nums.show();

    DynamicStack Dstack = new DynamicStack();
    Dstack.push(12);
    Dstack.show();
    Dstack.push(10);
    Dstack.show();
    Dstack.push(12);
    Dstack.show();
    Dstack.push(10);
    Dstack.show(); Dstack.show();
    Dstack.push(10);
    Dstack.show();

  }
}
