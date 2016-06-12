
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
 *         &lt;element ref="{}LONGLANG" maxOccurs="unbounded"/>
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
    "longlang"
})
@XmlRootElement(name = "LONG")
public class LONG {

    @XmlElement(name = "LONGLANG", required = true)
    protected List<LONGLANG> longlang;

    /**
     * Gets the value of the longlang property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the longlang property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLONGLANG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LONGLANG }
     * 
     * 
     */
    public List<LONGLANG> getLONGLANG() {
        if (longlang == null) {
            longlang = new ArrayList<LONGLANG>();
        }
        return this.longlang;
    }

}
