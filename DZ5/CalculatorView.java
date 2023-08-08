package DZ5;
import java.util.Scanner;
public class CalculatorView {
    private static final String message = null;
    private static final String name = null;
    private static final String result = null;
    private final Scanner scanner = new Scanner(System.in);
    public void showWelcomeMessage() {
        System.out.println("Добро пожаловать в калькулятор!");
    }

    public String getUserOperation() {
        System.out.println("Введите знак действия (+, -, *, /):");
        return scanner.nextLine();
    }

    public void showError(String string) {
    
        System.out.println("Ошибка: " + message);}

    public double getUserNumber(String string) {
        System.out.println("Введите " + name + " число:");
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Неправильное число");
            }
        }
    }

    public void getResult(double add) {
        System.out.println("Результат: " + result);
     }

}
