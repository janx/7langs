/**
 * Dump arguments passed in.
 *
 * @author Jan Xie
 */
public class DumpArgs {
  /**
   * Main entry point.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    System.out.println("Args:");

    for(int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
  }
}
