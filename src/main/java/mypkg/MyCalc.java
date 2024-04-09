package mypkg;

public class MyCalc {
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int diff(int a, int b)
	{
		return a-b;
	}
	public int mul(int a, int b)
	{
		return a*b;
	}
	public int div(int a, int b)
	{
		return a/b;
	}
	public void show()
	{
		System.out.println("Show Function");
	}
	public void hello()
	{
		System.out.println("Hello Function");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalc calc=new MyCalc();
		System.out.println("Sum is: "+calc.sum(20,10));
		System.out.println("Diff is: "+calc.diff(20,10));
		System.out.println("Prod is: "+calc.mul(20,10));
		System.out.println("Div is: "+calc.div(20,10));
		calc.show();
		calc.hello();
	}

}
