package plugins.email;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMailTLS {

	// Before executing this program .. configure few settings in your gmail account
	// https://support.google.com/mail/answer/7104828?hl=en&visit_id=1-636556852183066166-2982550563&rd=3

	public static void main(String[] args) {

		final String username = "youremail@gmail.com";
		final String password = "password";

		final Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		final Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			final Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("youremail@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("youremail@gmail.com"));
			message.setSubject("Testing Subject");
			message.setText("Dear Mail Crawler," + "\n\n No spam to my email, please!");

			Transport.send(message);

			System.out.println("Done");

		} catch (final MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}
