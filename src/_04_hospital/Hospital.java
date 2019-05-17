package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	public ArrayList<Patient> pats = new ArrayList<Patient>();
	ArrayList<Doctor> docs = new ArrayList<Doctor>();

	public void addDoctor(Doctor doc) {
		docs.add(doc);
	}

	public ArrayList<Doctor> getDoctors() {

		return docs;

	}

	public void addPatient(Patient p) {
		pats.add(p);
	}

	public ArrayList<Patient> getPatients() {
		return pats;
	}
	
	
	public void assignPatientsToDoctors() {
		
	int ds = 0;
	
	for (int i = 0; i < pats.size(); i++) {
		try {
			docs.get(ds).assignPatient(pats.get(i));
		}catch(DoctorFullException dfe) {
			ds++;
			i--;
		}
		
	}
		
		
		
	}
	
	
	

}
