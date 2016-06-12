
package cz.lukashruby.api.xml.vsenavareni;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
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
 *         &lt;element ref="{}PRODUCT"/>
 *         &lt;element ref="{}DESCRIPTION"/>
 *         &lt;element ref="{}URL"/>
 *         &lt;element ref="{}IMGURL"/>
 *         &lt;element ref="{}PRICE_VO"/>
 *         &lt;element ref="{}PRICE_VO_VAT"/>
 *         &lt;element ref="{}PRICE"/>
 *         &lt;element ref="{}PRICE_VAT"/>
 *         &lt;element ref="{}MANUFACTURER" minOccurs="0"/>
 *         &lt;element ref="{}CATEGORYTEXT" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}PRODUCTNO"/>
 *         &lt;element ref="{}ITEM_ID"/>
 *         &lt;element ref="{}EAN"/>
 *         &lt;element ref="{}DELIVERY_DATE"/>
 *         &lt;element ref="{}STORE_COUNT"/>
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
    "url",
    "imgurl",
    "pricevo",
    "pricevovat",
    "price",
    "pricevat",
    "manufacturer",
    "categorytext",
    "productno",
    "itemid",
    "ean",
    "deliverydate",
    "storecount"
})
@XmlRootElement(name = "SHOPITEM")
public class SHOPITEM {

    @XmlElement(name = "PRODUCT", required = true)
    protected String product;
    @XmlElement(name = "DESCRIPTION", required = true)
    protected String description;
    @XmlElement(name = "URL", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(name = "IMGURL", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String imgurl;
    @XmlElement(name = "PRICE_VO", required = true)
    protected String pricevo;
    @XmlElement(name = "PRICE_VO_VAT", required = true)
    protected BigInteger pricevovat;
    @XmlElement(name = "PRICE", required = true)
    protected String price;
    @XmlElement(name = "PRICE_VAT", required = true)
    protected BigInteger pricevat;
    @XmlElement(name = "MANUFACTURER")
    protected String manufacturer;
    @XmlElement(name = "CATEGORYTEXT")
    protected List<String> categorytext;
    @XmlElement(name = "PRODUCTNO", required = true)
    protected String productno;
    @XmlElement(name = "ITEM_ID", required = true)
    protected BigInteger itemid;
    @XmlElement(name = "EAN", required = true)
    protected String ean;
    @XmlElement(name = "DELIVERY_DATE", required = true)
    protected String deliverydate;
    @XmlElement(name = "STORE_COUNT", required = true)
    protected BigInteger storecount;

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
     * Gets the value of the pricevo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRICEVO() {
        return pricevo;
    }

    /**
     * Sets the value of the pricevo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRICEVO(String value) {
        this.pricevo = value;
    }

    /**
     * Gets the value of the pricevovat property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPRICEVOVAT() {
        return pricevovat;
    }

    /**
     * Sets the value of the pricevovat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPRICEVOVAT(BigInteger value) {
        this.pricevovat = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRICE() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRICE(String value) {
        this.price = value;
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
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANUFACTURER() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANUFACTURER(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the categorytext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categorytext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCATEGORYTEXT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCATEGORYTEXT() {
        if (categorytext == null) {
            categorytext = new ArrayList<String>();
        }
        return this.categorytext;
    }

    /**
     * Gets the value of the productno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODUCTNO() {
        return productno;
    }

    /**
     * Sets the value of the productno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODUCTNO(String value) {
        this.productno = value;
    }

    /**
     * Gets the value of the itemid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getITEMID() {
        return itemid;
    }

    /**
     * Sets the value of the itemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setITEMID(BigInteger value) {
        this.itemid = value;
    }

    /**
     * Gets the value of the ean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAN() {
        return ean;
    }

    /**
     * Sets the value of the ean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAN(String value) {
        this.ean = value;
    }

    /**
     * Gets the value of the deliverydate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVERYDATE() {
        return deliverydate;
    }

    /**
     * Sets the value of the deliverydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVERYDATE(String value) {
        this.deliverydate = value;
    }

    /**
     * Gets the value of the storecount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSTORECOUNT() {
        return storecount;
    }

    /**
     * Sets the value of the storecount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSTORECOUNT(BigInteger value) {
        this.storecount = value;
    }

}
