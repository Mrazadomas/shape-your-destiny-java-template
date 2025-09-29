package org.example;
import java.lang.Math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  // You can write your unit tests here.
  @Test
  void appWorks() {
    Rectangle r = new Rectangle(2,3);
    assertEquals(r.getArea(), 6);
    assertEquals(r.getPerimeter(), 10);
    Rtriangle t = new Rtriangle(2,3);
    assertEquals(t.getArea(), 3);
    assertEquals(t.getPerimeter(), 2 + 3 + Math.sqrt(Math.pow(2,2) + Math.pow(3,2)));
    Circle c = new Circle(3);
    assertEquals(c.getArea(), Math.PI * Math.pow(3,2));
    assertEquals(c.getPerimeter(), 2 * Math.PI * 3);
  }
}
