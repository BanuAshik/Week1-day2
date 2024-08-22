package day;

public class MissingArray {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		int [] x= {1,2,3,4,6,7,8};
		int l=x.length;
		int sum=0;
		//sum of the total numbers range in the array
		for(int i=0;i<l;i++)
		{
		sum=sum+x[i];
		}
		//System.out.println(sum);
		int sum1=0;
		for(int i=1;i<=8;i++)
		
		{
			sum1=sum1+i;
			
		}
		//System.out.println(sum1);
		
		int Missingnum= sum1-sum;
		System.out.println("Missingnumber " + Missingnum);
	}

}
