package functional_programming.task1_functional_interface;

public class SquareOfNumbersExample {

    public static void main(String[] args) {
        SquareOfNumbers squareOfNumbers = number -> Math.pow(number, 2);
        System.out.println(squareOfNumbers.getSquareOfNumbers(6.7));
    }
}
