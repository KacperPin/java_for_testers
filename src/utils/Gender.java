package utils;

public enum Gender {
    FEMALE("KOBIETA"),
    MALE("MĘŻCZYZNA");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
