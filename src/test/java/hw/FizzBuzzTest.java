package hw;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

public class FizzBuzzTest {

  private Main fixture;

  @Before
  public void setUp() throws Exception {
    fixture = new Main();
  }

  @After
  public void tearDown() throws Exception {
    fixture = null;
  }

  @Test
  public void testFizzBuzzArray() throws Exception {
    assertNotNull(fixture);
    
    assertEquals(Main.fizzBuzzArray(-10),null);
  }


 @Test
  public void testFizzBuzzArrayTwo() throws Exception{
    assertNotNull(fixture);

   assertEquals(Main.fizzBuzzArray(-1),null);
  }


 @Test
  public void testFizzBuzzArrayThree() throws Exception {     //TODO: Find a way to do this with DRY in mind
    assertNotNull(fixture);
   
    assertEquals(Main.fizzBuzzArray(0),null);
  }


 @Test
  public void testFizzBuzzArrayFour() {
    assertNotNull(fixture);
    String[] testString = {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","Fizz Buzz","16","17"};
    assert(Arrays.equals(Main.fizzBuzzArray(1),Arrays.copyOfRange(testString,0,1)));
  }


 @Test
  public void testFizzBuzzArrayFive() {
    assertNotNull(fixture);
    String[] testString = {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","Fizz Buzz","16","17"};
    assert(Arrays.equals(Main.fizzBuzzArray(7),Arrays.copyOfRange(testString,0,7)));
  }


 @Test
  public void testFizzBuzzArraySix()  {
    assertNotNull(fixture);
    final String[] testString = {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","Fizz Buzz","16","17"};
    assert(Arrays.equals(Main.fizzBuzzArray(17),Arrays.copyOfRange(testString,0,17)));
  }
}
