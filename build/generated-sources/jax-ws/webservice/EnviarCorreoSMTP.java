
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EnviarCorreoSMTP complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EnviarCorreoSMTP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Remitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Para" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Copia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Asunto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Servidor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Puerto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnviarCorreoSMTP", propOrder = {
    "remitente",
    "clave",
    "para",
    "copia",
    "asunto",
    "mensaje",
    "servidor",
    "puerto"
})
public class EnviarCorreoSMTP {

    @XmlElement(name = "Remitente")
    protected String remitente;
    @XmlElement(name = "Clave")
    protected String clave;
    @XmlElement(name = "Para")
    protected String para;
    @XmlElement(name = "Copia")
    protected String copia;
    @XmlElement(name = "Asunto")
    protected String asunto;
    @XmlElement(name = "Mensaje")
    protected String mensaje;
    @XmlElement(name = "Servidor")
    protected String servidor;
    @XmlElement(name = "Puerto")
    protected int puerto;

    /**
     * Obtiene el valor de la propiedad remitente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemitente() {
        return remitente;
    }

    /**
     * Define el valor de la propiedad remitente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemitente(String value) {
        this.remitente = value;
    }

    /**
     * Obtiene el valor de la propiedad clave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClave() {
        return clave;
    }

    /**
     * Define el valor de la propiedad clave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClave(String value) {
        this.clave = value;
    }

    /**
     * Obtiene el valor de la propiedad para.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPara() {
        return para;
    }

    /**
     * Define el valor de la propiedad para.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPara(String value) {
        this.para = value;
    }

    /**
     * Obtiene el valor de la propiedad copia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopia() {
        return copia;
    }

    /**
     * Define el valor de la propiedad copia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopia(String value) {
        this.copia = value;
    }

    /**
     * Obtiene el valor de la propiedad asunto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsunto() {
        return asunto;
    }

    /**
     * Define el valor de la propiedad asunto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsunto(String value) {
        this.asunto = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad servidor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServidor() {
        return servidor;
    }

    /**
     * Define el valor de la propiedad servidor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServidor(String value) {
        this.servidor = value;
    }

    /**
     * Obtiene el valor de la propiedad puerto.
     * 
     */
    public int getPuerto() {
        return puerto;
    }

    /**
     * Define el valor de la propiedad puerto.
     * 
     */
    public void setPuerto(int value) {
        this.puerto = value;
    }

}
