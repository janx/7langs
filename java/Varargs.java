class Varargs {
  public static void main(String[] args) {
    hello(1,2,3,4,5);
  }

  static void hello(int... values) {
    for(int i=0; i<values.length; i++)
      System.out.println(values[i]);
  }
}
