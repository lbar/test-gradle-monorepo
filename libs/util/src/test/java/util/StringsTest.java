package util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StringsTest {

	@Test
	public void testFormatName() {
		assertEquals("DOE John", Strings.toString("DOE", "John"));
	}
}
