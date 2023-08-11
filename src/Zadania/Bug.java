package Zadania;

public class Bug {

    // Zadanie 2

    private String bugDescription;
    private String emailAdress;
    private int priority;
    private boolean bugStatus;

    Bug() {

    }

    public Bug(String bugDescription, String emailAdress, int priority) {
        this.bugDescription = bugDescription;
        this.emailAdress = emailAdress;
        this.priority = priority;
        this.bugStatus = false;

    }

    public String getBugDescription() {
        return bugDescription;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public int getPriority() {
        return priority;
    }

    public boolean getBugStatus() {
        return bugStatus;
    }

    public void setBugDescription(String bugDescription) {
        int length = 10;
        if (bugDescription.length() < length) {
            System.out.println("Nie można ustawić nowego opisu błędu, długość zgłoszenie nie może być krótsza niż: "
                    + length + " znaków.");
        } else {
            this.bugDescription = bugDescription;
        }
    }

    public void setEmailAdress(String emailAdress) {
        if (emailAdress.contains("@")) {
            this.emailAdress = emailAdress;
        } else {
            System.out.println("Adres email musi zawierać znak @ ");
        }
    }

    public void setPriority(int priority) {
        if (priority > 5 || priority < 1) {
            System.out.println("Priorytet musi być określony w zakresie od 1 do 5");
        } else {
            this.priority = priority;
        }
    }

    public void setBugStatus(boolean bugStatus) {
        this.bugStatus = bugStatus;
    }

    public void bugAllInformation(){
        System.out.println("Opis błędu: " + bugDescription + " Adres email: " + emailAdress + " Priorytet: " + priority + " Status błędu: " + bugStatus);
    }
//    void personReportBug(){
//        System.out.println("Email osoby zgłaszającej błąd to: " + emailAdress);
//    }
//    void getBugStatus(){
//        if(bugStatus == false){
//            System.out.println("Status błędu to: otwarty");
//        }else{
//            System.out.println("Status błędu to: zamknięty");
//        }
//    }
//    int getBugPriority(){
//        return priority;
//    }


}
