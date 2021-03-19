
public class Basket {
    public static void main(String[] bobs) {
        Orange[] oranges = new Orange[2];

        oranges[0] = new Orange();
        oranges[1] = new Orange(5, "flirty");

        printTheThing(oranges);

        System.out.println();
        for(Orange orange: oranges) {
            System.out.println("Species is: "+ orange.species); // public member
            System.out.println("Delicious meter is: " + orange.getDeliciousMeter());
        }

        oranges[0].setDeliciousMeter(8);

        for(Orange orange: oranges) {
            System.out.println("Species is: "+ orange.species); // public member
            System.out.println("Delicious meter is: " + orange.getDeliciousMeter());
        }
        
    }

    public static void printTheThing(Orange[] oranges) {
        System.out.print("[");
        for(int i = 0; i < oranges.length-1; ++i) {
            System.out.print(oranges[i]+", ");
        }
        System.out.println(oranges[oranges.length-1]+"]");
    }
}
