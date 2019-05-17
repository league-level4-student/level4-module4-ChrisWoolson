package _04_hospital;

import java.util.ArrayList;

public class Doctor {
ArrayList<Patient> pats2 = new ArrayList<Patient>();
	boolean performsSurgery() {

		return false;
	}

	boolean makesHouseCalls() {
		return false;
	}
	
	void assignPatient(Patient pat) throws DoctorFullException {
		
		
		if(pats2.size()>2) {
			throw new DoctorFullException();
			
		}else {
		pats2.add(pat);
		}
		
	}
	
	ArrayList<Patient> getPatients() {
		return pats2;		
	}
	
	void doMedicine() {
		for (Patient patient : pats2) {
			patient.cared = true;
		}
		
		
		
		
		
	}
	
	
}
