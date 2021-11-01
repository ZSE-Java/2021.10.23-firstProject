public class App {
    public static void main(String[] args) {
        int i = 0;

        System.out.println(i++);
        System.out.println(++i);
        System.out.println(--i);
        System.out.println(i--);

        int[] tab = new int[10];

        tab[0] = 5;
        tab[1] = 7;

        System.out.println(tab[7]);

        int[] tab2 = {1,2,3,4};

        if(i > 2) {

        } else if(false) {

        } else {

        }

        int i2 = 3;

        switch (i2) {
            case 1:
                System.out.println("To jest 1");
            case 2:
            case 3:
                System.out.println("To jest 3");

                default:
                    System.out.println("Nie wiedomo co to");
        }

        for(int element : tab) {
            System.out.println(element);
        }

        while (true) {
            break;
        }

        do {
            System.out.println();
        } while (true);

    }
}
