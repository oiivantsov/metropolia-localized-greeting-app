import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LocalizedGreetingApp {

    public static String getGreeting(String langCode) {
        Locale locale;
        switch (langCode) {
            case "fr":
                locale = new Locale("fr", "FR");
                break;
            case "es":
                locale = new Locale("es", "ES");
                break;
            case "fa":
                locale = new Locale("fa", "IR");
                break;
            default:
                locale = new Locale("en", "US");
        }

        ResourceBundle messages = ResourceBundle.getBundle("messages", locale);
        return messages.getString("greeting");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose language: en, fr, es, fa");
        String lang = scanner.nextLine();

        String greeting = getGreeting(lang);
        System.out.println(greeting);
    }
}
