class Initializer {

  static {
    System.out.println("Class initializer 1.");
  }

  static private int a = 1;

  static {
    System.out.println("Class initializer 2.");
    System.out.println(a);
    a = 2;
  }

  {
    System.out.println("Instance initializer 1.");
    System.out.println(b = 2);
  }

  int b = 1;

  {
    System.out.println("Instance initializer 2.");
    System.out.println(b);
    b = 3;
  }

  Initializer() {
    System.out.println("Constructor.");
  }

  public static void main(String[] args) {
    System.out.println(a);

    System.out.println(new Initializer().b);
  }
}
