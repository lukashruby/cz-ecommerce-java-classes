
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
 *         &lt;element ref="{}LONG"/>
 *         &lt;element ref="{}SHORT"/>
 *         &lt;element ref="{}NAME"/>
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
    "_long",
    "_short",
    "name"
})
@XmlRootElement(name = "DESCRIPTIONS")
public class DESCRIPTIONS {

    @XmlElement(name = "LONG", required = true)
    protected LONG _long;
    @XmlElement(name = "SHORT", required = true)
    protected SHORT _short;
    @XmlElement(name = "NAME", required = true)
    protected NAME name;

    /**
     * Gets the value of the long property.
     * 
     * @return
     *     possible object is
     *     {@link LONG }
     *     
     */
    public LONG getLONG() {
        return _long;
    }

    /**
     * Sets the value of the long property.
     * 
     * @param value
     *     allowed object is
     *     {@link LONG }
     *     
     */
    public void setLONG(LONG value) {
        this._long = value;
    }

    /**
     * Gets the value of the short property.
     * 
     * @return
     *     possible object is
     *     {@link SHORT }
     *     
     */
    public SHORT getSHORT() {
        return _short;
    }

    /**
     * Sets the value of the short property.
     * 
     * @param value
     *     allowed object is
     *     {@link SHORT }
     *     
     */
    public void setSHORT(SHORT value) {
        this._short = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link NAME }
     *     
     */
    public NAME getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NAME }
     *     
     */
    public void setNAME(NAME value) {
        this.name = value;
    }

}
