import java.util.Scanner;
public class Test04 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		String result;
		System.out.print("你爱我吗？");
		result=in.next();
		if(result.equals("yes")){
			System.out.println("你是爱我的");
		}else if(result.equals("no")){
			System.out.println("原来你不爱我");
		}else{
			System.out.println("你到底是爱还是不爱，自己也不清楚。");
		}
	}
}
