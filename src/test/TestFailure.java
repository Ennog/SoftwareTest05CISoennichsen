
import junit.framework.TestCase;


public class TestFailure extends TestCase {
	public void testFailure() throws Exception {
		Main main = new Main();
		assertEquals(7, main.virtualShowRoom(22000));
	}
}
