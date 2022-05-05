package finalDemo;

final class Cdog
{
	int weight;
}

class Ccar
{
	private final int speed =120;
	public void showBigSpeed(String s)
	{
		System.out.println(s+"最大速度是"+speed+"公里!");
	}
}

class PiliCar extends Ccar
{
	
}


public class FinalDemo
{
	public static void main(String[] args)
	{
		Ccar car1 = new Ccar();
		car1.showBigSpeed("car1");
		PiliCar car2 = new PiliCar();
		car2.showBigSpeed("car2");
	}

}
