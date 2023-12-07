public class Main {
    public static void main(String[] args) {
        startTask();
        int number = 10;
        System.out.println(getSquare(number));
    }

    public static int getSquare(int number) {
        int sum = number;
        sum = sum * sum;
        return sum;
    }
    public static void startTask() {
        System.out.println("Задание из билета №6");
    }


}