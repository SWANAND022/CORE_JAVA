package Tasks;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=1;
		for(int i=1;i<=5;i++) {
			int count=1;
			if(i%2==0) {
				for(int j=k+(i-1); count<=i; j--) {
					System.out.println(j+" ");
					k++;
					count++;
				}
			}
			else {
				for(int j=k;count<=i;j++) {
					System.out.println(j+" ");
					k++;
					count++;
				}
			}
		}

	}

}
