import java.util.*;
public class Test07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int priceT=245;
		int priceS=570;
		int priceP=320;
		System.out.println("请输入购买T恤的个数：");
		int a=input.nextInt();
		System.out.println("请输入购买网球鞋的个数：");
		int b=input.nextInt();
		System.out.println("请输入购买网球拍的个数：");
		int c=input.nextInt();
		System.out.println("请输入折扣：");
		int d=input.nextInt();
		int moneyT=priceT*a;
		int moneyS=priceS*b;
		int moneyP=priceP*c;
		System.out.println("***************消费单**************");
		System.out.println("购买物品\t单价\t个数\t金额");
		System.out.println("T恤\t\t￥"+priceT+"\t"+a+"\t￥"+moneyT);
		System.out.println("网球鞋\t\t￥"+priceS+"\t"+b+"\t￥"+moneyS);
		System.out.println("网球拍\t\t￥"+priceP+"\t"+c+"\t￥"+moneyP);
		System.out.println();
		System.out.println("收费：");
		int money=input.nextInt();
		System.out.println("折扣：\t"+d+"折");
		int total=moneyT+moneyS+moneyP;
		double sum=total*d/10.0;
		System.out.println("消费总金额\t￥"+sum);
		System.out.println("实际交费\t ￥"+money);
		System.out.println("找钱\t\t￥"+(money-sum));
		System.out.println("本次购物所获得的积分是："+(int)sum/100*3);
	}
}