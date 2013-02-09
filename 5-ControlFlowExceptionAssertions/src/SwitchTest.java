public class SwitchTest {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int x=3;
        final int b=2;
        switch(x){
        	case b:{ System.out.println("case 2by final"); break;        }
        //	case 2:{ System.out.println("case 2"); break;        }
        	default :{ System.out.println("default"); break;        }
        	case 3:{ System.out.println("case 3");        }
        	case 5:{ System.out.println("case 5"); break;        }
        	case 6:{ System.out.println("case 6");         }
        }	
    }
}
