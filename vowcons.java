import java.util.Scanner;

class vowcons {
  public static void main(String args[]) {
    char ch = 's';

    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
      System.out.println(ch + "is vowels");
    } else {
      System.out.println(ch + "is  constants");
    }
  }
}