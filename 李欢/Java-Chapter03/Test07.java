import java.util.Scanner;
import java.util.Random;
public class Test07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Random rd=new Random();
		System.out.println("我行我素购物管理系统>幸运抽奖\n\n");
		System.out.print("请输入4位会员号：");
		int num=input.nextInt();
		int a=num/100%10;
		int b=rd.nextInt(10);
		if(a==b){
			System.out.println(num+"号客户是幸运客户，获精美Mp3一个");
		}else{
			System.out.println(num+"号客户,谢谢您的支持！");
		}
	}
}