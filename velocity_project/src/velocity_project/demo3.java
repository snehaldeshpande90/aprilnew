package velocity_project;

public class demo3 {
	static int a=12;//static initialize
	 int b=34;
	demo3()
	{
		a=100;//new assignment
		b=200;//non static-initalize
		
	}
	demo3(int x)
	{
	a=400;//new assinment
	b=600;//non static initialize
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a="+a);
		System.out.println("demo3.a="+demo3.a);
		
		demo3 x=new demo3();//zero arg.x.b
		System.out.println("x.b="+x.b);
		System.out.println("a="+a);
		
		demo3 y=new demo3(78);
		System.out.println("y.b="+y.b);
		System.out.println("a="+a);
		System.out.println("demo.a="+demo3.a);
		
		

	}

}
