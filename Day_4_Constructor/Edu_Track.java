//  EduTrack is a coaching institute that manages student enrollments.
//   At the start of every academic year, a set of default students are
//    created in the system with roll number as 0, name as "Unassigned,"
//     and course as "General." When a student actually enrolls, the staff 
//     enters the student's name and course, and the roll number is 
//     automatically assigned starting from 101. Sometimes, when a student
//      transfers from one branch to another, the destination branch creates
//       a new student record that is a duplicate of the original branch's record
//        to ensure all academic history and details are preserved exactly. 
//        After duplication, only the roll number is reassigned at the new branch. 


class Enrollment{
    static int rollcount = 101 ;
    
    String name ;
    int rollno;
    String course;

    // At Start of academic 
    Enrollment(){
    
        this.name = "Unassigned";
        this.rollno = 0;
        this.course = "general";

    }

    // Actually enrolls  
    Enrollment(String name , String course){
        this.name = name ;
        this.rollno = rollcount++;
        this.course = course ;

    }
    
    // transfered student previous branch 
    Enrollment(String name , int rollno , String course){
        this.name = name ;
        this.rollno = rollno ;
        this.course = course;
    }

    //  transfered int new branch only rollno changes 
    Enrollment(Enrollment previous){
        this.name = previous.name ;
        this.rollno = rollcount++;
        this.course = previous.course;
    }

    void Student_info(){
        System.out.println("Student Name  : " + name );
        System.out.println("Roll No  : " + rollno);
        System.out.println("Course  : " + course);
        System.out.println("\n-------------------\n");
    }
}

public class Edu_Track {
    public static void main(String[] args) {
        Enrollment s1 = new Enrollment();
        s1.Student_info();

        Enrollment s2 = new Enrollment("Rahul" , "CSE" );
        s2.Student_info();

        Enrollment s3 = new Enrollment("luffy" , 35 , "Mechanical");
        s3.Student_info();

        Enrollment s4 = new Enrollment( s3 );
        s4.Student_info();
    }
    
}
