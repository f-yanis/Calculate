/**
 * Этот класс является ядром программы. Он объединяет в себе все компоненты.
 */
public class Logic {
    private ParseString parseString = new ParseString();
    private Calculate calculate = new Calculate();

    public void start() {
        String arifmString = null;
        double result = 0.0;

        while (true) {
            arifmString = UserWrite.writeString("Введте выражение типа [x + y] не забывайте про пробелы:");
            parseString.parse(arifmString);
            result = calculate.calc(parseString.getNumber1(),
                                    parseString.getNumber2(),
                                    parseString.getArithmetic());
            if (result % 1 == 0) {
                System.out.println(arifmString + " = " + (int) result);
            } else {
                System.out.println(arifmString + " = " + result);
            }
        }
    }
}
