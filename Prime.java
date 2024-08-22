package day2;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 23;
		int m ;
		m=num/2 ;
		boolean isPrime = false ;
		for (int i = 2; i <=(num-1) ; i++)
		{
			if (num % i==0)
			{
				System.out.println("number "+ num + " is not a prime number ");
				isPrime = true;
				break;	
			}
			}
		if (isPrime==false ) 
		{
				System.out.println("number "+ num + " is primenumber");
		}

	}

}
