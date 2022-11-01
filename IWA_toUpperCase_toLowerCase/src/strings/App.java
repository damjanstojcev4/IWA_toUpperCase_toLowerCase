package strings;

import java.util.Locale;

public class App {
    public static void main(String[] args) {
        ToLowerUpperCase toLowerUpperCase = new ToLowerUpperCase();

        System.out.println(toLowerUpperCase.setSentence("HELLO").toLowerCase(Locale.ROOT));
        System.out.println(toLowerUpperCase.setSentence("hello").toUpperCase(Locale.ROOT));
    }
}
