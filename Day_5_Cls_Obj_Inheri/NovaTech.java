// NovaTech is a software company. Every employee in NovaTech has a name, employee ID, and base salary. An employee can be promoted to TeamLead, who additionally has a team size 
// and a leadership bonus. A team lead can further be elevated to ProjectManager, who additionally has a project name and a project budget. The HR department wants to create a 
// project manager's profile and print the complete details, personal info, team info, and project info, all at once. 


class employee{
    String name;
    int ID;
    int salary;

    employee(String name , int ID , int salary){
        this.name = name ;
        this.ID= ID;
        this.salary = salary;
    }

    void Deatils(){
        System.out.println("Name : " + name );
        System.out.println("Id : " + ID);
        System.out.println("salary : " + salary); 
    }


}

class Teamlead extends employee{

    int teamsize;
    int bonous;
    
    Teamlead(String name, int ID, int salary , int teamsize , int bonous){
        super(name, ID, salary);
        this.teamsize = teamsize;
        this.bonous = bonous;
    }

    void Deatils(){
        super.Deatils();
        System.out.println("Team size : " + teamsize);
        System.out.println("Bonous : " + bonous);
    }
}

class ProjectManager extends Teamlead{

    String projectname ;
    int budget;

    ProjectManager(String name, int ID, int salary , int teamsize , int bonous ,String projectname , int budget) {
        super(name, ID, salary , teamsize , bonous);
        this.projectname = projectname;
        this.budget = budget ;
    }

    void Deatils(){
        super.Deatils();
        System.out.println("Projct name : " + projectname);
        System.out.println("Budget  : " + budget);
    }

}



public class NovaTech {
    public static void main(String[] args) {

        ProjectManager pm = new ProjectManager(
                "Rahul",
                101,
                80000,
                10,
                15000,
                "AI Automation",
                5000000
        );

        pm.Deatils();
    }
}

