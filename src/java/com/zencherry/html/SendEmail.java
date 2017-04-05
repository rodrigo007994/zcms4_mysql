package com.zencherry.html;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Authenticator;


public class SendEmail {

	public static void Send(String content,String configemail,String configemailpass,String configsmtp,String configstarttls,String confighost,String configport) {

		final String username = configemail;
		final String password = configemailpass;

		Properties props = new Properties();
		props.put("mail.smtp.auth", configsmtp);
		props.put("mail.smtp.starttls.enable", configstarttls);
		props.put("mail.smtp.host", confighost);
		props.put("mail.smtp.port", configport);

		Session session = Session.getInstance(props,
		  new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(configemail));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(configemail));
			message.setSubject("ZCMS Contact");
			message.setText(content);

			Transport.send(message);

			System.out.println("Done");
			System.out.println(content);

		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Error en: "+content);
		}
	}
}
