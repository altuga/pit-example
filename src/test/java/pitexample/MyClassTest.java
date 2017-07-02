package pitexample;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {



  @Test
  public void testYou() {

    MyClass sut = new MyClass();

    assertFalse(sut.yourMethod(0));
    assertTrue(sut.yourMethod(3));

  }


}