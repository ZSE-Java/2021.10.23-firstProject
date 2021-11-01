public class App4 {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.age = 40;
        dog.name = "Czarek";

        dog.walk();

        Snake snake = new Snake();

        snake.walk();

        Pet p = new Dog();

        final Dog d = new Dog();

        d.bark();

        ((Dog) p).bark();

        d.name = "Czarek";


        Dog.bark();

        Cat cat = new Cat();
        Cat cat2 = new Cat();
        Cat.age = 6;

        System.out.println(cat.age);
        System.out.println(cat2.age);

        cat.age = 10;

        System.out.println(cat.age);
        System.out.println(cat2.age);

        /*Interface obiekt = new Interface();

        obiekt.pobierzCosZBazy(5);
        obiekt.wyliczCos(3, 5);*/
    }
}
