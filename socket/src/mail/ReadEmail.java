package mail;


import java.io.IOException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;

import javax.mail.Session;
import javax.mail.Store;

public class ReadEmail
{
	String   IMAP_AUTH_EMAIL = "...@yandex.ru";
	String   IMAP_AUTH_PWD   = "..."       ;
	String   IMAP_Server     = "imap.yandex.ru"    ;
	String   IMAP_Port       = "993"               ;
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public ReadEmail()
	{
		Properties properties = new Properties();
		properties.put("mail.debug"           , "false"  );
		properties.put("mail.store.protocol"  , "imaps"  );
		properties.put("mail.imap.ssl.enable" , "true"   );
		properties.put("mail.imap.port"       , IMAP_Port);
        
		Authenticator auth = new EmailAuthenticator(IMAP_AUTH_EMAIL, IMAP_AUTH_PWD);
		Session session = Session.getDefaultInstance(properties, auth);
		session.setDebug(false);
			
		try {
	        Store store = session.getStore();
	
	        // ����������� � ��������� �������
	        store.connect(IMAP_Server, IMAP_AUTH_EMAIL, IMAP_AUTH_PWD);
	
	        // ����� �������� ���������
	        Folder inbox = store.getFolder("INBOX");
	
	        // ��������� ����� � ������ ������ ��� ������
	        inbox.open(Folder.READ_ONLY);
	
	        System.out.println("���������� ��������� : " + String.valueOf(inbox.getMessageCount()));
	        if (inbox.getMessageCount() == 0)
	        	return;
	        // ��������� ���������; ������ ��������� ��� ������� 1
	        Message message = inbox.getMessage(inbox.getMessageCount());
	        Multipart mp = (Multipart) message.getContent();
	        // ����� ����������� � �������
	        for (int i = 0; i < mp.getCount(); i++){
		        BodyPart  bp = mp.getBodyPart(i);
		        if (bp.getFileName() == null)
	        		System.out.println("    " + i + ". ��������� : '" + bp.getContent() + "'");
	        	else
	        		System.out.println("    " + i + ". ���� : '" + bp.getFileName() + "'");
	        }
		} catch (NoSuchProviderException e) {
			System.err.println(e.getMessage());
		} catch (MessagingException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public static void main(String[] args)
	{
		new ReadEmail();
		System.exit(0);
	}
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
