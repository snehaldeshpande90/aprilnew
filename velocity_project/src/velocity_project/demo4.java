package velocity_project;

public class demo4 {
	static int a=12;
	int b=34;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a="+a);
		System.out.println("demo4.a="+demo4.a);
		 
		demo4 x=new demo4();
		System.out.println("x.b="+x.b);
		demo4 y=new demo4();
		System.out.println("y.b="+y.b);
		
		//non static-change limited object
		x.b=100;
		System.out.println("x.b="+x.b);
		System.out.println("y.b="+y.b);
		System.out.println("==============");
		System.out.println("static variable");
		
		//static shared memory
		
		

	}

}
