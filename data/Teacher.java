package data;

public class Teacher extends User {

    public Teacher(String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
    }

    @Override
    public String toString() {
        return "Учитель " + getFirstName() + " " + getLastName() + " " + getSecondName();
    }
}