package mail;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Properties;

import javax.mail.internet.MimeBodyPart;

public class sender {
	private  final  static  String  PROPS_FILE = "email.properties";

	public static void main(String[] args)
	{
        String errtxt = "usage jar file: [to] [subj] [body] [file1] [file2]";
        if(args.length != 5)
        {
            System.out.println(errtxt);
            return;
        }
        if(args[0] == "?")
        {
            System.out.println(errtxt);
            return;
        }
        
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
	        	SendEmail.BCC       	 = props.getProperty ("bcc");

	        	String emailTo = args[0];
	        	String thema   = args[1];
	        	String text    = args[2];

	        	System.out.println("SMTP_SERVER: "+SendEmail.SMTP_SERVER+":"+SendEmail.SMTP_Port);
	        	System.out.println("EMAIL_FROM: "+SendEmail.EMAIL_FROM);
	        	System.out.println("REPLY_TO: "+SendEmail.REPLY_TO);
	        	System.out.println("BCC_TO: "+SendEmail.BCC);
	        	
	        	System.out.println("EMAIL_TO: "+args[0]);
	        	System.out.println("SUBJ: "+args[1]);
	        	System.out.println("BODY: "+args[2]);
	        	
	        	System.out.println("FILE1: "+args[3]);
	        	 if (args[3].equals("-")) {
		        	SendEmail.FILE_PATH = null;
		        } else {
		        	SendEmail.FILE_PATH = args[3];	
		        }
	        	
	        	 System.out.println("FILE2: "+args[4]);
	        	 if (args[4].equals("-")) {
		        	SendEmail.FILE_PATH2 = null;
		        } else {
		        	SendEmail.FILE_PATH2 = args[4];	
		        }

	        	is.close();

	        	
	        	SendEmail se = new SendEmail(emailTo, thema);
				se.sendMessage(text);
	        	System.out.println ("Сообщение отправлено");
            }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}