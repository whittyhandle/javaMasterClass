package Playing_Cat;

import org.junit.jupiter.api.Assertions;
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
    public void testIsCatPlayingFalse() {
        boolean b = m.isCatPlaying(false,4);
        Assertions.assertFalse(b);
    }

    @Test
    public void testIsCatPlayingTrue() {
        boolean b = m.isCatPlaying(true,25);
        Assertions.assertTrue(b);
    }
}