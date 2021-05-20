import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main m;
    @BeforeEach
    public void init() {
        m = new Main();
    }


    @Test
    public void testGetDurationString() {
        String test1 = m.getDurationString(0, 66);
        assertEquals("invalid value", test1);
    }

    @Test
    public void testGetDurationString2() {
        String test1 = m.getDurationString();
        assertEquals("invalid value", test1);

    }
}

