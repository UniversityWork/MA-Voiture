package test;

import GUI.IHMRoute;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 * Created by droit on 09/04/15.
 * Test de l'IHM de route
 */
public class TestIHMRoute {

    public IHMRoute ihmRoute;

    @Before
    public void setUp() {
        ihmRoute = new IHMRoute();
    }

    @Test
    public void testExistingRoute () {
        assertFalse(ihmRoute==null);
    }
}
