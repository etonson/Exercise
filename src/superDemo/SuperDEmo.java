package superDemo;

class CScore
{
	private int chia,math;
	CScore()
	{
		chia =0;
		math = 0;
	}
	CScore(int chia,int math)
	{
		this.chia = chia;
		this.math = math;
	}
	
	public void showScore()
	{
		System.out.print("國文:"+this.chia+"\t 數學:"+this.math);
	}
}

class SonCScore extends CScore
{
	private int eng;
	SonCScore(int chia,int math,int eng)
	{
		super(chia,math);
		this.eng = eng;
	}
	public void showScore()
	{
		super.showScore();
		System.out.print("\t 英文:"+this.eng);
	}
}
public class SuperDEmo
{
	public static void main(String[] args)
	{
		CScore Peter = new CScore(50,70);
		Peter.showScore();
		System.out.println("\n");
		SonCScore Tom = new SonCScore(65,84,99);
		Tom.showScore();
		
	}
}
