class Level1Exception extends Exception {}
class Level2Exception extends Level1Exception {}
class Level3Exception extends Level2Exception {}
class Purpule {
  public static void main(String args[]) {
    int a,b,c,d,f,g,x;
    a = b = c = d = f = g = 0;
    x = 1;
    try {
      try {
        switch (x) {
          case 1: throw new Level1Exception();
          case 2: throw new Level2Exception();
          case 3: throw new Level3Exception();
        }
        a++;
      }
      catch (Level2Exception e) {b++;}
      finally {c++;}
    }
    catch (Level1Exception e) { d++;}
    catch (Exception e) {f++;}
    finally {g++;}
    System.out.print(a+","+b+","+c+","+d+","+f+","+g);
}}

