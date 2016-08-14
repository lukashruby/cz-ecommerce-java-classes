
package cz.lukashruby.api.xml.bitherm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}PARAM_NAME"/>
 *         &lt;element ref="{}VAL"/>
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
    "paramname",
    "val"
})
@XmlRootElement(name = "PARAM")
public class PARAM {

    @XmlElement(name = "PARAM_NAME", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String paramname;
    @XmlElement(name = "VAL", required = true)
    protected String val;

    /**
     * Gets the value of the paramname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARAMNAME() {
        return paramname;
    }

    /**
     * Sets the value of the paramname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARAMNAME(String value) {
        this.paramname = value;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAL() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAL(String value) {
        this.val = value;
    }

}
