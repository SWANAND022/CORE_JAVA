package stringPrograms;

public class StringBufferEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*StringBuffer sb=new StringBuffer("Anudip");
		String s="Anudip";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse of s = "+rev);
		sb.reverse();
		System.out.println("Reverse sb = "+sb);*/
		
		/*In this StringBuffer and StringBuilder class the replace method is used to replace the
		 *  character from start index upto the end index are replaced by new string.*/
		StringBuffer sb=new StringBuffer("Indian Cricket Team");
		System.out.println("Before : "+sb);
		sb.replace(7, 14, "Hockey");
		System.out.println("After : "+sb);
		

	}

}
