class currentbill1 {
  int cno = 21, pmr = 16, lmr = 20, tunits;
  String cname = "gnana";
  float bill;

  void units() {
    tunits = pmr - lmr;

  }

  void tbill() {
    bill = (float) (3.80) * tunits;

  }

  void display() {
    System.out.println("the consumer number is" + cno);
    System.out.println("the consumer name is" + cname);
    System.out.println("The total units " + tunits);
    System.out.println("the  total current bill " + bill);
  }

}

class Currentbill1{
  public static void main(String[] args) {
    currentbill1 m1 = new currentbill1();
    m1.units();
    m1.tbill();
    m1.display();

  }
}