/**
 * @(#)LabelTest.java
 *
 *
 * @author 
 * @version 1.00 2007/1/28
 */

public class LabelTest {
   
    public static void main(String[] args) {
        outer:
        	for(int i=0;i<5;i++){
        		for(int j=0;j<7;j++){
        			System.out.println(j);
        				continue outer;	
        		}
        	}				
    }
}
