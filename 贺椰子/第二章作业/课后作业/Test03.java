import java.util.Scanner;
public class Test03
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("输入一个三位数：");
		int n=in.nextInt();
		int c=n%10;
		int b=n/10%10;
		int a=n/100;
		int t;
		System.out.println("交换前：a="+a+",b="+b+",c="+c);
		t=a;
		a=c;
		c=t;
		System.out.println("交换后：a="+a+",b="+b+",c="+c);
	}
}
