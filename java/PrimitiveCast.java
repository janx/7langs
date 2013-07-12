public class PrimitiveCast {
  public static void main(String[] args) {
    for(int i = 50; i < 150; i++) {
      System.out.print((char) i);
    }
    System.out.println();

    for(int i = 50; i < 150; i++) {
      System.out.print((float) i);
      System.out.print(" ");
    }
    System.out.println();

    byte b = 105;
    System.out.println((char) b);

    // boolean is not a type, it's a keyword. Boolean is a type
    // bool is a boolean (value), not a reference. It cannot be the first argument of instanceof.
    Boolean bool = false;
    System.out.println(bool instanceof Boolean);

    int[] a = {1,2,3,4};
    Integer[] aa = {1,2,3,4};
    System.out.println(aa[0] instanceof Integer);

    int[][] two = {{1,2},{3,4}};
    short s =  'c';
    long ll = 'c';
    System.out.println(5+"a");

    String aas = "aaa";
    String bbs = "aaa";
    System.out.println(aas == bbs);
    System.out.println(aas instanceof String);

    System.out.println(0F/0);
    System.out.println(0.1/0);
    System.out.println(-0.1F/0);

    //int aaaaaaa = 1 == 1 ? odd() : even();

    int swit = 3;

    switch(swit) {
      case 2:
        System.out.println(2);
      case 3:
        System.out.println(3);
      case 4:
        System.out.println(4);
      case 5:
        System.out.println(5);
        break;
      default:
        System.out.println("shit");
    }

outer:
    for(int i=0; i< 3; i++) {
      for(int j=0; j<3; j++) {
        System.out.println("j="+j);
        break outer;
      }
    }
  }

  private static void odd() {
    System.out.println("Odd");
  }

  private static void even() {
    System.out.println("Even");
  }
}
