class SuperBase {

  static {
    System.out.println("SuperBase 1");
  }

  SuperBase() {
    System.out.println("base default.");
  }

  SuperBase(int a) {
    System.out.println(a);
  }

  void getInt() {
    System.out.println(1);
  }
}

class Super extends SuperBase {

  static {
    System.out.println("Super 1");
  }

  {
    System.out.println("Super initialize block.");
  }

  Super() {
    // without call to super(), SuperBase() will be called automatically.
    System.out.println("Super.");
  }

  void getInt() {
    super.getInt();
    System.out.println(2);
    super.getInt();
  }

  void getInt2() {
    super.getInt();
    System.out.println(2);
    super.getInt();
  }

  public static void main(String[] args) {
    Super s = new Super();
    s.getInt();
    s.getInt2();
  }
}
