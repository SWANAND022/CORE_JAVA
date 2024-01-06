package Tasks;

public class ReverseNumber {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int num=243;
		
		System.out.println("before reverse:"+num);
		int rev=0;//reverse;
		
		for(;num>0;num=num/10)
		{
			int rem = num%10;//remainder
			rev = rev *10+rem;
		}
		System.out.println("after reverse:"+rev);
	}

}
