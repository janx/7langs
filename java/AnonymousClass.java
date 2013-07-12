abstract class AnonymousBase {
  abstract void hello();

  AnonymousBase(int i) {
    System.out.println(i);
  }
}

interface IAnony {
  void hello();
}

class AnonymousClass {
  public static void main(final String[] args) {
    new AnonymousBase(1) {
      String msg = (args.length == 1) ? args[0] : "nothing to say";

      @Override
      void hello() {
        System.out.println(msg);
      }
    }.hello();

    new IAnony() {
      public void hello() {
        System.out.println(2);
      }
    }.hello();
  }
}
