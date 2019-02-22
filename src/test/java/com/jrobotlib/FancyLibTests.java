package com.jrobotlib;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;
import com.jrobotlib.keywords.FancyLibrary;

public class FancyLibTests {

	FancyLibrary tester;
	
	public FancyLibTests (){
		tester = new FancyLibrary();
	}
	
	@Test
	public void testGenerateWesternName() {
		
		String firsNname = "Jaska";
		String lastName = "Jokunen";
		String pattern = firsNname + " '[a-zA-Z ].+' " + lastName;
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(tester.generateWesternName(firsNname, lastName));
		assertTrue(m.find(), "western name must mach given pattern");
				
	}

	@Test
	public void testMakeItDouble() {
        
        assertEquals(20, tester.makeItDouble(10), "2 x 10 must be 20");
        assertEquals(0, tester.makeItDouble(0), "2 x 0 must be 0");
        assertEquals(-20, tester.makeItDouble(-10), "2 x -10 must be -20");

	}
}
