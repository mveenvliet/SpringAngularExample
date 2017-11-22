package Calculator;

public class Calculator {

	public int sum(int a, int b) {
		return a + b;
	}

	public int substraction(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a/b;
		//		if (b != 0)
//			return a / b;
//		else
//			return -1;
	}

	public boolean equals(int a, int b) {
		if (a == b)
			return true;
		else
			return false;
	}

	public boolean aLowerThenB(int a, int b) {
		return a < b;
	}
	
	public boolean aBiggerThenB(int a, int b) {
		return a > b;
	}
}
