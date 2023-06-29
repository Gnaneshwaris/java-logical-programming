class arithmatic {
  int a = 10, b = 40;
  int c;

  void add() {
    c = a + b;
    System.out.println("the addition value is:" + c);
  }

  void sub() {
    c = b - a;
    System.out.println("the subtraction value is:" + c);
  }

  void mul() {
    c = a * b;
    System.out.println("the multiplication value is:" + c);
  }

  void div() {
    c = a / b;
    System.out.println("the division value is:" + c);
  }
}

class arithmatic1 {

  public static void main(String args[]) {
    arithmatic a1 = new arithmatic();
    a1.add();
    a1.sub();
    a1.mul();
    a1.div();
  }
}