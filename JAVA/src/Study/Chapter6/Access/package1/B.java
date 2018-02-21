package Study.Chapter6.Access.package1;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1; //X
		
		a.method1();
		a.method2();
//		a.method3(); //x
	}
	
	
}
