package Algorithm.Calculator2;

/**
 * Calc.java ������ �̿��Ͽ� ����ǥ���� ����ǥ������ �ٲٴ� �޼ҵ� ����ǥ�� ������ ������ �̿��� ������ �����ϴ� �޼ҵ� ���ĵ���
 * ��ȣ�� �´��� Ȯ���ϴ� �޼ҵ�
 */
class Calc {
	// -------------------------------------------------------------------
	// ������ �̿��Ͽ� ����ǥ���� ����ǥ������ �ٲٴ� �޼ҵ�
	// -------------------------------------------------------------------
	String postfix(String infixExp) {
		Double value;
		// ������ ������ �˷��ִ� flag
		// �Ҽ��� ���ĵ� ó���ϱ� ���ؼ�...
		boolean endOfNumber = false;
		String postfixExp = new String();
		ArrayStack stk = new ArrayStack();

		for (int i = 0; i < infixExp.length(); i++) {
			switch (infixExp.charAt(i)) {
			// �ǿ����ڴ� �״�� ����Ѵ�.
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
			case '.':
				postfixExp = postfixExp.concat(infixExp.charAt(i) + "");
				endOfNumber = true;
				break;
			// ���ʰ�ȣ�� ��쿡�� ���ÿ� push �Ѵ�.
			case '(':
				if (endOfNumber == true) {
					postfixExp = postfixExp.concat(" ");
					endOfNumber = false;
				}

				stk.push(new Character('('));
				break;
			// ������ȣ�� ��� �°�ȣ�� ���ö����� pop�Ͽ� ����ϰ�
			// �°�ȣ�� pop�Ͽ� ������.
			case ')':
				if (endOfNumber == true) {
					postfixExp = postfixExp.concat(" ");
					endOfNumber = false;
				}
				while (((Character) stk.peek()).charValue() != '(')
					postfixExp = postfixExp.concat(((Character) stk.pop()).toString());
				Object openParen = stk.pop();
				break;
			case '+':
			case '-':
			case '*':
			case '/':
				if (endOfNumber == true) {
					postfixExp = postfixExp.concat(" ");
					endOfNumber = false;
				}
				// �����ڸ� ������ ���ÿ��� �� �����ں��� ���� �켱������ �����ڸ� ���� ������
				// ���Ͽ� ����� �ڿ� �ڽ��� Ǫ���Ѵ�.(�켱������ ���ų� �������� ���Ѵ�.)
				while (!stk.isEmpty() && ((Character) stk.peek()).charValue() != '('
						&& getPrec(infixExp.charAt(i)) <= getPrec(((Character) stk.peek()).charValue())) {
					postfixExp = postfixExp.concat(((Character) stk.pop()).toString());
				}
				stk.push(new Character(infixExp.charAt(i)));
				break;
			}
		}

		if (endOfNumber == true) {
			postfixExp = postfixExp.concat(" ");
			endOfNumber = false;
		}

		// ��� �۾��� ������ ���ÿ� �ִ� �����ڵ��� ��� ���Ͽ� ����Ѵ�.
		while (!stk.isEmpty()) {
			postfixExp = postfixExp.concat(((Character) stk.pop()).toString());
		}

		System.out.println(postfixExp);

		return postfixExp;
	}

	// ----------------------------------------------------------------------
	// ����ǥ�� ������ ������ �̿��� ������ �����ϴ� �޼ҵ�
	// ----------------------------------------------------------------------
	Double result(String postfixExp) {
		System.out.println(postfixExp);
		Double value, buffer;
		String temp = new String();
		ArrayStack stk = new ArrayStack();

		for (int i = 0; i < postfixExp.length(); i++) {
			switch (postfixExp.charAt(i)) {

			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
			case '.':
				// ��������� ���� ������ ������ �ʾ����Ƿ� ������ ���� �ƴϴ�.
				temp = temp.concat(postfixExp.charAt(i) + "");
				break;
			case ' ':
				// ������ �������� ��μ� ������ ���ÿ� �ִ´�.
				// ������ ���������� ������ ������ �־��ٸ� temp�� �پ ����Ǿ� �ִ�.
				stk.push(new Double(temp));
				temp = new String();
				break;
			case '+':
				value = new Double(((Double) stk.pop()).doubleValue() + ((Double) stk.pop()).doubleValue());
				stk.push(value);
				break;
			case '-':
				buffer = new Double(((Double) stk.pop()).doubleValue());
				value = new Double(((Double) stk.pop()).doubleValue() - buffer.doubleValue());
				stk.push(value);
				break;
			case '*':
				value = new Double(((Double) stk.pop()).doubleValue() * ((Double) stk.pop()).doubleValue());
				stk.push(value);
				break;
			case '/':
				buffer = new Double(((Double) stk.pop()).doubleValue());
				value = new Double(((Double) stk.pop()).doubleValue() / buffer.doubleValue());
				stk.push(value);
				break;
			}
		}
		return (Double) stk.peek();
	}

	// ------------------------------------------
	// �������� �켱������ Return
	// ------------------------------------------
	int getPrec(char op) {
		int prec = 0;
		switch (op) {
		case '+':
		case '-':
			prec = 1;
			break;
		case '*':
		case '/':
			prec = 2;
			break;
		}
		return prec;
	}

	// -----------------------------------------
	// ��ȣ�� ��Ȯ�� �˻�
	// -----------------------------------------
	static boolean bracketsBalance(String exp) {
		ArrayStack stk = new ArrayStack(exp.length() + 1);
		for (int i = 0; i < exp.length(); i++) {
			// Scan across the expression
			char ch = exp.charAt(i);
			if (ch == '[' || ch == '(') {
				stk.push(new Character(ch));
			} else if (ch == ']' || ch == ')') {
				// empty means brackets unmatched
				if (stk.isEmpty())
					return false;
				char charFromStack = ((Character) stk.pop()).charValue();
				if (ch == ']' && charFromStack != '[' || (ch == ')' && charFromStack != '('))
					return false;
			} // end if
		} // end for loop
		return stk.isEmpty(); // empty means matched, else unmatched
	}
}
