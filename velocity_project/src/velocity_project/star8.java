package velocity_project;

public class star8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int line=15;
		//outer loop=no of line
		for(int b=1;b<=line; b++)//3
			//for(int b=5;b>=1;b--)
		{
			//inner loop=no of start/line
			//for(int a=0;a<b;a++)//5
			for(int a=(line-1);a>=b;a--)//5
			{
				System.out.print("");
			}
			for(int a=0;a<b;a++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
