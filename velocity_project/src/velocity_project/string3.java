package velocity_project;

public class string3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse string
		String a="Velocity Class";
		String b="Velocity";
		System.out.println(a);
		char[]r=new char[a.length()];
		String t="";
		for(int i=(a.length()-1);i>=0;i--)
		{
			char x=a.charAt(i);//a
			t=t+x;//ss+a=ss
			System.out.println( "t=" +t  );
		}
		System.out.println(t);
		a=t;
		System.out.println(a); 
		
		
		
				
		
		
		

	}

}
