import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int a=input.nextInt();
		if(a%2==0){
			System.out.println("这个数是偶数");
		}else{
			System.out.println("这个数是奇数");
		
		}
	}
}