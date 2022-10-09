package Utilities;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

public class TestReportSender {

    static void sendPDFReportByGMail(String from, String pass, String to, String subject, String body) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy MM dd HH:mm");
        LocalDateTime now = LocalDateTime.now();
        //System.out.println(dtf.format(now));

        Properties props = System.getProperties();

        String host = "smtp.gmail.com";

        props.put("mail.smtp.starttls.enable", "true");

        props.put("mail.smtp.host", host);

        props.put("mail.smtp.user", from);

        props.put("mail.smtp.password", pass);

        props.put("mail.smtp.port", "587");

        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);

        MimeMessage message = new MimeMessage(session);

        try {

            //Set from address

            message.setFrom(new InternetAddress(from));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

//Set subject

            message.setSubject(subject);

            message.setText(body);

            BodyPart objMessageBodyPart = new MimeBodyPart();
            BodyPart objMessageBodyPart2 = new MimeBodyPart();
            BodyPart objMessageBodyPart3 = new MimeBodyPart();
            BodyPart objMessageBodyPart4 = new MimeBodyPart();

            objMessageBodyPart.setText(dtf.format(now) + " : Test Result Report Attached");
            objMessageBodyPart2.setText(dtf.format(now) + " : Test Result Screen Capture Attached");
            objMessageBodyPart3.setText(dtf.format(now) + " : Console Output Attached");
            objMessageBodyPart4.setText(dtf.format(now) + " : Surefire report Attached");

            Multipart multipart = new MimeMultipart();
            Multipart multipart2 = new MimeMultipart();
            Multipart multipart3 = new MimeMultipart();
            Multipart multipart4 = new MimeMultipart();

            multipart.addBodyPart(objMessageBodyPart);
            multipart2.addBodyPart(objMessageBodyPart2);
            multipart3.addBodyPart(objMessageBodyPart3);
            multipart4.addBodyPart(objMessageBodyPart4);

            objMessageBodyPart = new MimeBodyPart();
            objMessageBodyPart2 = new MimeBodyPart();
            objMessageBodyPart3 = new MimeBodyPart();
            objMessageBodyPart4 = new MimeBodyPart();

//Set path to the report file

            String filename = System.getProperty("user.dir") +"/Extent_Reports/Test_Result.html";
            String filename2 = System.getProperty("user.dir") +"/Screen_Capture_Result.zip";
            String filename3 = System.getProperty("user.dir") +"/Console_Output.txt";
            String filename4 = System.getProperty("user.dir") +"/Surefire_Reports.zip";



//Create data source to attach the file in mail

            DataSource source = new FileDataSource(filename);
            objMessageBodyPart.setDataHandler(new DataHandler(source));
            objMessageBodyPart.setFileName(filename);
            multipart.addBodyPart(objMessageBodyPart);

            DataSource source2 = new FileDataSource(filename2);
            objMessageBodyPart2.setDataHandler(new DataHandler(source2));
            objMessageBodyPart2.setFileName(filename2);
            multipart.addBodyPart(objMessageBodyPart2);

            DataSource source3 = new FileDataSource(filename3);
            objMessageBodyPart3.setDataHandler(new DataHandler(source3));
            objMessageBodyPart3.setFileName(filename3);
            multipart.addBodyPart(objMessageBodyPart3);

            /*DataSource source4 = new FileDataSource(filename3);
            objMessageBodyPart4.setDataHandler(new DataHandler(source4));
            objMessageBodyPart4.setFileName(filename4);
            multipart.addBodyPart(objMessageBodyPart4);*/



            message.setContent(multipart);

            Transport transport = session.getTransport("smtp");

            transport.connect(host, from, pass);

            transport.sendMessage(message, message.getAllRecipients());

            transport.close();

        }

        catch (AddressException ae) {

            ae.printStackTrace();

        }

        catch (MessagingException me) {

            me.printStackTrace();

        }

    }

}

