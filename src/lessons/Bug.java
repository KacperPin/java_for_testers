package lessons;

public class Bug {

    // Zadanie 2

    String bugDescription;
    String emailAdress;
    int priority;
    boolean bugStatus;

    Bug(){

    }

    Bug(String bugDescription, String emailAdress, int priority){
        this.bugDescription = bugDescription;
        this.emailAdress = emailAdress;
        this.priority = priority;
        this.bugStatus = false;

    }

    void bugAllInformation(){
        System.out.println(bugDescription + " " + emailAdress + " " + priority + " " + bugStatus);
    }
    void personReportBug(){
        System.out.println("Email osoby zgłaszającej błąd to: " + emailAdress);
    }
    void getBugStatus(){
        if(bugStatus == false){
            System.out.println("Status błędu to: otwarty");
        }else{
            System.out.println("Status błędu to: zamknięty");
        }
    }
    int getBugPriority(){
        return priority;
    }






}
