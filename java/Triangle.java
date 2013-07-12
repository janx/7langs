public class Triangle {
  public static void main(String[] args) {
    Triangle tri = new Triangle(20);
    tri.print();
  }

  private int height, width;

  public Triangle(int height) {
    this.height = height;
    this.width = 2*height+1;
  }

  public void print() {
    for(int i=0; i<height; i++) {
      int asterisks = 2*i + 1;
      printLine(width, asterisks);
    }
  }

  private void printLine(int width, int asterisks) {
    int spaces = (width-asterisks)/2;
    printChars(' ', spaces);
    printChars('*', asterisks);
    printChars(' ', spaces);
    System.out.println("");
  }

  private void printChars(char ch, int count) {
    for(int i=0;i<count;i++) {
      System.out.print(ch);
    }
  }
}
