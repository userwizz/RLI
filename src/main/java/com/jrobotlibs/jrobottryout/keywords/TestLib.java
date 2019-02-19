package com.jrobotlibs.jrobottryout.keywords;

import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class TestLib {

    @RobotKeyword("Square Integer")
    @ArgumentNames({"value"})
    public int squareInteger(int value) {
    	return (int)Math.pow(value, 2);
}
	
}
