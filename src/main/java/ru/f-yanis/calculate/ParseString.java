/**
 * Этот класс парсит строку и переводит ее в double
 */
public class ParseString {
    private double number1;
    private double number2;
    private String arithmetic;

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public String getArithmetic() {
        return arithmetic;
    }

    public void parse(String string) {
        String[] arraySplit = string.split(" ");
        number1 = Double.parseDouble(arraySplit[0]);
        number2 = Double.parseDouble(arraySplit[2]);
        arithmetic = arraySplit[1];
    }
}
