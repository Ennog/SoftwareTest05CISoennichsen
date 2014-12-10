import org.junit.Assert;
import org.junit.Test;

/**
 * Created by milena on 04/11/14.
 */
public class FizzBuzzTest {
    @Test
    public void testFizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String ergebnis = fizzBuzz.antwort(3);
        Assert.assertEquals("ergbnis ist fizz","fizz", ergebnis);
    }
}
