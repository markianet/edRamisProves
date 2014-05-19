package mates;

public class testMath {

	public testMath() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		// test métodes de Math
		Math m = new Math (3,4);
		System.out.println ("suma: " + m.suma());
		System.out.println ("resta: " + m.resta());
		System.out.println ("multiplica: " + m.multiplica());
		System.out.println ("divideix: " + m.divideix());
		
		
		// Test Factorial
		Factorial fac = new Factorial ();
		System.out.println ("factorial: " + fac.calcula(6));
		
		// Test Fibonacci
		Fibonacci fib = new Fibonacci ();
		System.out.println ("fibonacci:"  + fib.calcula(7));
		
	
	}

}
