// A government hospital is digitizing its patient registration. When a patient arrives at the emergency ward without any documents, the system registers
//  them with an auto-generated ID (starting from 1001), name as "Unknown," age as 0, and ward as "Emergency." When a patient comes to the OPD with their 
//  details, the receptionist enters the patient's name, age, and ward at the time of registration, and the ID is still auto-generated. The hospital also
//   runs weekly health camps, when a camp patient is later admitted to the hospital, the system needs to create a new hospital record that is an 
// identical copy of the camp record so that all previously collected information (name, age, health notes) is carried over without re-entry.


class Patient_Registration{
    static int idcounter = 1001; //auto generator 

    int patientId;
    String name;
    int age;
    String ward;
    String healthnotes ;

    // for Emergency 

    Patient_Registration(){
        this.patientId = idcounter++;
        this.name = "Unkown";
        this.age = 0;
        this.ward = "Emergency";
        this.healthnotes = "None";
    }

    //for detail patient
    Patient_Registration(String name , int age , String ward){
        this.patientId = idcounter++ ;
        this.name = name ;
        this.age = age ;
        this.ward = ward ;
        this.healthnotes = "None" ;

    }

    //healt camp
    Patient_Registration(String name , int age , String ward, String healthnotes ){
        this.patientId = idcounter++ ;
        this.name = name ;
        this.age = age ;
        this.ward = ward ;
        this.healthnotes = healthnotes ;
    }

    // later admission 
    Patient_Registration(Patient_Registration camp){
        this.patientId = idcounter++ ;
        this.name = camp.name ;
        this.age = camp.age ;
        this.ward = camp.ward ;
        this.healthnotes = camp.healthnotes ;
    }

    void display() {
        System.out.println("ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ward: " + ward);
        System.out.println("Health Notes: " + healthnotes);
        System.out.println("--------------------------");
    }
}

public class Gover_Hospital {

    public static void main(String[] args) {

        // Emergency patient
        Patient_Registration p1 = new Patient_Registration();
        p1.display();

        // OPD patient
        Patient_Registration p2 = new Patient_Registration("Rahul", 20, "OPD");
        p2.display();

        // Camp patient
        Patient_Registration camp = new Patient_Registration("Amit", 35, "Camp", "High BP");
        camp.display();

        // Camp patient admitted later (copy)
        Patient_Registration admitted = new Patient_Registration(camp);
        admitted.display();

    }
    
}
