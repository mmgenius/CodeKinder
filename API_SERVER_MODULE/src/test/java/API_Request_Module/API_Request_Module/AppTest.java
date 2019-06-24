package API_Request_Module.API_Request_Module;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;

import org.java_websocket.WebSocket;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import APIExchange.LoadTest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
	
	 KenderServer server; 
    /**
     * Create the test case
     *
     * @param testName name of the test case
     * @throws URISyntaxException 
     * @throws IOException 
     * @throws InterruptedException 
     */
    public AppTest( String testName ) throws URISyntaxException, IOException, InterruptedException
    {	
        super( testName );
        server = new KenderServer(new InetSocketAddress("localhost", 8887));
              
    }
    
  

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test start new Kinder Server Connection
     */
    public void testServerConnectionWithDslKinder()
    {  
    	String data = "<?xml version=\"1.0\" encoding=\"ASCII\"?>"+
				"<xmi:XMI xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:model=\"http://www.example.org/model\">" +
				 "<model:Query "+
					"xmi:version=\"2.0\" "+
					"xmlns:xmi=\"http://www.omg.org/XMI\" "+
					"xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" "+
					"xmlns:model=\"http://www.example.org/model\" "+
					"xsi:schemaLocation=\"http://www.example.org/model model.ecore\" "+
					"ind=\"SP.POP.TOTL\">" +
				  "<country name=\"de\"/>" +
				  "<country name=\"fr\"/>"+
				  "<country name=\"be\"/>"+
				  "<period begin=\"1990\" end=\"1997\"/>"+
				"</model:Query>"+
				"</xmi:XMI>";
    	assertTrue(server.WriteStringDslIntoFile(data));    	
    }
    /**
     * Rigourous Test close new Kinder Server Connection
     * @throws InterruptedException 
     */
    public void testAppCloseServerKinder() throws InterruptedException {
    	
    	
    }
    
    /**
     * Rigourous Test Connection with DSL API Services with new Kinder Server Connection
     * @throws IOException 
     * @throws URISyntaxException 
     * @throws InterruptedException 
     */
    public void testDslConnection() throws IOException, URISyntaxException {
    	    	
      	
    	//System.out.println(LoadTest.dslBootstrap());
    	
    }
}
