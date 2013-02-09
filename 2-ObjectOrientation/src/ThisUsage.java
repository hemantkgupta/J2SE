public class ThisUsage {
    int planets;
    static int suns;
    public void gaze() {
        int i=5;
      //  this=new ThisUsage();
      	this.planets=i;
      // can't do this	
      //	this.suns=i;
    } 
    public static void main(String[] args){
    	new ThisUsage().gaze();
    }
}


