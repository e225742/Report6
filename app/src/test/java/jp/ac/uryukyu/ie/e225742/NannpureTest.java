package jp.ac.uryukyu.ie.e225742;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NannpureTest {
    
    @Test
    public void LevelTest() throws Exception{
        Nannpure nan = new Nannpure();
        int expected = 45;
        int actual = nan.Level("Hard");
        assertEquals(expected, actual);;
    }
}
