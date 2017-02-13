package firstClass;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class VilleTest extends Main {

	@Test
	public void test() {
		Ville ville1 = new Ville("Paris", 1234567, "France");
		assertEquals(1234567 , ville1.getNbHabitants());
		//fail("Not yet implemented");
	}

}
