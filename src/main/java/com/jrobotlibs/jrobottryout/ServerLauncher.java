package com.jrobotlibs.jrobottryout;

import org.robotframework.remoteserver.RemoteServer;
import org.robotframework.javalib.library.AnnotationLibrary;

import com.jrobotlibs.jrobottryout.keywords.TestLib;



public class ServerLauncher extends AnnotationLibrary
{
    public ServerLauncher() {
    	 // tell AnnotationLibrary where to find the keywords
    	super("com/jrobotlibs/jrobottryout/keywords/*.class");
    }
 
    @Override
    public String getKeywordDocumentation(String keywordName) {
        if (keywordName.equals("__intro__")) {
            return "This is intro";
        }
 
        return super.getKeywordDocumentation(keywordName);
    }
 
	
	public static void main(String[] args) throws Exception {
        RemoteServer.configureLogging();
        RemoteServer server = new RemoteServer();
        server.putLibrary("/", new TestLib());
        //server.putLibrary("/other", new MyOtherLibrary("42"));
        server.setPort(8270);
        server.start();
    }
}
