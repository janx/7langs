class Equality {

  public static void main(String[] args) {
    System.out.println("abc" == "a"+"bc");
    System.out.println("abc" == new String("abc"));

    Integer a = new Integer(1);
    Integer b = new Integer(1);
    int aa = 1;
    int bb = 1;
    System.out.println(aa == bb);
    System.out.println(a == b);
    System.out.println(a.equals(b));

    System.out.println(Integer.MIN_VALUE);
  }

}
