package stringPrograms;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Write a program to print all the indexs at which 1 occurs.
		
			String s="Yellow Umbrella";
			System.out.println("All the indexs at which 1 occurs are : -");
			for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				if(ch=='1') {
					System.out.println(i);
					
				}
			}

	}

}
