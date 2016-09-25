package es.upm.miw.svc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C21Test {

    private C21 Obj;

    @Before
    public void before() {
        Obj = new C21();
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
