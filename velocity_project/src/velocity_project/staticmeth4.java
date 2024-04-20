package velocity_project;

public class staticmeth4 {
	//return type//parameters
	static int test(int s,int h)
	{
		int sum=s+h;
		return sum;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=test(12,34);
		x=test(x,45);
		x=test(x,56);
		System.out.println(x);

	}

}
