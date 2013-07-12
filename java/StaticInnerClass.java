class EnclosingClass {
  private static int i;

  private static void m1() {
    System.out.println(i);
  }

  static void m2() {
    EnclosedClass.accessEnclosingClass();
  }

  static class EnclosedClass {
    static void accessEnclosingClass() {
      i = 1;
      m1();
    }

    void accessEnclosingClass2() {
      m2();
    }
  }
}

class StaticInnerClass {
  public static void main(String[] args) {
    EnclosingClass.EnclosedClass.accessEnclosingClass();
    EnclosingClass.EnclosedClass ec = new EnclosingClass.EnclosedClass();
    ec.accessEnclosingClass2();
  }
}
