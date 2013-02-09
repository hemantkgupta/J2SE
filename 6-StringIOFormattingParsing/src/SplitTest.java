import java.util.*;
class SplitTest {
  public static void main(String[] args) {
    String[] tokens = "njhcho piqewjfi no ipoqejf eoiq ofiqw oiwcc".split(" ");
    System.out.println("count " + tokens.length);
    for(String s : tokens)
      System.out.println(">" + s + "<");
  }
}

