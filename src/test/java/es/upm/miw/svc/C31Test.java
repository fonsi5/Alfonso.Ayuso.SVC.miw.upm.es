package es.upm.miw.svc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C31Test {

    private C31 Obj;

    @Before
    public void before() {
        Obj = new C31();
    }

    @Test
    public void testM1() {
        assertEquals("m1", Obj.m1());
    }

    @Test
    public void testM2() {
        assertEquals("m2", Obj.m2());
    }

}
