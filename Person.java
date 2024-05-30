package ifiyemi_QAP2JAVA;

public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    // Constructor
    public Person(String lastName, String firstName, Address home) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }

    // toString method
    public String toString() {
        return (this.firstName + " " + this.lastName + ", " + this.home);
    }
}
