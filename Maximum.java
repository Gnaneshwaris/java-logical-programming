import java.util.Scanner;

class Maximum {
  int a, b;

  void max() {
    if (a > b) {
      System.out.println("value of a is maximum");
    } else {
      System.out.println("value of b is maximum");
    }
  }

}

class Max {
  public static void main(String[] args) {
    int a, b;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of a");
    a = sc.nextInt();
    System.out.println("enter the value of b");
    b = sc.nextInt();
    Maximum m = new Maximum();
    m.max();

  }
}