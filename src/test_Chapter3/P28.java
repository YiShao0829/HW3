package test_Chapter3;

public class P28 {

	public static void main(String[] args) {
		Car car1;
		car1=new Car();
		car1.show();
		
		Car car2;
		car2=new Car(1234,25.0);
		car2.show();
	}

}
/*
class Car
{
	private int num;
	private double gas;
	public Car()
	{
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public Car(int n,double g)
	{
		this();
		num=n;
		gas=g;
		System.out.println("生產了車號設為"+this.num+"，汽油量設為"+this.gas+"的車子");
	}
	public void show()
	{
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
}
*/