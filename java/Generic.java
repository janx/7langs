import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Generic {
  public static void main(String[] args) {
    List<Integer> l = new ArrayList<Integer>();
    l.add(1);
    l.add(2);
    l.add(3);

    Iterator<Integer> i = l.iterator();
    while(i.hasNext()) {
      System.out.println(i.next());
    }
  }
}
