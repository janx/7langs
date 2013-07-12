class ClassField {
  static int a;

  void printA() {
    System.out.println(a);
    System.out.println(this.a);
  }

  static void shit() {
    System.out.println("shit");
  }

  public static void main(String[] args) {
    System.out.println(a);
    System.out.println(ClassField.a);
    System.out.println(new ClassField().a);

    new ClassField().printA();

    shit();
    new ClassField().shit();
  }
}
