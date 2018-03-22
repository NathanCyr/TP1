package Partie_3;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void dateTest() {
		GregorianCalendar gc = new GregorianCalendar();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-HH-mm");
		String dateStringTest = dateFormat.format(gc.getTime());
		dateStringTest.equals(Main.date());
		
	}

	

}
