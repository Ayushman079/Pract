//UserInterface
import java.util.Scanner;

public class UserInterface {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		// Fill the code
		String eid="",name="",et="",rd="",ei="",ed="",hc="";
		int ha=0;
		EducationalEndowment ee=new EducationalEndowment(eid,name,et,rd,ei,ed);
		HealthEndowment he=new HealthEndowment(eid, name,et,rd,hc,ha);
		System.out.println("Enter Endowment Id");
		eid=sc.nextLine();
		ee.setEndowmentId(eid);
		System.out.println("Enter Holder Name");
		name=sc.nextLine();
		ee.setHolderName(name);
		System.out.println("Enter Endowment Type");
		et=sc.nextLine();
		
		ee.setEndowmentType(et);
		
		if(et.equalsIgnoreCase("Educational"))
		{
			System.out.println("Enter Registration Date");
			rd=sc.nextLine();
			ee.setEndowmentId(rd);
			
			System.out.println("Enter Educational Institution");
			ei=sc.nextLine();
			ee.setEducationalInstitution(ei);
			
			System.out.println("Enter Educational Division");
			ed=sc.nextLine().replaceAll("\\s", "");
			ee.setEducationalDivision(ed);
			
			System.out.printf("Endowment Amount %.2f",ee.calculateEndowment()); 
		}
		else if(et.equalsIgnoreCase("Health"))
		{
			System.out.println("Enter Registration Date");
			rd=sc.nextLine();
			he.setRegistrationDate(rd);
			
			System.out.println("Enter Health Care Center");
			hc=sc.nextLine();
			he.setHealthCareCenter(hc);
			
			System.out.println("Enter Holder Age");
			ha=sc.nextInt();
			he.setHolderAge(ha);
			
			System.out.printf("Endowment Amount %.2f", he.calculateEndowment()); 
			
		}
		else
		{
			System.out.println(et + " is an invalid endowment type");
		}
	}

}
