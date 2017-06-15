/**
 * Этот класс выполняет арифметические операции
 */
public class Calculate {

    /** Метод принимает 3 аргумента и возвращает результат. Два дробных числа и и одну сроку.
     *  В строке содержиться знак арифметической операции
     * @param number1
     * @param number2
     * @param arithmetic
     * @return result
     */
    public double calc(double number1, double number2, String arithmetic) {
        double result = 0.0;

        if (arithmetic.equals("+")) {
            result = add(number1, number2);
        } else if (arithmetic.equals("-")) {
            result = sub(number1, number2);
        } else if (arithmetic.equals("*")) {
            result = mul(number1, number2);
        } else if (arithmetic.equals("/")) {
            result = div(number1, number2);
        } else if (arithmetic.equals("^")) {
            result = exp(number1, number2);
        }

        return result;
    }

    public double add(double... numbers) {
        return numbers[0] + numbers[1];
    }

    public double sub(double... numbers) {
        return numbers[0] - numbers[1];
    }

    public double mul(double... numbers) {
        return numbers[0] * numbers[1];
    }

    public double div(double... numbers) {
        return numbers[0] / numbers[1];
    }

    public double exp(double... numbers) {
        return Math.pow(numbers[0], numbers[1]);
    }
}
