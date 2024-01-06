package Tasks;

import java.util.Scanner;

public class ClassPlan4Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a month: ");
        String month = sc.nextLine();

        switch (month) {
            case "January":
                System.out.println("Major Festival: New Year's Day");
                break;
            case "February":
                System.out.println("Major Festival: Valentine's Day");
                break;
            case "March":
                System.out.println("Major Festival: Holi");
                break;
            case "April":
                System.out.println("Major Festival: Easter");
                break;
            case "May":
                System.out.println("Major Festival: May Day");
                break;
            case "June":
                System.out.println("Major Festival: Eid al-Fitr");
                break;
            case "July":
                System.out.println("Major Festival: Independence Day");
                break;
            case "August":
                System.out.println("Major Festival: Raksha Bandhan");
                break;
            case "September":
                System.out.println("Major Festival: Ganesh Chaturthi");
                break;
            case "October":
                System.out.println("Major Festival: Diwali");
                break;
            case "November":
                System.out.println("Major Festival: Thanksgiving");
                break;
            case "December":
                System.out.println("Major Festival: Christmas");
                break;
            default:
                System.out.println("Invalid month input");
        }

	}

}
