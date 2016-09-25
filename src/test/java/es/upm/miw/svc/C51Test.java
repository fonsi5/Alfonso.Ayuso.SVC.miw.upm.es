package es.upm.miw.svc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C51Test {

    private C51 Obj;

    @Before
    public void before() {
        Obj = new C51();
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
