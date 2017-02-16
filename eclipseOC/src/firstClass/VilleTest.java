package firstClass;

import static org.junit.Assert.*;
 
import org.junit.Test;

import junit.framework.Assert;
 
public class VilleTest {
    static int nbHab = 1234567 ;

	@Test
	public void test() {
		Ville ville1 = new Ville("Paris", 1234567, "France");
		assertEquals(nbHab, ville1.getNbHabitants());
		//fail("Not yet implemented");
	}

}
