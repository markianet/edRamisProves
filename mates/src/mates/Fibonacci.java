package mates;

public class Fibonacci extends Math {

	public Fibonacci(int x, int y) {
	
			super(x, y);
			// TODO Auto-generated constructor stub

		}

		public Fibonacci() {
			super(1, 1);
		}
		
		public int calcula(int i){
			
		if (i == 0 || i == 1)
			return i;
		else 
			return calcula (i - 1) + calcula (i - 2);
		}//calcula
		
		
	}