package Tasks;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=5; i++)
		{
			int count=1;
			int increment=4;
			int j=1;
			for(;count<=i;) {
				System.out.println(j+" ");
				count++;
				j+=increment;
				increment--;
			}
			System.out.println();
			
		}

	}

}
