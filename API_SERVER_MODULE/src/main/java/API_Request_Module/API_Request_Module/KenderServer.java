
package API_Request_Module.API_Request_Module;

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
import java.io.Reader;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.IOUtils;
import org.java_websocket.WebSocket;
import org.java_websocket.WebSocketImpl;
import org.java_websocket.framing.Framedata;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;
import org.json.JSONObject;
import org.json.XML;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class KenderServer extends WebSocketServer {

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
		
		String fileName = getClass().getResource("jsonModel.json").getPath();
		 
		
		FileReader reader = null;
		try {
			reader = new FileReader(fileName);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    JSONParser jsonParser = new JSONParser();
	  //Read JSON file
        Object obj = null;
		try {
			obj = jsonParser.parse(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		String messageData = obj.toString();
		
	
		/*Reader fileReader = null;
		try {
			fileReader = new FileReader(fileName);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        BufferedReader bufReader = new BufferedReader(fileReader);     
        StringBuilder sb = new StringBuilder();
       
        String JsonString ="";
		try {
			 String line = bufReader.readLine();
			 while( line != null){
		        sb.append(line).append("\n");		           
		        line = bufReader.readLine();		        
		     }
	       
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		//JsonString = sb.toString();
		//System.out.println(sb.toString());
		broadcast(messageData);
		System.out.println(conn + ": " + message);
		
		 
	}

	@Override
	public void onMessage(WebSocket conn, ByteBuffer message) {
		broadcast(message.array());
		System.out.println(conn + ": " + message);
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		int port =  8887; // 843 flash policy port
		try {
			port = Integer.parseInt(args[0]);
		} catch (Exception ex) {
		}
		KenderServer s = new KenderServer(new InetSocketAddress("localhost", port));
		s.start();
		System.out.println("Kender started on port: " + s.getPort());

		BufferedReader sysin = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String in = sysin.readLine();
			
			s.broadcast(in);
			if (in.equals("exit")) {
				s.stop(10000);
				break;
			}
		}
	}
	
	public static boolean WriteStringDslIntoFile(String data) {
		
		/**
	     * Use Streams when you are dealing with raw data
	     * @param data
	     */
		int noOfLines = 1;
		File file = new File("C:\\Users\\AdminEtu\\Desktop\\Codekinderproject\\CodeKinderProject\\API_SERVER_MODULE\\requete.query");
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
