package es.upm.miw.svc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C22Test {

    private C22 Obj;

    @Before
    public void before() {
        Obj = new C22();
    }

    @Test
    public void testMA() {
        assertEquals("mA", Obj.mA());
    }

}
