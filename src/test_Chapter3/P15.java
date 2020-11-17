package test_Chapter3;

public class P15 {

	public static void main(String[] args) {
		Car car1;
		car1=new Car();
		
		int number=1234;
		double gasonline=20.5;
		
		car1.setNumGas(number,gasonline);
	}

}
/*
class Car
{
	int num;
	double gas;
	void setNumGas(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，將汽油量設為"+gas);
	}
	void show()
	{
		System.out.println("將車號設為"+num);
		System.out.println("將汽油量設為"+gas);	
	}
}
*/