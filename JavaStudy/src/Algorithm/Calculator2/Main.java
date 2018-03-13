package Algorithm.Calculator2;
class Main {
  public static void main(String args[])   {
      if (args.length < 1) {
      System.out.println("Usage: java Postfix [infix expression]\n");
      return;
    }
    String infixExp = args[0];    
	Calc c = new Calc();
	if (!c.bracketsBalance(infixExp)){
		System.out.println("��ȣ�� ��Ȯ�� �ϼ���~");
		System.exit(1);
	}
    String postfixExp = c.postfix(infixExp);
    Double result = c.result(postfixExp);
    System.out.println("The postfix expression for "+ infixExp +" is " + postfixExp);
    System.out.println("The result = "+result);
  }
}