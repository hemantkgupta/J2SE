import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Writer2 {
  public static void main(String [] args) {
    char[] in = new char[50];           // to store input
    int size = 0;
    try {
      File file = new File(             // just an object
                  "fileWrite2.txt");
      FileWriter fw =
                 new FileWriter(file);  // create an actual file
                                        // & a FileWriter obj
      fw.write("howdy\nfolks\n");       // write characters to
                                        // the file
      fw.flush();                       // flush before closing
      fw.close();                       // close file when done

      FileReader fr = 
                 new FileReader(file);  // create a FileReader
                                        // object
      size = fr.read(in);               // read the whole file!
      System.out.print("File size in bytes is : " +size + "\n");     // how many bytes read
      for(char c : in)                  // print the array
        System.out.print(c);
      System.out.print("Finished");
      fr.close();                       // again, always close }
    } catch(IOException  e) { }
  }
}
