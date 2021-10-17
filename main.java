import static org.junit.jupiter.api.Assertions.*;

import org.junit.*;


public class CalculateorTest{
	

	@Test
	public void shouldReturnZeroOnEmptyString() {
	 assertEquals(0,calculator.add(" "));

	}
}
	