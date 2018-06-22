import org.junit.*;
import static org.junit.Assert.*;

public class FizzBuzz {
  
  public String FizzBuzz(int input){
   if (input % 15 == 0) {
      return "FizzBuzz";
    }    
    if (input % 5 == 0) {
      return "Buzz";
    }
    if (input % 3 == 0) {
      return "Fizz";
    }
    return Integer.toString(input);      
  }
  
  @Test
  public void ShouldReturnFizzBuzzGivenMultiplesOfFifteen() {
    assertEquals("FizzBuzz", FizzBuzz(15));
    assertEquals("FizzBuzz", FizzBuzz(30));
    assertEquals("FizzBuzz", FizzBuzz(45));
  }
  
  @Test
  public void ShouldReturnBuzzGivenMultiplesOfFive() {
     assertEquals("Buzz", FizzBuzz(5));
     assertEquals("Buzz", FizzBuzz(10));
     assertEquals("Buzz", FizzBuzz(20));
  }
  
  @Test
  public void ShouldReturnFizzGivenMultiplesOfThree() {
     assertEquals("Fizz", FizzBuzz(3));
    assertEquals("Fizz", FizzBuzz(6));
    assertEquals("Fizz", FizzBuzz(9));
  }

  @Test
    public void shouldReturnInputIfNotMultipleOfThreeOrFive() {
      assertEquals("1", FizzBuzz(1));
      assertEquals("2", FizzBuzz(2));
      assertEquals("4", FizzBuzz(4));
    }
}