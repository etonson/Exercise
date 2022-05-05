package abstractDemo;

abstract class Cscore
{
	protected int chia,math;
	public abstract double avgScore();
	
	protected Cscore(int chia,int math)
	{
		this.chia=chia;
		this.math=math;
	}
}

class SimpleAvg extends Cscore
{
	SimpleAvg(int chia,int math)
	{
		super(chia,math);
	}
	public double avgScore()
	{
		return (float) (math+chia)/2;
	}
}

class WeightAvg extends Cscore
{
	private int w1,w2;
	WeightAvg(int chia,int math,int w1,int w2)
	{
		super(chia,math);
		this.w1=w1;
		this.w2=w2;
	}
	
	public double avgScore()
	{
		return (float) (math*w1+chia*w2)/(w1+w2);
	}
}

public class AbstractDemo
{
	public static void main(String[] args)
	{
		String name = "蘇偉啟";
		int chia=93,math=73;
		SimpleAvg avg1= new SimpleAvg(chia,math);
		System.out.println("姓名\t國文\t數學\t平均分數");
		System.out.printf("%s\t%d\t%d\t%2.1f%n", name,chia,math,avg1.avgScore());
		System.out.println("---------------------");
		int w1=2,w2=3;
		WeightAvg avg2 = new WeightAvg(chia,math,w1,w2);
		System.out.println("姓名\t國文\t數學\t加權分數");
		System.out.printf("%s\t%d\t%d\t%2.1f%n", name,chia,math,avg2.avgScore());
		
	}

}
