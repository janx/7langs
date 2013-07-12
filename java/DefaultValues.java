class DefaultValues {
  int a;
  String b;
  boolean c;
  char d;
  Boolean e;
  Integer f;
  float g;
  int i = 123;

  DefaultValues() {
    System.out.println("Initialize.");
    return;
  }

  void inspect() {
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
    System.out.println(g);
    System.out.println(i);

    Integer h = 0;
    System.out.println(0 == h);
    System.out.println(0 == new Integer(0));
  }

  public static void main(String[] args) {
    new DefaultValues().inspect();
  }
}
