public class TestMethodLocalInnerClass {
	private int x;
    public static void main(String[] args) {
    	//Method local inner class
        class InnerMethod{
			public void doInner(){
				System.out.println("Inner method local class");
			}			
		};
		new InnerMethod().doInner();
    }
}
