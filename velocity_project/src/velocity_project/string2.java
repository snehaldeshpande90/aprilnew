package velocity_project;

public class string2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Velocity Class";
		String b="Velocity    ";
		System.out.println(a);
		char[]r=new char[a.length()];
		
		for(int i=0;i<a.length();i++)
		{
			r[i]=a.charAt(i);
		}
		//r[0]=a.charAt(0);
		//r[1]=a.charAt(1);
		//r[2]=a.charAt(2);
		for(int i=0;i<r.length;i++)
		{
		
		System.out.print(r[i]+",");	

	}

	}
}
