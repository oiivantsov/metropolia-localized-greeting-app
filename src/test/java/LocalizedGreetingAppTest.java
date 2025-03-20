import org.junit.jupiter.api.Test;
import java.util.Locale;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocalizedGreetingAppTest {

    @Test
    void testEnglishLocale() {
        assertEquals("Hello! Welcome to our application.", LocalizedGreetingApp.getGreeting("en"));
    }

    @Test
    void testFrenchLocale() {
        assertEquals("Bonjour! Bienvenue dans notre application.", LocalizedGreetingApp.getGreeting("fr"));
    }

    @Test
    void testSpanishLocale() {
        assertEquals("¡Hola! Bienvenido a nuestra aplicación.", LocalizedGreetingApp.getGreeting("es"));
    }

    @Test
    void testFarsiLocale() {
        assertEquals("سلام! به برنامه ما خوش آمدید", LocalizedGreetingApp.getGreeting("fa"));
    }
}
