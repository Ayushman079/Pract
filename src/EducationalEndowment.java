
public class EducationalEndowment extends Endowment {
	
	// Fill the code
	private String educationalInstitution;
	private String educationalDivision;
	
	
	
	public EducationalEndowment(String endowmentId, String holderName, String endowmentType, String registrationDate,
			String educationalInstitution, String educationalDivision) {
		super(endowmentId, holderName, endowmentType, registrationDate);
		this.educationalInstitution = educationalInstitution;
		this.educationalDivision = educationalDivision;
	}
	
	public String getEducationalInstitution() {
		return educationalInstitution;
	}
	public void setEducationalInstitution(String educationalInstitution) {
		this.educationalInstitution = educationalInstitution;
	}
	public String getEducationalDivision() {
		return educationalDivision;
	}
	public void setEducationalDivision(String educationalDivision) {
		this.educationalDivision = educationalDivision;
	}
	
	public double calculateEndowment(){
		// Fill the code

		
		if(educationalDivision.equalsIgnoreCase("School"))
		{
			return 30000; 
		}
		else if(educationalDivision.equalsIgnoreCase("UnderGraduate"))
		{
			return 60000;
		}
		else if(educationalDivision.equalsIgnoreCase("PostGraduate"))
		{
			return 90000;
		}
		return 0;
	}

}
