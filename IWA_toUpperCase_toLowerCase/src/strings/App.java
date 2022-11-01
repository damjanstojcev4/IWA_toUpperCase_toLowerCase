package strings;

import java.util.Locale;

public class App {
    public static void main(String[] args) {
        ToLowerUpperCase toLowerUpperCase = new ToLowerUpperCase();

        System.out.println(toLowerUpperCase.setSentence("TO LOWER CASE").toLowerCase(Locale.ROOT));
        System.out.println(toLowerUpperCase.setSentence("to upper case").toUpperCase(Locale.ROOT));
    }
}
