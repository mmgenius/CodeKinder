
package API_Request_Module.API_Request_Module;
import APIExchange.LoadTest;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;


import org.apache.commons.io.IOUtils;
import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class KenderServer extends WebSocketServer {
	
	public static String filename ;  
	public KenderServer(int port) throws UnknownHostException {
		super(new InetSocketAddress(port));
	}

	public KenderServer(InetSocketAddress address) {
		super(address);
	}

	@Override
	public void onOpen(WebSocket conn, ClientHandshake handshake) {
		conn.send("Welcome to the server!"); // This method sends a message to the new client
		broadcast("new connection: " + handshake.getResourceDescriptor()); // This method sends a message to all clients
																			// connected
		System.out.println(conn.getRemoteSocketAddress().getAddress().getHostAddress() + " entered the room!");
	}

	@Override
	public void onClose(WebSocket conn, int code, String reason, boolean remote) {
		broadcast(conn + " has left the room!");
		System.out.println(conn + " has left the room!");
		
	}

	@Override
	public void onMessage(WebSocket conn, String message) {
	
		String result = ""; 
		System.out.println(conn + ": " + message);
		if(WriteStringDslIntoFile(message)) {
			try {
				result = LoadTest.dslBootstrap();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(result != "") {
			broadcast(result);
			
		}				 
	}

	@Override
	public void onMessage(WebSocket conn, ByteBuffer message) {
		broadcast(message.array());
		System.out.println(conn + ": " + message);
		
	}
	
	
	public static boolean WriteStringDslIntoFile(String data) {
		
		/**
	     * Use Streams when you are dealing with raw data
	     * @param data
	     */
		String projectDir = System.getProperty("user.dir");		
		String fileName = projectDir + "\\..\\API_MODEL_DSL\\query\\requete.query";
		
		
		int noOfLines = 1;
		File file = new File(fileName);
        FileWriter fr = null;
        BufferedWriter br = null;
        String dataWithNewLine=data+System.getProperty("line.separator");
        try{
            fr = new FileWriter(file);
            br = new BufferedWriter(fr);
            for(int i = noOfLines; i>0; i--){
                br.write(dataWithNewLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        return file.exists(); 
	}

	@Override
	public void onError(WebSocket conn, Exception ex) {
		ex.printStackTrace();
		if (conn != null) {
			// some errors like port binding failed may not be assignable to a specific
			// websocket
		}
	}

	@Override
	public void onStart() {
		 
		System.out.println("Server started!");
		setConnectionLostTimeout(0);
		setConnectionLostTimeout(100);
	}
	
	public String readJsonFile(String path) throws IOException {
		
		File jsonFile = new File(path);
		String data = ""; 
        if (jsonFile.exists()){
        	
            InputStream is = new FileInputStream(jsonFile.getAbsolutePath());
            data = IOUtils.toString(is, "UTF-8");
            
            //JSONObject json = new JSONObject(jsonTxt);       
            //data = json.getString("1000");
               
        }
        return data; 
	}

}
