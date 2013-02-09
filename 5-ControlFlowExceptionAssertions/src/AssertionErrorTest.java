public class AssertionErrorTest {
    
    public static void main(String[] args) {
        int x=2;
        assert(x<1);
        System.out.println("should not reach here"+x);
    }
}
