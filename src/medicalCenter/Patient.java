package medicalCenter;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Patient extends Person {

    private Doctor doctor;
    private LocalDateTime registerDateTime;
    private LocalDate registerDate;

    public Patient(String id, String name, String surname, String phone, Doctor doctor, LocalDateTime registerDateTime, LocalDate registerDate) {
        super(id, name, surname, phone);
        this.doctor = doctor;
        this.registerDateTime = registerDateTime;
        this.registerDate = registerDate;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public LocalDateTime getRegisterDateTime() {
        return registerDateTime;
    }

    @Override
    public String toString() {
        return "Patient{" +
                super.toString() +
                ", doctor=" + doctor.getName() + " " + doctor.getSurname() +
                ", registerDate=" + registerDateTime +
                '}';
    }
}
