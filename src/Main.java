public class Main {
    public static void main(String[] args) {

        System.out.println("Homework6.1");

        Fraction fraction = new Fraction(3, 7);

        fraction.printFraction();

        System.out.println(fraction.sumFraction(2));

        System.out.println(fraction.multFraction(2));

        System.out.println(fraction.segmFraction(2));

        System.out.println("Homework6.2");

        Phone nokia = new Phone(12345, "Nokia", 150);
        Phone sony = new Phone(67123, "Sony", 130);
        Phone moto = new Phone(98376, "Motorola", 145);

        System.out.println(nokia.getDescription());
        System.out.println(sony.getDescription());
        System.out.println(moto.getDescription());

        nokia.receiveCall("Саша");
        nokia.getNumber();
        sony.receiveCall("Петя");
        sony.getNumber();
        moto.receiveCall("Света");
        moto.getNumber();

        sony.receiveCall("Костя", 83273);

        sony.sendMessage(12345, 56734, 48934, 13652, 75262);

    }
}