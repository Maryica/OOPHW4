package data;

/**
 * Класс User хранит атрибуты пользователя и это соответствует приципу
 * единственной ответственности.
 * Т.к. класс User без изменения исходного кода расширяется (Teacher) то так же
 * соответствует приципу открытости/закрытости
 * Классы Student и Teacher могут быть использованы вместо User что соответсвует
 * приципу подстановки Барбары Лисков
 */
public class User {
    private String firstName;
    private String secondName;
    private String lastName;

    public User(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}