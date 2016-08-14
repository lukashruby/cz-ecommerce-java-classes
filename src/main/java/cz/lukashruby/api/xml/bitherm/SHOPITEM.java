
package cz.lukashruby.api.xml.bitherm;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}PRODUCT"/>
 *         &lt;element ref="{}DESCRIPTION"/>
 *         &lt;element ref="{}PRICE_VAT"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}ITEMGROUP_ID"/>
 *           &lt;element ref="{}PARAM"/>
 *         &lt;/sequence>
 *         &lt;element ref="{}IMGURL"/>
 *         &lt;element ref="{}URL"/>
 *         &lt;element ref="{}DELIVERY_DATE"/>
 *         &lt;element ref="{}ITEM_ID"/>
 *         &lt;element ref="{}IMGURL_ALTERNATIVE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}CATEGORYTEXT"/>
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
    "product",
    "description",
    "pricevat",
    "itemgroupid",
    "param",
    "imgurl",
    "url",
    "deliverydate",
    "itemid",
    "imgurlalternative",
    "categorytext"
})
@XmlRootElement(name = "SHOPITEM")
public class SHOPITEM {

    @XmlElement(name = "PRODUCT", required = true)
    protected String product;
    @XmlElement(name = "DESCRIPTION", required = true)
    protected String description;
    @XmlElement(name = "PRICE_VAT", required = true)
    protected BigInteger pricevat;
    @XmlElement(name = "ITEMGROUP_ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String itemgroupid;
    @XmlElement(name = "PARAM")
    protected PARAM param;
    @XmlElement(name = "IMGURL", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String imgurl;
    @XmlElement(name = "URL", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(name = "DELIVERY_DATE", required = true)
    protected BigInteger deliverydate;
    @XmlElement(name = "ITEM_ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String itemid;
    @XmlElement(name = "IMGURL_ALTERNATIVE")
    @XmlSchemaType(name = "anyURI")
    protected List<String> imgurlalternative;
    @XmlElement(name = "CATEGORYTEXT", required = true)
    protected String categorytext;

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODUCT() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODUCT(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the pricevat property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPRICEVAT() {
        return pricevat;
    }

    /**
     * Sets the value of the pricevat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPRICEVAT(BigInteger value) {
        this.pricevat = value;
    }

    /**
     * Gets the value of the itemgroupid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITEMGROUPID() {
        return itemgroupid;
    }

    /**
     * Sets the value of the itemgroupid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITEMGROUPID(String value) {
        this.itemgroupid = value;
    }

    /**
     * Gets the value of the param property.
     * 
     * @return
     *     possible object is
     *     {@link PARAM }
     *     
     */
    public PARAM getPARAM() {
        return param;
    }

    /**
     * Sets the value of the param property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARAM }
     *     
     */
    public void setPARAM(PARAM value) {
        this.param = value;
    }

    /**
     * Gets the value of the imgurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMGURL() {
        return imgurl;
    }

    /**
     * Sets the value of the imgurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMGURL(String value) {
        this.imgurl = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the deliverydate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDELIVERYDATE() {
        return deliverydate;
    }

    /**
     * Sets the value of the deliverydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDELIVERYDATE(BigInteger value) {
        this.deliverydate = value;
    }

    /**
     * Gets the value of the itemid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITEMID() {
        return itemid;
    }

    /**
     * Sets the value of the itemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITEMID(String value) {
        this.itemid = value;
    }

    /**
     * Gets the value of the imgurlalternative property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imgurlalternative property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIMGURLALTERNATIVE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIMGURLALTERNATIVE() {
        if (imgurlalternative == null) {
            imgurlalternative = new ArrayList<String>();
        }
        return this.imgurlalternative;
    }

    /**
     * Gets the value of the categorytext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATEGORYTEXT() {
        return categorytext;
    }

    /**
     * Sets the value of the categorytext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATEGORYTEXT(String value) {
        this.categorytext = value;
    }

}
