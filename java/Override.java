import java.util.Date;

class Override {

  public static void hello(Object o) {
    System.out.println("call to Object");
  }

  public static void hello(Date d) {
    System.out.println("call to Date");
  }

  public static <T> void methodCaller(T t) {
    hello(t);
  }

  public static void main(String[] args) {
    methodCaller(new Date());
  }
}
