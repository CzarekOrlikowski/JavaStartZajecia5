package cwiczenie2;

public class User {
    String firstName;
    String lastName;
    int age;
    int pesel;


    public User() {
    }

    public User(String firstName, String lastName, int age, int pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel=" + pesel +
                '}';
    }
}

//        public String getFullInfo() {
//            return firstName + ", " + lastName + ", " + pesel + ", " + age + " lat";



