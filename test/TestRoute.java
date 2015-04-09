package test;

import metier.Route;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by droit on 09/04/15.
 * Test Route
 */
public class TestRoute {

    private Route route;

    @Before
    public void setUp(){
        route = new Route (100, 0, 45);
    }

    @Test
    public void testPositionLimiteBasse() {
        assertFalse(route==null);
    }

    @Test
    public void testDirrectionEnDegres() {
        route.getDirectionEnDegres();
        assertEquals(route.getDirectionEnDegres(), 45);
    }

}
