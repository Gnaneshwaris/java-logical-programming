class student {
  int sno = 10, s1 = 70, s2 = 89, s3 = 90, sum;
  String sname = "gnana";
  float avg;

  void sum() {
    sum = (s1 + s2 + s3);

  }

  void average() {
    avg = (float) (sum) / 3;

  }

  void display() {
    System.out.println("the student number is" + sno);
    System.out.println("the student name is" + sname);
    System.out.println("The total marks " + sum);
    System.out.println("the average of 3 subject marks is " + avg);
  }

}

class student1 {
  public static void main(String[] args) {
    student m1 = new student();
    m1.sum();
    m1.average();
    m1.display();

  }
}