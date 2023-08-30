public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {

        if (denominator > 0) {
            this.numerator = numerator;
            this.denominator = denominator;
        } else {
            System.out.println("Знаменатель должен быть больше нуля");
        }
    }

    public void printFraction() {
        System.out.println(numerator + " / " + denominator);
    }

    public double sumFraction(double sumFraction) {

        return sumFraction + (double)numerator / denominator;
    }

    public double multFraction(double multFraction) {

        return multFraction + (double)numerator / denominator;
    }

    public double segmFraction(double segmFraction) {

        return (double)numerator / denominator / segmFraction;
    }
}
