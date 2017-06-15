import java.io.*;

/**
 * Этот класс считывает с консоли строку
 */

public class UserWrite {

    /** Метод принимает текст с описанием действия пользователя, считывает строку и возвращает ее.
     * @param text
     * @return string
     */
    public static String writeString(String text) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = null;
        System.out.print(text);
        try {
            string = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return string;
    }
}
