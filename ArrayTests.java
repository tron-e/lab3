import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void test3(){
    int [] input1 = {2, 3};
    assertArrayEquals(new int[] {3,2}, ArrayExamples.reversed(input1));
  }

  @Test
  public void test4(){
    int [] input1 = {1,2,3,4,5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5,4,3,2,1}, input1);
  }

  @Test
  public void test5(){
    double[] input1 = {2,2,4};
    assertEquals(new double [] {3.0}, ArrayExamples.averageWithoutLowest(input1)); 
  }
}

