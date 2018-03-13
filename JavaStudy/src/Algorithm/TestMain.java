package Algorithm;

import java.util.Stack;

public class TestMain {
	public static void main(String[] args) {
		String postfix = "35*62/-";
		evalPostfix(postfix);
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
		
		System.out.println("°á°ú°ª : " + stack.pop());
	}
}
