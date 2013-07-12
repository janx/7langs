interface Interf {
  int a = 1;
  int b = 2;

  void print();
}

interface Interf1 {
  void print1();
}

interface Interf2 extends Interf, Interf1 {
}

class InterfA implements Interf {
  public void print() {
    System.out.println(1);
  }
}

class InterfB extends InterfA {
  public void print() {
    System.out.println(2);
  }
}

class Interface2 implements Interf2 {
  public void print() {
    System.out.println(3);
  }

  public void print1() {
    System.out.println(4);
  }
}

class InterfaceTest implements Interf {
  public void print() {
  }

  public static void main(String[] args) {
    InterfaceTest i = new InterfaceTest();
    System.out.println(i.a);

    System.out.println(InterfaceTest.a);
    System.out.println(Interf.a);

    Interf a = new InterfA();
    a.print();

    Interf b = new InterfB();
    b.print();

    Interf2 i2 = new Interface2();
    i2.print();
    i2.print1();
  }
}
