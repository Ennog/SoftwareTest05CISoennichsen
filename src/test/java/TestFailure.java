
import org.junit.Test;

import junit.framework.TestCase;


public class TestFailure extends TestCase {
	@Test
	public void testFailure() throws Exception {
		Main main = new Main();
		assertEquals(8, main.virtualShowRoom(22000));
	}
}
