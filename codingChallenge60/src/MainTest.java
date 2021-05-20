import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testGetDurationString() {
        Main m = new Main();
        String test1 = m.getDurationString(0, 66);
        assertEquals("invalid value", test1);
    }

}