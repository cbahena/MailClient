
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ValidEmailsResponse_QNAME = new QName("http://WebService/", "validEmailsResponse");
    private final static QName _EnviarCorreoSMTPResponse_QNAME = new QName("http://WebService/", "EnviarCorreoSMTPResponse");
    private final static QName _ValidEmailResponse_QNAME = new QName("http://WebService/", "validEmailResponse");
    private final static QName _ValidEmail_QNAME = new QName("http://WebService/", "validEmail");
    private final static QName _EnviarCorreoSMTP_QNAME = new QName("http://WebService/", "EnviarCorreoSMTP");
    private final static QName _ValidEmails_QNAME = new QName("http://WebService/", "validEmails");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidEmailsResponse }
     * 
     */
    public ValidEmailsResponse createValidEmailsResponse() {
        return new ValidEmailsResponse();
    }

    /**
     * Create an instance of {@link EnviarCorreoSMTPResponse }
     * 
     */
    public EnviarCorreoSMTPResponse createEnviarCorreoSMTPResponse() {
        return new EnviarCorreoSMTPResponse();
    }

    /**
     * Create an instance of {@link ValidEmailResponse }
     * 
     */
    public ValidEmailResponse createValidEmailResponse() {
        return new ValidEmailResponse();
    }

    /**
     * Create an instance of {@link ValidEmails }
     * 
     */
    public ValidEmails createValidEmails() {
        return new ValidEmails();
    }

    /**
     * Create an instance of {@link EnviarCorreoSMTP }
     * 
     */
    public EnviarCorreoSMTP createEnviarCorreoSMTP() {
        return new EnviarCorreoSMTP();
    }

    /**
     * Create an instance of {@link ValidEmail }
     * 
     */
    public ValidEmail createValidEmail() {
        return new ValidEmail();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidEmailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "validEmailsResponse")
    public JAXBElement<ValidEmailsResponse> createValidEmailsResponse(ValidEmailsResponse value) {
        return new JAXBElement<ValidEmailsResponse>(_ValidEmailsResponse_QNAME, ValidEmailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarCorreoSMTPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "EnviarCorreoSMTPResponse")
    public JAXBElement<EnviarCorreoSMTPResponse> createEnviarCorreoSMTPResponse(EnviarCorreoSMTPResponse value) {
        return new JAXBElement<EnviarCorreoSMTPResponse>(_EnviarCorreoSMTPResponse_QNAME, EnviarCorreoSMTPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "validEmailResponse")
    public JAXBElement<ValidEmailResponse> createValidEmailResponse(ValidEmailResponse value) {
        return new JAXBElement<ValidEmailResponse>(_ValidEmailResponse_QNAME, ValidEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "validEmail")
    public JAXBElement<ValidEmail> createValidEmail(ValidEmail value) {
        return new JAXBElement<ValidEmail>(_ValidEmail_QNAME, ValidEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarCorreoSMTP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "EnviarCorreoSMTP")
    public JAXBElement<EnviarCorreoSMTP> createEnviarCorreoSMTP(EnviarCorreoSMTP value) {
        return new JAXBElement<EnviarCorreoSMTP>(_EnviarCorreoSMTP_QNAME, EnviarCorreoSMTP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidEmails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "validEmails")
    public JAXBElement<ValidEmails> createValidEmails(ValidEmails value) {
        return new JAXBElement<ValidEmails>(_ValidEmails_QNAME, ValidEmails.class, null, value);
    }

}
