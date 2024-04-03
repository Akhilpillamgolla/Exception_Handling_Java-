package exceptionHandling;

public class Throws {

	public static void divideByZero(int n) throws Throwable {
		if (n < 0) {
			throw new ArithmeticException("Trying to divide by 0");
		} else {
			System.out.println("The divisor value is changed from 0");
		}
	}

	public static void main(String[] args) throws Throwable {
		divideByZero(10 / 2);   // change the value of the divisor to '0' then it throws exception.
	}

}
