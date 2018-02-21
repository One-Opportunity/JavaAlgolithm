package Study.Chapter6.Access.package2;

import Study.Chapter6.Access.package1.A;

public class C {
	public C () {	
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1; //x
//		a.field3 = 1; //x
//		a.field4 = 1;
		a.method1();
//		a.method2(); //x
//		a.method3(); //x
	}
}
