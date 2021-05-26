package CodingChallenge60;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main m;

    @BeforeEach
    public void init(){
        m = new Main();
    }

    @Test
    public void testGetDurationString() {
        assertEquals("0h 10m 4s", m.getDurationString(10, 4));
    }

    @Test
    public void testGetDurationString2() {
        assertEquals("10h 50m 30s", m.getDurationString(650, 30));
    }

    @Test
    public void testGetDurationString3() {
        assertEquals("1h 0m 4s", m.getDurationString(60, 4));
    }

    @Test
    public void testGetDurationString4() {
        assertEquals("Invalid number", m.getDurationString(-10, 4));
    }

    @Test
    public void testGetDurationString5() {
        assertEquals("Invalid number", m.getDurationString(10, -4));
    }

    @Test
    public void testGetDurationString6() {
        assertEquals("Invalid number", m.getDurationString(10, 60));
    }

    @Test
    public void testGetDurationString7(){
        assertEquals("Invalid number", m.getDurationString(-12));
    }

    @Test
    public void testGetDurationString8(){
        assertEquals("00h 01m 05s", m.getDurationString(65));
    }
}

