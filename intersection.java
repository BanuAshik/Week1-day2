package day;

public class intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {3,2,11,4,6,7};
int[] b= {1,2,8,4,9,7};
int l=a.length;
int m=b.length;

for(int i=0;i<=l-1;i++)
{
	for(int j=0;j<=m-1;j++)
	{
		
		if(a[i]==b[j])
		{
			System.out.print(a[i] +" ");
			break;
		}
		
			
	}
}
	}

}

	
	
	
	
	
	
	


