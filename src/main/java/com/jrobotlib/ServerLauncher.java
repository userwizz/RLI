package com.jrobotlib;
import org.robotframework.remoteserver.RemoteServer;
import com.jrobotlib.keywords.FancyLibrary;


public class ServerLauncher
{
	public static void main(String[] args) throws Exception {
        RemoteServer.configureLogging();
        RemoteServer server = new RemoteServer();
        server.putLibrary("/mylib", new FancyLibrary());
        server.setPort(8270);
        server.start();
    }
}
