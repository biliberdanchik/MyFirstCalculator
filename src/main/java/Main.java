import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Для ввода данных с клавиатуры

        Calculator calculator = new Calculator(); //Объект класса Calculator для вызова методов вычисления

        calculator.sum(scanner.nextDouble(), scanner.nextDouble());
    }
}
