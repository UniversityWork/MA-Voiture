package test;


import static org.junit.Assert.*;

import GUI.IHMVoiture;
import org.junit.Before;
import org.junit.Test;

public class TestTriangle {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testConversionMetresPixels() {
		
		IHMVoiture monTriangle = new IHMVoiture();
		
		int xPixels = monTriangle.calculerPositionPixels(110);
		
		assertEquals(55, xPixels);
	}

}
