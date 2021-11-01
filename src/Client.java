public class Client {
    String name;
    String surname;
    int age;
    long pesel;

    Client() {
    }

    public Client(String name, String surname, int age, long pesel) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.pesel = pesel;
    }

    int add(int a, int b) {
        this.age = 36;
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
