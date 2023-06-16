package net.codejava;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testAppConstructor() {
        App app1 = new App();
        App app2 = new App();
        assertEquals(app1.getMessage(), app2.getMessage());
        System.out.println("Passed 1");
    }

    @Test
    public void testAppMessage() {
        App app = new App();
        assertEquals("Hello World!", app.getMessage());
    }
}
