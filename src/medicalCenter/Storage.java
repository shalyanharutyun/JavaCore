package medicalCenter;

import medicalCenter.Doctor;
import medicalCenter.Patient;

public class Storage {

    private Doctor[] doctors = new Doctor[100];
    private Patient[] patients = new Patient[100];
    private int doctorSize = 0;
    private int patientSize = 0;

    public void addDoctor(Doctor doctor) {
        doctors[doctorSize++] = doctor;
    }

    public void addPatient(Patient patient) {
        patients[patientSize++] = patient;
    }

    public Doctor getDoctorById(String id) {
        for (int i = 0; i < doctorSize; i++) {
            if (doctors[i].getId().equals(id)) return doctors[i];
        }
        return null;
    }

    public void deleteDoctorById(String id) {
        for (int i = 0; i < doctorSize; i++) {
            if (doctors[i].getId().equals(id)) {
                doctors[i] = doctors[doctorSize - 1];
                doctorSize--;
                return;
            }
        }
    }

    public void printDoctorsByProfession(String profession) {
        for (int i = 0; i < doctorSize; i++) {
            if (doctors[i].getProfession().name().equalsIgnoreCase(profession)) {
                System.out.println(doctors[i]);
            }
        }
    }

    public void printPatientsByDoctor(Doctor doctor) {
        for (int i = 0; i < patientSize; i++) {
            if (patients[i].getDoctor().equals(doctor)) {
                System.out.println(patients[i]);
            }
        }
    }

    public void printAllPatients() {
        for (int i = 0; i < patientSize; i++) {
            System.out.println(patients[i]);
        }
    }

    public void printAllDoctors() {
        for (int i = 0; i < doctorSize; i++) {
            System.out.println(doctors[i]);
        }
    }
}
