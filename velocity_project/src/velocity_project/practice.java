package velocity_project;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number a:");
		int a=s.nextInt();
		System.out.println("enter the number b:");
		int b=s.nextInt();
		System.out.println("enter the number c:");
		int c=s.nextInt();
		if(a>b)
		{
			if(a>c)
			{
			System.out.println("the greatest number a:"+a);
			
		}
		else
		{
			System.out.println("the greatest number c:"+c);
			
		}
			if(b>c)
			{
			System.out.println("the greatest number b:"+b);
		
		
			}
			else
			{
				System.out.println("the greatest number c:"+c);
			}
	}

}
}