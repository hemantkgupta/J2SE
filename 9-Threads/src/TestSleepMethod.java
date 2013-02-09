class TestSleepMethod extends Thread {
  public void run() {
    try {
    	sleep(10000);
    	} 
    catch (InterruptedException ie){}
    long endTime = System.currentTimeMillis();
    System.out.println("End   Time: "+ endTime);
  }
  
  public static void main(String[] args) {
    TestSleepMethod a1 = new TestSleepMethod();
    long startTime = System.currentTimeMillis();
    System.out.println("Start Time: "+startTime);
    a1.start();
    
    
}}


