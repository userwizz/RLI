package com.jrobotlib.keywords;

import org.robotframework.javalib.library.AnnotationLibrary;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;


// Class containing keyword-methods has to be tagged with @RobotKeywords annotation. 
@RobotKeywords
public class FancyLibrary extends AnnotationLibrary {

	public FancyLibrary() {
	  	 // Tell AnnotationLibrary where to find the keywords
	  	super("com/jrobotlib/keywords/*.class");
	  }

	
	@Override
	public String getKeywordDocumentation(String keywordName) {
	// Provide library introduction for lib documentation
	if (keywordName.equals("__intro__")) {
		return "This library provides some fancy keywords for demo purposes.";
		}
		return super.getKeywordDocumentation(keywordName);
	}
   
	
	// Annotating methods with @RobotKeyword will make them registered as keywords. 
	// @ArgumentNames annotation will provide argument names for documentation 
	@RobotKeyword("Generate random western name")
	@ArgumentNames({"firstname", "lastname"})
	public String generateWesternName(String firstname, String lastname) {
		List<String> names = Arrays.asList("Cactus","Deadeye","Pale Face", "Arkansas" , "Texas", "The Kid");
		int index = ThreadLocalRandom.current().nextInt(names.size());		
		String westernName = firstname + " '" + names.get(index) + "' " + lastname;
		System.out.println(westernName);
		return westernName;
	}
	
	
	@RobotKeyword("Doubles given 'value'")
	@ArgumentNames({"value"})
	public int makeItDouble(int value) { 
		return value * 2;
	}
	
}
