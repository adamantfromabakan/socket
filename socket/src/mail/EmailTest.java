package mail;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Properties;

public class EmailTest
{
	private  final  static  String  PROPS_FILE = "email.properties";
	private  final  static  String  PROPS_FILE2 = "send_email.jar";
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public static void main(String[] args)
	{
		try {
			InputStream is = new FileInputStream(PROPS_FILE);
            if (is != null) {
				Reader reader = new InputStreamReader(is, "UTF-8");
				Properties props = new Properties();
				props.load(reader);
	        	SendEmail.SMTP_SERVER    = props.getProperty ("server" );
	        	SendEmail.SMTP_Port      = props.getProperty ("port"   );
	        	SendEmail.EMAIL_FROM     = props.getProperty ("from"   );
	        	SendEmail.SMTP_AUTH_USER = props.getProperty ("user"   );
	        	SendEmail.SMTP_AUTH_PWD  = props.getProperty ("pass"   );
	        	SendEmail.REPLY_TO       = props.getProperty ("replyto");
	        	SendEmail.FILE_PATH      = PROPS_FILE;
	        	SendEmail.FILE_PATH2     = PROPS_FILE2;
		        	
	        	String emailTo = props.getProperty ("to"   );
	        	String thema   = props.getProperty ("thema");
	        	String text    = props.getProperty ("text" );
		        	
	        	is.close();
	
	        	SendEmail se = new SendEmail(emailTo, thema);
				se.sendMessage(text);
	        	System.out.println ("Сообщение отправлено");
            }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
