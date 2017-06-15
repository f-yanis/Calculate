/**
 * Этот класс выполняет арифметические операции
 */
public class Calculate {
    // Метод принимает 3 аргумента и возвращает результат. Два дробных числа и и одну сроку.
    // В строке содержиться знак арифметической операции
    public double calc(double number1, double number2, String arithmetic) {
        double result = 0.0;

        if (arithmetic.equals("+")) {
            result = number1 + number2;
        } else if (arithmetic.equals("-")) {
            result = number1 - number2;
        } else if (arithmetic.equals("*")) {
            result = number1 * number2;
        } else if (arithmetic.equals("/")) {
            result = number1 / number2;
        } else if (arithmetic.equals("^")) {
            result = Math.pow(number1, number2);
        }

        return result;
    }
}
