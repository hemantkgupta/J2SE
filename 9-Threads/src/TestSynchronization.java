class TestSynchronization extends Thread {
  StringBuffer letter;
  
  public TestSynchronization(StringBuffer letter) {
	  this.letter = letter;
  }
  
  public void run() {
  //  synchronized(letter) {      // #1 comment this line to see effect of synchronization
      for(int i = 1;i<=100;++i) 
    	  System.out.print(letter);
      System.out.println();
      
      char temp = letter.charAt(0);
      ++temp;         // Increment the letter in StringBuffer:
      letter.setCharAt(0, temp);
   // }     // #2
  }
  
  public static void main(String [] args) {
    StringBuffer sb = new StringBuffer("A");
    new TestSynchronization(sb).start(); 
    new TestSynchronization(sb).start();
    new TestSynchronization(sb).start();
  }
}


