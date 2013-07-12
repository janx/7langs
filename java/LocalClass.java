class Enclosing {
  void m(final int x) {
    final int y = x*2;

    class Enclosed {
      int a = x;
      int b = y;
    }

    Enclosed ec = new Enclosed();
    System.out.println(ec.a);
    System.out.println(ec.b);
  }
}

class LocalClass {
  public static void main(String[] args) {
    Enclosing ec = new Enclosing();
    ec.m(10);
    System.out.println(Math.abs(-1));
  }
}
