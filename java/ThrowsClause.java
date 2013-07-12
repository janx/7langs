import java.lang.ClassNotFoundException;

class SuperThrows {
  void hello() throws ClassNotFoundException {
    System.out.println(1);
    throw new ClassNotFoundException();
  }
}

class SubThrows extends SuperThrows {
  @Override
  void hello() {
    System.out.println(2);
  }
} 

class ThrowsClause {
  public static void main(String[] args) {
    new SubThrows().hello();

    try {
      new SuperThrows().hello();
    }
    catch(ClassNotFoundException cnfe) {
      System.out.println(3);
    }
    finally {
      System.out.println(2);
    }
  }
}
