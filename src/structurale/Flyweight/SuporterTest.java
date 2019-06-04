package structurale.Flyweight;

import org.junit.Test;

import static org.junit.Assert.*;

public class SuporterTest {

    @Test
    public void testSetLungime(){
        Suporter suporter=new Suporter(100,100);
        suporter.setLungime(20);
        assertEquals(20,suporter.getLungime());
    }

}