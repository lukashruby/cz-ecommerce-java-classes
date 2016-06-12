
package cz.lukashruby.api.xml.utc;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element ref="{}SHORTLANG" maxOccurs="unbounded"/>
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
    "shortlang"
})
@XmlRootElement(name = "SHORT")
public class SHORT {

    @XmlElement(name = "SHORTLANG", required = true)
    protected List<SHORTLANG> shortlang;

    /**
     * Gets the value of the shortlang property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shortlang property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSHORTLANG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SHORTLANG }
     * 
     * 
     */
    public List<SHORTLANG> getSHORTLANG() {
        if (shortlang == null) {
            shortlang = new ArrayList<SHORTLANG>();
        }
        return this.shortlang;
    }

}
