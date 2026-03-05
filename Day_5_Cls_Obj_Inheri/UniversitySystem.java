// A university has a general Person record system that stores a person's name and ID. Every Student in the university is a personf but also has a department and CGPA. The 
// university also has a ResearchScholar category, a research scholar is a student who additionally has a research topic and a guide name. The admin wants to create a 
// research scholar's profile and display the complete information including personal details, academic details, and research details all from a single object.


// Base Class
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void showPersonDetails() {
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
    }
}

// Student inherits Person
class Student extends Person {
    String department;
    double cgpa;

    Student(String name, int id, String department, double cgpa) {
        super(name, id);
        this.department = department;
        this.cgpa = cgpa;
    }

    void showStudentDetails() {
        super.showPersonDetails();
        System.out.println("Department : " + department);
        System.out.println("CGPA       : " + cgpa);
    }
}

// ResearchScholar inherits Student
class ResearchScholar extends Student {
    String researchTopic;
    String guideName;

    ResearchScholar(String name, int id, String department, double cgpa,
                    String researchTopic, String guideName) {
        super(name, id, department, cgpa);
        this.researchTopic = researchTopic;
        this.guideName = guideName;
    }

    void showFullProfile() {
       super. showStudentDetails();
        System.out.println("Research Topic : " + researchTopic);
        System.out.println("Guide Name     : " + guideName);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {

        ResearchScholar rs = new ResearchScholar(
                "Rahul",
                101,
                "Computer Science",
                8.7,
                "Artificial Intelligence",
                "Dr. Sharma"
        );

        rs.showFullProfile();
    }
}