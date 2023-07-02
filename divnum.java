import java.util.Scanner;

class divnum {
  int a;
  Scanner sc = new Scanner(System.in);

  void div() {
    System.out.println("enter a value:");
    a = sc.nextInt();
    if ((a % 5 == 0) && (a % 11 == 0)) {
      System.out.println("num is divisible by 5 and 11");
    } else {
      System.out.println(" num is not division");
    }

  }

}

class main {
  public static void main(String[] args) {
    divnum m1 = new divnum();
    m1.div();
  }
}