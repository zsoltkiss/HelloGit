package hu.zsoltkiss;

public class Person {

    private String firstName;
    private String lastName;

    public Person(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
