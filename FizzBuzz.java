import org.junit.*;
import static org.junit.Assert.*;

public class FizzBuzz {

    public String FizzBuzz(int input){
      return "1";
    }
  
    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
       assertEquals("1", FizzBuzz(1));
    }
}