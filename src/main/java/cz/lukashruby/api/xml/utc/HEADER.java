
package cz.lukashruby.api.xml.utc;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}CUSTOMER"/>
 *         &lt;element ref="{}SUPPLIER"/>
 *         &lt;element ref="{}GENERATED"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "customer",
    "supplier",
    "generated"
})
@XmlRootElement(name = "HEADER")
public class HEADER {

    @XmlElement(name = "CUSTOMER", required = true)
    protected CUSTOMER customer;
    @XmlElement(name = "SUPPLIER", required = true)
    protected String supplier;
    @XmlElement(name = "GENERATED", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar generated;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CUSTOMER }
     *     
     */
    public CUSTOMER getCUSTOMER() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CUSTOMER }
     *     
     */
    public void setCUSTOMER(CUSTOMER value) {
        this.customer = value;
    }

    /**
     * Gets the value of the supplier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUPPLIER() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUPPLIER(String value) {
        this.supplier = value;
    }

    /**
     * Gets the value of the generated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGENERATED() {
        return generated;
    }

    /**
     * Sets the value of the generated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGENERATED(XMLGregorianCalendar value) {
        this.generated = value;
    }

}
