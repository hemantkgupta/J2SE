public class TestAnonymousInnerClass {
	void go(){
		Bar b=new Bar();
		b.doStuff(new Foo(){
			public void foof(){
				System.out.println("foofy");
			}
		});
	}
    public static void main(String[] args) {
        new TestAnonymousInnerClass().go();
    }
}


interface Foo{
	void foof();
}
class Bar{
	void doStuff(Foo f){
		f.foof();
	}
}