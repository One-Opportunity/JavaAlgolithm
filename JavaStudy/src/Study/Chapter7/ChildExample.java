package Study.Chapter7;

public class ChildExample {

	public static void main(String[] args) {
		Parent p = new Child();
		p.field1 = "data1";
		p.method1();
		p.method2();
		/*
		p.field2 = "data2";
		p.method3();
		*/
		
		Child child = (Child) p;
		child.field2 = "yyy";
		child.method3();
	}

}
