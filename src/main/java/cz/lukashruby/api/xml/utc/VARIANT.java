
package cz.lukashruby.api.xml.utc;

import javax.xml.bind.annotation.*;


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
 *         &lt;element ref="{}PROPERTY"/>
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
    "property"
})
@XmlRootElement(name = "VARIANT")
public class VARIANT {

    @XmlElement(name = "PROPERTY", required = true)
    protected PROPERTY property;

    /**
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link PROPERTY }
     *     
     */
    public PROPERTY getPROPERTY() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROPERTY }
     *     
     */
    public void setPROPERTY(PROPERTY value) {
        this.property = value;
    }

}
