package Algorithm.Calculator;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		Formula op = new Formula();
		String exp = "(3*5)-(6/2)";
		char postfix[];
		int value;
		System.out.println(exp);
		
		if(op.testPair(exp)){
			System.out.println("수식이 올바름(괄호의 쌍이 일치)");
		}else{
			System.out.println("수식이 올바르지 않음(괄호의 쌍이 불일치)");
		}
		op.toPostfix(exp);
	}
	public static void evalPostfix(String postfix){
		char testCh = ' ';
		int expSize = postfix.length();
		int num1=0, num2=0;
		Stack<Integer> stack = new Stack();
		
		for(int i=0; i<expSize; i++){
			testCh = postfix.charAt(i);
			
			if(testCh=='+' || testCh=='-' || testCh=='*' || testCh=='/'){
				num2 = stack.pop();
				num1 = stack.pop();
				
				switch(testCh){
				case '+' :
					stack.push(num1+num2);
					break;
				case '-' :
					stack.push(num1-num2);
					break;
				case '*' :
					stack.push(num1*num2);
					break;
				case '/' :
					stack.push(num1/num2);
					break;
				}
			}else{
				stack.push(testCh-'0');
			}
		}
		
		System.out.println("결과값 : " + stack.pop());
	}	
}
