package velocity_project;

public class staticmeth {
	//user defined method
	//method declaration
	static void test()
	{
		//method defination/body
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
	}
	//system define method
	
  public static void main(String[] args) {
		// TODO Auto-generated method stub
	  //method call
	  test();
	  System.out.println("d");
	  test();
	  System.out.println("e");
	  test();
	  System.out.println("f");
	  alpha();
  }
	  
		
	static void alpha()
	{
		//method defination
		System.out.println("x");
		System.out.println("y");
		System.out.println("z");
		
	}
}
