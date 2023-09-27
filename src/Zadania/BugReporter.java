package Zadania;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class BugReporter {

    protected String bugReporterName;
    protected String bugReporterLastName;
    protected String emailAdres;

    public BugReporter(String bugReporterName, String bugReporterLastName, String emailAdres) {
        this.bugReporterName = bugReporterName;
        this.bugReporterLastName = bugReporterLastName;
        this.emailAdres = emailAdres;
    }

    public String getBugReporterName() {
        return bugReporterName;
    }

    public void setBugReporterName(String bugReporterName) {
        this.bugReporterName = bugReporterName;
    }

    public String getBugReporterLastName() {
        return bugReporterLastName;
    }

    public void setBugReporterLastName(String bugReporterLastName) {
        this.bugReporterLastName = bugReporterLastName;
    }

    public String getEmailAdres() {
        return emailAdres;
    }

    @Override
    public String toString() {
        return "BugReporter{" +
                "bugReporterName='" + bugReporterName + '\'' +
                ", bugReporterLastName='" + bugReporterLastName + '\'' +
                ", emailAdres='" + emailAdres + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BugReporter that = (BugReporter) o;
        return Objects.equals(bugReporterName, that.bugReporterName) && Objects.equals(bugReporterLastName,
                that.bugReporterLastName) && Objects.equals(emailAdres, that.emailAdres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bugReporterName, bugReporterLastName, emailAdres);
    }

    public void setEmailAdres(@NotNull String emailAdress) {
        if (emailAdress.contains("@")) {
            this.emailAdres = emailAdress;
        } else {
            System.out.println("Adres email musi zawierać znak @ ");
        }
    }


}
