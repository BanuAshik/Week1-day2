package day2;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121;
		int temp=num;
		int rev=0;
		int lastdigit;
	
		while (num >0)
		{
			lastdigit=num%10;
			rev=(rev*10)+lastdigit;
			num=num/10;
			
			
		System.out.println(rev);

		}
			if (temp==rev)
				
			{
				System.out.println("palindrome");
						
			}
			else
			{
			System.out.println("NOT A PLAINDROME");
		}
				
				
			}
			}
			

	


