class sphere {
  public static void main(String args[]) {
    scanner sc = new Scanner(System.in);
    int r;
    float volume;
    float pi = 3.14F;
    float v = 1.34F;

    System.out.println("Enter radius of sphere: ");
    r = sc.nextInt();

    volume = v * pi * r * r * r;

    System.out.println("volume of sphere = " + volume);
  }
}