import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        System.out.print("İlk sayıyı girin: ");
        num1 = scanner.nextDouble();
        System.out.print("İkinci sayıyı girin: ");
        num2 = scanner.nextDouble();

        System.out.print("İşlemi seçin (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Sıfıra bölme hatası!");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Geçersiz işlem!");
                return;
        }

        System.out.println("Sonuç: " + result);
    }
}

