
import java.util.Scanner;

class max3 {
  int a, b, c;
  Scanner sc = new Scanner(System.in);

  void max() {
    System.out.println("enter a,b,c value:");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    if ((a > b) && (a > c)) {
      System.out.println("a is the maximum");
    } else if ((b > c) && (b > a)) {
      System.out.println("b is the maximum");
    } else {
      System.out.println("c is the maximum");
    }
  }

}

class main {
  public static void main(String[] args) {
    max3 m1 = new max3();
    m1.max();
  }
}