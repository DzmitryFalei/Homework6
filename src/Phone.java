public class Phone {

    private int number;
    private String model;
    private int weight;

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getDescription() {
        return "Tel.№: " + number + ", model: " + model + ", weight: " + weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит: " + name);
    }

    public void getNumber() {
        System.out.println(number);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит: " + name + ", Tel.№: " + number);
    }

    public void sendMessage(int... numbers) {
        int length = numbers.length;
        for (int j : numbers) {
            System.out.println("Tel.№: " + j);
        }
    }
}
