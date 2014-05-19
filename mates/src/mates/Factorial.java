package mates;

public class Factorial extends Math {

	public Factorial(int x, int y)

	{
		super(x, y);
		// TODO Auto-generated constructor stub

	}

	public Factorial() {
		super(1, 1);
	}
	
	public int calcula(int i) {
		
	if (i == 1)
		return 1;
	else 
		return i * calcula (i-1);
	}//calcula
	
}
