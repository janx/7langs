class Clone implements Cloneable {
  int a;

  Clone(int a) {
    this.a = a;
  }

  public static void main(String[] args) throws CloneNotSupportedException {
    Clone c = (Clone) new Clone(10).clone();
    System.out.println(c.a);
  }
}
