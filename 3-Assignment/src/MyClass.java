class MyClass1 {
    static MyClass1 ref;
    String[] arguments;

    public static void main(String[] args) {
        ref = new MyClass1();
        ref.func(args);
        
    }

    public void func(String[] args) {
        ref.arguments = args;
        
    }
}

