package wyjatki;

public class App {
    public static void main(String[] args) {
        String input = "janusz";

        try {
            validate(input);
        } catch (LoginValidationException | LoginLengthValidationException e) {
            System.out.println();

        }

    }

    public static void a() {
        b();
    }

    public static void b() {
        c();
    }

    public static void c() {
        try {
            d();
        } catch (IndexOutOfBoundsException e) {

        }

    }

    public static void d() throws IndexOutOfBoundsException, IllegalArgumentException {
        int[] tab = new int[10];
        System.out.println(tab[15]);
    }

    public static void validate(String login) throws LoginValidationException {
        char first = login.charAt(0);
        if(Character.isLowerCase(first)) {
            throw new LoginValidationException("first letter is not loweer case !!");
        }

        if(login.length() < 5) {
            throw new LoginLengthValidationException();
        }
    }
}
