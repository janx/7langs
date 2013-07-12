class EnumExample {
  enum Coin {
    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUARTER(25); // when the common seperatd list of constants is followed by anything other than an enum's closing brace, you must terminate the list with a semicolon or the compiler will report an error

    private final int denomValue;

    Coin(int denomValue) {
      this.denomValue = denomValue;
    }

    int denomValue() {
      return denomValue;
    }

    int toDenomination(int numPennies) {
      return numPennies / denomValue;
    }
  }

  public static void main(String[] args) {
    Coin coin = Coin.NICKEL;

    System.out.println(coin.denomValue() + " cents");

    switch(coin) {
      case PENNY: System.out.println("1 cent"); break;
      case NICKEL: System.out.println("5 cent"); break;
      case DIME: System.out.println("10 cent"); break;
      case QUARTER: System.out.println("25 cent"); break;
      default: assert false;
    }

    for(int i=0; i<Coin.values().length; i++) {
      System.out.println(Coin.values()[i]);
    }
  }
}
