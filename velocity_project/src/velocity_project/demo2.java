package velocity_project;

public class demo2 {

	
		static int a=12;
		int b=34;
		int c=56;
		demo2()
		{
		b=200;	
		}
		demo2(int x)
		{
			int a =400;
			int b =600;
		}
		demo2(char x){
			int c=700;
		}
		
		
		public static void main(String[] args) {
			System.out.println("a="+a);
			System.out.println("demo2.a="+demo2.a);
			
			demo2 x=new demo2();
			System.out.println("x.b="+x.b);
			System.out.println("x.c="+x.c);
			System.out.println("a="+a);
			
			demo2 y=new demo2(78);
			System.out.println("y.b="+y.b);
			System.out.println("y.c="+y.c);
			System.out.println("a="+a);
			
			demo2 z=new demo2('c');
			System.out.println("z.b="+z.b);
			System.out.println("z.c="+z.c);
			System.out.println("a="+a);
			System.out.println("demo2.a="+demo2.a);//400
		}

}

