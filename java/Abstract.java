abstract class Foo {
  static {
    System.out.println("abstract static");
  }

  {
    System.out.println("abstract instance");
  }
}

abstract class Bar {
  abstract void hello();
}

class Abstract extends Foo {
  public static void main(String[] args) {
    System.out.println("main");
    Abstract a = new Abstract();

    Bar b = new Bar() {
      @Override
      void hello() {
        System.out.println(1);
      }
    };
    b.hello();
  }
}
