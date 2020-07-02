package Tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("Demo")
public class DemoTest {

    @Test
    public void firstTest() {
        System.out.println("hey there.this is my first test");
    }

    @Test
    public void secondTest() {
        System.out.println("hey it works.here is my second test");
    }


}
