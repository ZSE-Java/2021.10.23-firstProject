public class App2 {
    public static void main(String[] args) {
        /*Client client;
        client = new Client();

        client.name = "Janusz";
        client.surname = "Kowalski";
        client.age = 30;
        client.pesel = 767547654757l;*/

        Client client = new Client("Janusz",
                "Kowalski",
                30,
                456345634l);

        System.out.println(client.name);

        Client[] tab = new Client[10];

        int wynik = client.add(2,4);
        double wynik2 = client.add(5.5, 7.5);

    }
}
