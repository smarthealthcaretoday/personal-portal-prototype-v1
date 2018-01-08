package today.smarthealthcare.ppv1.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Simple email sending service
 *
 * @author: Vadim Nesmashnov
 */
@Service
public class EmailService {
    private final static Logger LOGGER = LoggerFactory.getLogger(EmailService.class);

    @Autowired
    private JavaMailSender mailSender;

    @Value("${email.from}")
    private String from;

    @Value("${email.resetPassword.subject}")
    private String resetPasswordSubject;
    @Value("${email.resetPassword.body}")
    private String resetPasswordBody;

    @Value("${email.customer.support.email}")
    private String customerSupportEmail;
    @Value("${email.customer.support.cc}")
    private String[] customerSupportCcs;
    @Value("${email.customer.support.subject}")
    private String customerSupportEmailSubject;

    public boolean sendResetPasswordEmail(final String to, String newPassword) {
        final StringBuilder sb = new StringBuilder(resetPasswordBody);
        sb.append(newPassword);

        MimeMessagePreparator preparator = new MimeMessagePreparator() {
            public void prepare(MimeMessage mimeMessage) throws Exception {

                mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
                mimeMessage.setFrom(new InternetAddress(from, "ElaGem"));
                mimeMessage.setSubject(resetPasswordSubject);
                mimeMessage.setText(sb.toString());
            }
        };

        try {
            this.mailSender.send(preparator);
        } catch (MailException ex) {
            LOGGER.error("Can't send email.", ex);

            return false;
        }

        return true;
    }

    public boolean sendCustomerSupportRequest(String name, String subject, String message) {
        final StringBuilder sb = new StringBuilder();
        sb.append("User ").append(name).append(" has submitted following request: \n\n")
                .append("Subject: ").append(subject).append(" \n\n").append("Message: \n").append(message);

        try {
            final InternetAddress[] ccAddresses = new InternetAddress[customerSupportCcs.length];

            for (int i = 0; i < customerSupportCcs.length; i++) {
                ccAddresses[i] = new InternetAddress(customerSupportCcs[i]);
            }

            MimeMessagePreparator preparator = new MimeMessagePreparator() {

                public void prepare(MimeMessage mimeMessage) throws Exception {

                    mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(customerSupportEmail));
                    mimeMessage.addRecipients(Message.RecipientType.CC, ccAddresses);
                    mimeMessage.setFrom(new InternetAddress(from, "ElaGem customer support service"));
                    mimeMessage.setSubject(customerSupportEmailSubject);
                    mimeMessage.setText(sb.toString());
                }
            };

            this.mailSender.send(preparator);
        } catch (Exception ex) {
            LOGGER.error("Can't send email.", ex);

            return false;
        }

        return true;
    }

}
