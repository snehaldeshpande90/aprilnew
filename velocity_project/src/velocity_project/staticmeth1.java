package velocity_project;

public class staticmeth1 {
	//return type//aruments
	static int test(int s,int h)
	{
		//System.out.println(s);
		//System.out.println(h);
		int sum=s+h;
		return sum;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=test(12,45);
System.out.println(x);
x=test(152,485);
System.out.println(x);
x=test(1342,466875);
System.out.println(x);
	}

}
