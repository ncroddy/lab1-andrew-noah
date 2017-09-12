package hw;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

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
    
    assertEquals(Main.fizzBuzzList(-10),null);
  }


 @Test
  public void testFizzBuzzArrayTwo() throws Exception{
    assertNotNull(fixture);

   assertEquals(Main.fizzBuzzList(-1),null);
  }


 @Test
  public void testFizzBuzzArrayThree() throws Exception {     //TODO: Find a way to do this with DRY in mind
    assertNotNull(fixture);
   
    assertEquals(Main.fizzBuzzList(0),null);
  }


 @Test
  public void testFizzBuzzArrayFour() {
    assertNotNull(fixture);
    List<String> testString = new ArrayList<String>(Arrays.asList( "1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","Fizz Buzz","16","17"));
    for(int i = 0; i <1;i++){
    assertEquals(testString.get(i),Main.fizzBuzzList(1).get(i));
    }
  }

 @Test
  public void testFizzBuzzArrayFive() {
    assertNotNull(fixture);
    List<String> testString = new ArrayList<String>(Arrays.asList( "1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","Fizz Buzz","16","17"));
    for(int i = 0; i <7;i++){
    assertEquals(testString.get(i),Main.fizzBuzzList(7).get(i));
    }
  }
  
   @Test
  public void testFizzBuzzArraySix() {
    assertNotNull(fixture);
    List<String> testString = new ArrayList<String>(Arrays.asList( "1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","Fizz Buzz","16","17"));
    for(int i = 0; i <17;i++){
    assertEquals(testString.get(i),Main.fizzBuzzList(17).get(i));
    }
  }

}
