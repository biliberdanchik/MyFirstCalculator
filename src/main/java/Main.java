import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Для ввода данных с клавиатуры

        System.out.println("Калькулятор запущен. Введи выражение для вычисления:");

        double firstNumber;
        //double secondNumber;
        String operator;

        System.out.println("Введите выражение");
        firstNumber = scanner.nextDouble();
        //System.out.println("Введите оператор");
        operator = scanner.next();
        //System.out.println("Введите второе число");

        if (Objects.equals(operator, "+")) {
            System.out.print(Calculator.sum(firstNumber, scanner.nextDouble()));
        } else if (Objects.equals(operator, "-")) {
            System.out.print(Calculator.sub(firstNumber, scanner.nextDouble()));
        } else if (Objects.equals(operator, "*")) {
            System.out.print(Calculator.multi(firstNumber, scanner.nextDouble()));
        } else if (Objects.equals(operator, "/")) {
            System.out.print(Calculator.div(firstNumber, scanner.nextDouble()));
        }
    }
}
