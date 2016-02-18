package telnet;

import org.apache.commons.net.telnet.TelnetClient;

import java.io.InputStream;
import java.io.PrintStream;

public class AutomatedTelnetClient {
    private TelnetClient telnet = new TelnetClient();
    private InputStream in;
    private PrintStream out;
    private String prompt = "%";

    public AutomatedTelnetClient(String server, String port, String user, String password, String prmt, String cmd) {
    	try {
    		// Connect to the specified server
    		int intPort = Integer.parseInt(port);
    		telnet.connect(server, intPort);

    		// Get input and output stream references
    		in = telnet.getInputStream();
    		out = new PrintStream(telnet.getOutputStream());

    		// Log the user on
    		readUntil("login: ");
    		write(user);
    		readUntil("Password: ");
    		write(password);
    		prompt=prmt;
    		// Advance to a prompt
    		readUntil(prompt + " ");
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }

    public void su(String password) {
    	try {
    		write("su");
    		readUntil("Password: ");
    		write(password);
    		prompt = "#";
    		readUntil(prompt + " ");
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }

    public String readUntil(String pattern) {
    	try {
    		char lastChar = pattern.charAt(pattern.length() - 1);
    		StringBuffer sb = new StringBuffer();
    		boolean found = false;
    		char ch = (char) in.read();
    		while (true) {
    			System.out.print(ch);
    			sb.append(ch);
    			if (ch == lastChar) {
    				if (sb.toString().endsWith(pattern)) {
    					return sb.toString();
    				}
    			}
    			ch = (char) in.read();
    		}
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	return null;
    }

    public void write(String value) {
    	try {
    		out.println(value);
    		out.flush();
    		System.out.println(value);
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }

    public String sendCommand(String command) {
    	try {
    		write(command);
    		return readUntil(prompt + " ");
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	return null;
    }

    public void disconnect() {
    	try {
    		telnet.disconnect();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }

    public static void main(String[] args) {
    	try {
    		
    		if (args.length != 6) {
    			System.out.println("CMD TELNET by ADAMANT: usage jar file: [server] [port] [user] [password] [prompt] [cmd]");
                return;
            }
    		AutomatedTelnetClient telnet = new AutomatedTelnetClient(
    				args[0], args[1], args[2], args[3], args[4], args[5]);
    		telnet.sendCommand(args[5]);
    		telnet.disconnect();
    		return;
    	} catch (Exception e) {
    		e.printStackTrace();
    		return;
    	}
    }
}