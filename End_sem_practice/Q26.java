// Q26: Write a Java program to design classes for Hospital, Doctor, Patient, and Appointment.
// Implement methods to schedule appointments, manage patient and doctor information, and display details.

import java.util.*;

class Doctor {
    int id;
    String name;
    String specialization;

    Doctor(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    void displayDoctor() {
        System.out.println("Doctor ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
    }
}

class Patient {
    int id;
    String name;
    int age;

    Patient(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void displayPatient() {
        System.out.println("Patient ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Appointment {
    Doctor doctor;
    Patient patient;
    String date;

    Appointment(Doctor doctor, Patient patient, String date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }

    void displayAppointment() {
        System.out.println("\nAppointment Details:");
        doctor.displayDoctor();
        patient.displayPatient();
        System.out.println("Date: " + date);
    }
}

class Hospital {
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();
    List<Appointment> appointments = new ArrayList<>();

    void addDoctor(Doctor d) {
        doctors.add(d);
    }

    void addPatient(Patient p) {
        patients.add(p);
    }

    void scheduleAppointment(Doctor d, Patient p, String date) {
        Appointment a = new Appointment(d, p, date);
        appointments.add(a);
        System.out.println("Appointment Scheduled Successfully!");
    }

    void displayAll() {
        System.out.println("\n--- Doctors ---");
        for (Doctor d : doctors) d.displayDoctor();

        System.out.println("\n--- Patients ---");
        for (Patient p : patients) p.displayPatient();

        System.out.println("\n--- Appointments ---");
        for (Appointment a : appointments) a.displayAppointment();
    }
}

public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();

        // Input Doctor
        System.out.print("Enter Doctor ID: ");
        int did = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Doctor Name: ");
        String dname = sc.nextLine();
        System.out.print("Enter Specialization: ");
        String spec = sc.nextLine();

        Doctor d = new Doctor(did, dname, spec);
        hospital.addDoctor(d);

        // Input Patient
        System.out.print("\nEnter Patient ID: ");
        int pid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Patient Name: ");
        String pname = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        Patient p = new Patient(pid, pname, age);
        hospital.addPatient(p);

        // Schedule Appointment
        System.out.print("\nEnter Appointment Date: ");
        String date = sc.nextLine();
        hospital.scheduleAppointment(d, p, date);

        // Display all details
        hospital.displayAll();

        sc.close();
    }
}