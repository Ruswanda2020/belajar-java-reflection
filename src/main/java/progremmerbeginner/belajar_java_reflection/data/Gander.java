package progremmerbeginner.belajar_java_reflection.data;

public enum Gander {

    MALE("male"),
    FEMALE("female") ;

    private final String dectription;

    Gander(String dectription) {
        this.dectription = dectription;
    }

    public String getDectription() {
        return dectription;
    }
}
