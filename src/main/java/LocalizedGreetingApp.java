import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LocalizedGreetingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose language: en, fr, es, fa");
        String lang = scanner.nextLine();

        Locale locale;
        switch (lang) {
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
        System.out.println(messages.getString("greeting"));
    }
}
