package es.upm.miw.svc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C52Test {

    private C52 Obj;

    @Before
    public void before() {
        Obj = new C52();
    }

    @Test
    public void testMA() {
        assertEquals("mA", Obj.mA());
    }

}
