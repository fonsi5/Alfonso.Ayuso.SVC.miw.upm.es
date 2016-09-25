package es.upm.miw.svc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C32Test {

    private C32 Obj;

    @Before
    public void before() {
        Obj = new C32();
    }

    @Test
    public void testMA() {
        assertEquals("mA", Obj.mA());
    }

}
