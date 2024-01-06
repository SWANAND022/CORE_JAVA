package fundamentals;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//type casting example down casting
		double marks=80.40;
		System.out.println("Marks as double type="+marks);
		
		
		
		int m=(int)marks;
		System.out.println("Marks as int type:"+m);
		
		//up casting example
		
		int num=400;
		double num2=num;
		System.out.println("Num:"+num);
		System.out.println("Num2:"+num2);
	}

}
