package es.upm.miw.svc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C12Test {

    private C12 Obj;

    @Before
    public void before() {
        Obj = new C12();
    }

    @Test
    public void testMA() {
        assertEquals("mA", Obj.mA());
    }

}
