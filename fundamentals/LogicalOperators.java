package fundamentals;

public class LogicalOperators {
	
	public void eligibility(double marks, int experience) {
		
		System.out.println("Eligible for TechMahindra:"+((marks>60) && (experience>2)));
		System.out.println("Eligible for MyGlobal:"+((marks>60) || (experience>2)));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double swanandMarks=90;
		int swanandExp=4;
		
		double sahilMarks=60;
		int sahilExp=0;
		
		LogicalOperators lo = new LogicalOperators();
		
		System.out.println("Eligibility of swanand.....");
		lo.eligibility(swanandMarks, swanandExp);
		
		
		System.out.println("Eligibility of sahil.....");
		lo.eligibility(sahilMarks, sahilExp);
		
		

	}

}
