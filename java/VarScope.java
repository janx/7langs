class VarScope {
  static int b = 2;
  int c = 3;
  final static int d = 7;

  public static void main(String[] args) {
    hello("world");
    shadow(0, 100, 700);
    new VarScope().shadow(200, 300);
  }

  private static void hello(String world) {
    //String world = "aa"; // FAIL
    //System.out.println(world);

    int a = 1;

    if(a > 0) {
      //int a = 2; // FAIL
      //System.out.println(2);
    }
  }

  private static void shadow(int a, int b, int d) {
    System.out.println(b);
    System.out.println(VarScope.b);
    System.out.println(d);
  }

  public void shadow(int b, int c) {
    System.out.println(b);
    System.out.println(VarScope.b);
    System.out.println(c);
    System.out.println(this.c);
  }
}
