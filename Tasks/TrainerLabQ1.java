package Tasks;

public class TrainerLabQ1 {
	
	private int trainerid;
    private String trainerName;
    private String subject;
    private String officeLocation;
    
    public TrainerLabQ1() {
    	System.out.println("This is Trainer 1 with 0 values inside.");
    }
    
    public TrainerLabQ1(int trainerid, String trainerName, String subject, String officeLocation) {
        this.trainerid = trainerid;
        this.trainerName = trainerName;
        this.subject = subject;
        this.officeLocation = officeLocation;
    }
    
    public void setTrainerId(int trainerid) {
        this.trainerid = trainerid;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }
    
    public int getTrainerId() {
        return trainerid;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public String getSubject() {
        return subject;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrainerLabQ1 t = new TrainerLabQ1(22, "Swanand Ghavate", "Core Java", "Mumbai");
		
		 System.out.println("Trainer ID=" + t.getTrainerId());
	     System.out.println("Trainer Name=" + t.getTrainerName());
	     System.out.println("Subject=" + t.getSubject());
	     System.out.println("Office Location=" + t.getOfficeLocation());
	}

}
