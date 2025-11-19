package medicalCenter;

import medicalCenter.Commands;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

class MedicalCenterDemo implements Commands {

    private static Storage storage = new Storage();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean run = true;
        while (run) {
            printCommands();
            int command = Integer.parseInt(scanner.nextLine());

            switch (command) {
                case EXIT:
                    run = false;
                    break;

                case ADD_DOCTOR:
                    addDoctor();
                    break;

                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;

                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;

                case CHANGE_DOCTOR_BY_ID:
                    changeDoctorById();
                    break;

                case ADD_PATIENT:
                    addPatient();
                    break;

                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printPatientsByDoctor();
                    break;

                case PRINT_ALL_PATIENTS:
                    storage.printAllPatients();
                    break;

                default:
                    System.out.println("Wrong command!");
            }
        }
    }

    private static void printCommands() {
        System.out.println("\nPlease input command:");
        System.out.println("0 - EXIT");
        System.out.println("1 - ADD DOCTOR");
        System.out.println("2 - SEARCH DOCTOR BY PROFESSION");
        System.out.println("3 - DELETE DOCTOR BY ID");
        System.out.println("4 - CHANGE DOCTOR BY ID");
        System.out.println("5 - ADD PATIENT");
        System.out.println("6 - PRINT ALL PATIENTS BY DOCTOR");
        System.out.println("7 - PRINT ALL PATIENTS");
    }

    private static void addDoctor() {
        System.out.println("Enter doctor data: id,name,surname,phone,email,profession");
        String[] data = scanner.nextLine().split(",");

        Doctor doctor = new Doctor(
                data[0],
                data[1],
                data[2],
                data[3],
                data[4],
                Profession.valueOf(data[5].toUpperCase())
        );

        storage.addDoctor(doctor);
        System.out.println("Doctor added!");
    }

    private static void searchDoctorByProfession() {
        System.out.println("Input profession:");
        String profession = scanner.nextLine();
        storage.printDoctorsByProfession(profession);
    }

    private static void deleteDoctorById() {
        System.out.println("Input doctor ID:");
        storage.deleteDoctorById(scanner.nextLine());
    }

    private static void changeDoctorById() {
        System.out.println("Input doctor ID:");
        Doctor doctor = storage.getDoctorById(scanner.nextLine());

        if (doctor == null) {
            System.out.println("Doctor not found!");
            return;
        }

        System.out.println("Input new name:");
        doctor.setName(scanner.nextLine());

        System.out.println("Input new surname:");
        doctor.setSurname(scanner.nextLine());

        System.out.println("Input new phone:");
        doctor.setPhone(scanner.nextLine());

        System.out.println("Input new email:");
        doctor.setEmail(scanner.nextLine());

        System.out.println("Input new profession:");
        doctor.setProfession(Profession.valueOf(scanner.nextLine().toUpperCase()));

        System.out.println("Doctor updated!");
    }

    private static void addPatient() {
        System.out.println("Enter doctor ID:");
        Doctor doctor = storage.getDoctorById(scanner.nextLine());

        if (doctor == null) {
            System.out.println("Doctor not found!");
            return;
        }

        System.out.println("Enter patient data: id,name,surname,phone");
        String[] data = scanner.nextLine().split("");

        Patient patient = new Patient(
                data[0],
                data[1],
                data[2],
                data[3],
                doctor,
                LocalDateTime.now(),
                LocalDate.now()
        );


        storage.addPatient(patient);
        System.out.println("Patient added!");
    }

    private static void printPatientsByDoctor() {
        System.out.println("Input doctor ID:");
        Doctor doctor = storage.getDoctorById(scanner.nextLine());

        if (doctor == null) {
            System.out.println("Doctor not found!");
            return;
        }

        storage.printPatientsByDoctor(doctor);
    }
}
