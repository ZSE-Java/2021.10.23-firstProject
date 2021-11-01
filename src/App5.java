import javafx.beans.property.SimpleBooleanProperty;

public class App5 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        Square s1 = new Square(5, 25, 20);
        Square s2 = new Square(5, 25, 20);

        System.out.println(a == b);
        System.out.println(s1.equals(s2));

        String string1 = "ABC";
        String string2 = new String("ABC");

        System.out.println(string1 == string2);
    }
}
