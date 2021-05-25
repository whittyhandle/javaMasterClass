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
    public void testIsCatPlayingfalse() {
        boolean b = m.isCatPlaying(true,4);
        assertFalse(b);
    }

    @Test
    public void testIsCatPlayingtrue() {
        boolean b = m.isCatPlaying(true,25);
        assertTrue(b);
    }
}