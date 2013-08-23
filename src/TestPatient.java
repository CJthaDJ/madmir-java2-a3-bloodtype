
public class TestPatient {
    //Enter Patient ID, Blood Type, Age and RH Factor
	public static void main(String[] args) {
		BloodType ashleyBloodType = new BloodType("B", '-');
		Patient ashley = new Patient(86753, 21, ashleyBloodType);
		BloodType keithBloodType = new BloodType("A", '+');
		Patient keith = new Patient(86800, 35, keithBloodType);
		BloodType clydeBloodType = new BloodType("AB", '-');
		Patient clyde = new Patient(88000, 37, clydeBloodType);
		
		
	//Enter Patients Age and ID Number	
		ashley.setPatientAge(21);
		ashley.setPatientsIdNumber(10010);
		
	// User Output	
		System.out.println("Ashley's ID number is  " + ashley.getPatientIdNumber() + " She is  +"
				+ ashley.getPatientAge() + " years old, Her blood type is " + ashley.getBloodType());
		
		System.out.println("Keith's ID number is " + keith.getPatientIdNumber() + " He is +"
				+ keith.getPatientAge() + " years old,  His blood type is  " + keith.getBloodType());
		
		System.out.println("Clyde's ID number is  " + clyde.getPatientIdNumber() + " He is   +"
				+ clyde.getPatientAge() + "  years old, His blood type is  " + clyde.getBloodType());
		
		
		
		

	}

}
