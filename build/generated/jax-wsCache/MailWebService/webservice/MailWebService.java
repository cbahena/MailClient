
package webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MailWebService", targetNamespace = "http://WebService/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MailWebService {


    /**
     * 
     * @param copia
     * @param servidor
     * @param asunto
     * @param puerto
     * @param mensaje
     * @param clave
     * @param remitente
     * @param para
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "EnviarCorreoSMTP")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "EnviarCorreoSMTP", targetNamespace = "http://WebService/", className = "webservice.EnviarCorreoSMTP")
    @ResponseWrapper(localName = "EnviarCorreoSMTPResponse", targetNamespace = "http://WebService/", className = "webservice.EnviarCorreoSMTPResponse")
    @Action(input = "http://WebService/MailWebService/EnviarCorreoSMTPRequest", output = "http://WebService/MailWebService/EnviarCorreoSMTPResponse")
    public boolean enviarCorreoSMTP(
        @WebParam(name = "Remitente", targetNamespace = "")
        String remitente,
        @WebParam(name = "Clave", targetNamespace = "")
        String clave,
        @WebParam(name = "Para", targetNamespace = "")
        String para,
        @WebParam(name = "Copia", targetNamespace = "")
        String copia,
        @WebParam(name = "Asunto", targetNamespace = "")
        String asunto,
        @WebParam(name = "Mensaje", targetNamespace = "")
        String mensaje,
        @WebParam(name = "Servidor", targetNamespace = "")
        String servidor,
        @WebParam(name = "Puerto", targetNamespace = "")
        int puerto);

    /**
     * 
     * @param email
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validEmail", targetNamespace = "http://WebService/", className = "webservice.ValidEmail")
    @ResponseWrapper(localName = "validEmailResponse", targetNamespace = "http://WebService/", className = "webservice.ValidEmailResponse")
    @Action(input = "http://WebService/MailWebService/validEmailRequest", output = "http://WebService/MailWebService/validEmailResponse")
    public boolean validEmail(
        @WebParam(name = "email", targetNamespace = "")
        String email);

    /**
     * 
     * @param emails
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validEmails", targetNamespace = "http://WebService/", className = "webservice.ValidEmails")
    @ResponseWrapper(localName = "validEmailsResponse", targetNamespace = "http://WebService/", className = "webservice.ValidEmailsResponse")
    @Action(input = "http://WebService/MailWebService/validEmailsRequest", output = "http://WebService/MailWebService/validEmailsResponse")
    public boolean validEmails(
        @WebParam(name = "emails", targetNamespace = "")
        String emails);

}
