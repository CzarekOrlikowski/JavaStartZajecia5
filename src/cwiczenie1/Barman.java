package cwiczenie1;

public class Barman {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setFirstName("Jan");
        person1.setLastName("Kowalski");
        person1.setAge(20);

        Drink drink1 = new Drink();
        drink1.setName("Maryna");
        drink1.setPrice(15);
        drink1.setAlcohol(true);

        if (person1.getAge() > 18 && drink1.getAlcohol()) {
            System.out.println("Drink dostępny");
        } else System.out.println("Drink");

    }
}
