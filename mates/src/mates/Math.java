package mates;

public class Math {
	protected int a,b;
	
	public Math(int x,  int y) {
		// TODO Auto-generated constructor stub
		a = x;
		b = y;
	}// Math
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int suma ()
	{
		return a + b;
	}
	public int resta ()
	{
		return a + b;
	}
	public int multiplica ()
	{
		return a + b;
	}
	
	public float divideix(){
		float x = a;
		float y = b;
			 
		return (float) (x/y);
	}



}// Math class
