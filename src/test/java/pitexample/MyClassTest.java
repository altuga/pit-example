package pitexample;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {



  @Test
  public void testYou() {

    MyClass sut = new MyClass();

    assertFalse(sut.yourMethod(0));
    assertTrue(sut.yourMethod(3));
    assertTrue(sut.yourMethod(1)); // alt sinir
    assertTrue(sut.yourMethod(5)); // ust sinir

  }


  @Test
  public void testTopla() {

    MyClass sut = new MyClass();
    assertEquals(7, sut.topla(2,5));

  }

}