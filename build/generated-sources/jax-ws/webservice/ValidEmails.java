
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para validEmails complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="validEmails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validEmails", propOrder = {
    "emails"
})
public class ValidEmails {

    protected String emails;

    /**
     * Obtiene el valor de la propiedad emails.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmails() {
        return emails;
    }

    /**
     * Define el valor de la propiedad emails.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmails(String value) {
        this.emails = value;
    }

}
