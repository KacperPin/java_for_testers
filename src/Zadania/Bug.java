package Zadania;

public class Bug implements ConsoleNotification {

    // Zadanie 2

    private String bugDescription;
    private int priority;
    private boolean bugStatus;
    private BugReporter reporterInfo;

    Bug() {

    }

    public Bug(String bugDescription, int priority, BugReporter reporterInfo) {
        this.bugDescription = bugDescription;
        this.priority = priority;
        this.reporterInfo = reporterInfo;
        this.bugStatus = false;
    }

    public String getBugDescription() {
        return bugDescription;
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

    public void setPriority(int priority) {
        if (priority > 5 || priority < 1) {
            System.out.println("Priorytet musi być określony w zakresie od 1 do 5");
        } else {
            this.priority = priority;
        }
    }

    public void setBugStatus(boolean bugStatus) {
        this.bugStatus = bugStatus;
        notifyStatusChange();
    }

    @Override
    public void notifyStatusChange() {
        System.out.println("Zmieniono status bugu na : " + bugStatus);
    }

    @Override
    public String toString() {
        return "Bug{" +
                "bugDescription='" + bugDescription + '\'' +
                ", priority=" + priority +
                ", bugStatus=" + bugStatus +
                ", reporterInfo=" + reporterInfo +
                '}';
    }

    public BugReporter getReporterInfo() {
        return reporterInfo;
    }

    public void setReporterInfo(BugReporter reporterInfo) {
        this.reporterInfo = reporterInfo;
    }
}
