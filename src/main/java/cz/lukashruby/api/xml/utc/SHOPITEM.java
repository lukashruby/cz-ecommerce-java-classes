
package cz.lukashruby.api.xml.utc;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;


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
 *         &lt;element ref="{}EAN" minOccurs="0"/>
 *         &lt;element ref="{}CATEGORYTEXT"/>
 *         &lt;element ref="{}IMGURL"/>
 *         &lt;element ref="{}MANUFACTURER"/>
 *         &lt;element ref="{}PRICE"/>
 *         &lt;element ref="{}PRICE_VAT"/>
 *         &lt;element ref="{}VAT"/>
 *         &lt;element ref="{}PRODUCT_SHOP_ID"/>
 *         &lt;element ref="{}STOCK"/>
 *         &lt;element ref="{}PRICE_MOC"/>
 *         &lt;element ref="{}PRICE_VOC"/>
 *         &lt;element ref="{}IS_B2C"/>
 *         &lt;element ref="{}PRICE_B2C"/>
 *         &lt;element ref="{}PIKTOGRAMY" minOccurs="0"/>
 *         &lt;element ref="{}ZARUKA"/>
 *         &lt;element ref="{}LOGISTIC_DATA"/>
 *         &lt;element ref="{}DESCRIPTIONS"/>
 *         &lt;element ref="{}PARAMETERS"/>
 *         &lt;element ref="{}B2C_VARIANTS" minOccurs="0"/>
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
    "ean",
    "categorytext",
    "imgurl",
    "manufacturer",
    "price",
    "pricevat",
    "vat",
    "productshopid",
    "stock",
    "pricemoc",
    "pricevoc",
    "isb2C",
    "priceb2C",
    "piktogramy",
    "zaruka",
    "logisticdata",
    "descriptions",
    "parameters",
    "b2CVARIANTS"
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
    @XmlElement(name = "EAN")
    protected BigInteger ean;
    @XmlElement(name = "CATEGORYTEXT", required = true)
    protected String categorytext;
    @XmlElement(name = "IMGURL", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String imgurl;
    @XmlElement(name = "MANUFACTURER", required = true)
    protected String manufacturer;
    @XmlElement(name = "PRICE", required = true)
    protected BigDecimal price;
    @XmlElement(name = "PRICE_VAT", required = true)
    protected BigDecimal pricevat;
    @XmlElement(name = "VAT", required = true)
    protected BigDecimal vat;
    @XmlElement(name = "PRODUCT_SHOP_ID", required = true)
    protected String productshopid;
    @XmlElement(name = "STOCK", required = true)
    protected BigInteger stock;
    @XmlElement(name = "PRICE_MOC", required = true)
    protected BigDecimal pricemoc;
    @XmlElement(name = "PRICE_VOC", required = true)
    protected BigDecimal pricevoc;
    @XmlElement(name = "IS_B2C", required = true)
    protected String isb2C;
    @XmlElement(name = "PRICE_B2C", required = true)
    protected BigDecimal priceb2C;
    @XmlElement(name = "PIKTOGRAMY")
    protected String piktogramy;
    @XmlElement(name = "ZARUKA", required = true)
    protected ZARUKA zaruka;
    @XmlElement(name = "LOGISTIC_DATA", required = true)
    protected LOGISTICDATA logisticdata;
    @XmlElement(name = "DESCRIPTIONS", required = true)
    protected DESCRIPTIONS descriptions;
    @XmlElement(name = "PARAMETERS", required = true)
    protected PARAMETERS parameters;
    @XmlElement(name = "B2C_VARIANTS")
    protected B2CVARIANTS b2CVARIANTS;

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
     * Gets the value of the ean property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEAN() {
        return ean;
    }

    /**
     * Sets the value of the ean property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEAN(BigInteger value) {
        this.ean = value;
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
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPRICE() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPRICE(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the pricevat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPRICEVAT() {
        return pricevat;
    }

    /**
     * Sets the value of the pricevat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPRICEVAT(BigDecimal value) {
        this.pricevat = value;
    }

    /**
     * Gets the value of the vat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVAT() {
        return vat;
    }

    /**
     * Sets the value of the vat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVAT(BigDecimal value) {
        this.vat = value;
    }

    /**
     * Gets the value of the productshopid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODUCTSHOPID() {
        return productshopid;
    }

    /**
     * Sets the value of the productshopid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODUCTSHOPID(String value) {
        this.productshopid = value;
    }

    /**
     * Gets the value of the stock property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSTOCK() {
        return stock;
    }

    /**
     * Sets the value of the stock property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSTOCK(BigInteger value) {
        this.stock = value;
    }

    /**
     * Gets the value of the pricemoc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPRICEMOC() {
        return pricemoc;
    }

    /**
     * Sets the value of the pricemoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPRICEMOC(BigDecimal value) {
        this.pricemoc = value;
    }

    /**
     * Gets the value of the pricevoc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPRICEVOC() {
        return pricevoc;
    }

    /**
     * Sets the value of the pricevoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPRICEVOC(BigDecimal value) {
        this.pricevoc = value;
    }

    /**
     * Gets the value of the isb2C property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISB2C() {
        return isb2C;
    }

    /**
     * Sets the value of the isb2C property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISB2C(String value) {
        this.isb2C = value;
    }

    /**
     * Gets the value of the priceb2C property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPRICEB2C() {
        return priceb2C;
    }

    /**
     * Sets the value of the priceb2C property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPRICEB2C(BigDecimal value) {
        this.priceb2C = value;
    }

    /**
     * Gets the value of the piktogramy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIKTOGRAMY() {
        return piktogramy;
    }

    /**
     * Sets the value of the piktogramy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIKTOGRAMY(String value) {
        this.piktogramy = value;
    }

    /**
     * Gets the value of the zaruka property.
     * 
     * @return
     *     possible object is
     *     {@link ZARUKA }
     *     
     */
    public ZARUKA getZARUKA() {
        return zaruka;
    }

    /**
     * Sets the value of the zaruka property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZARUKA }
     *     
     */
    public void setZARUKA(ZARUKA value) {
        this.zaruka = value;
    }

    /**
     * Gets the value of the logisticdata property.
     * 
     * @return
     *     possible object is
     *     {@link LOGISTICDATA }
     *     
     */
    public LOGISTICDATA getLOGISTICDATA() {
        return logisticdata;
    }

    /**
     * Sets the value of the logisticdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOGISTICDATA }
     *     
     */
    public void setLOGISTICDATA(LOGISTICDATA value) {
        this.logisticdata = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link DESCRIPTIONS }
     *     
     */
    public DESCRIPTIONS getDESCRIPTIONS() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DESCRIPTIONS }
     *     
     */
    public void setDESCRIPTIONS(DESCRIPTIONS value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link PARAMETERS }
     *     
     */
    public PARAMETERS getPARAMETERS() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARAMETERS }
     *     
     */
    public void setPARAMETERS(PARAMETERS value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the b2CVARIANTS property.
     * 
     * @return
     *     possible object is
     *     {@link B2CVARIANTS }
     *     
     */
    public B2CVARIANTS getB2CVARIANTS() {
        return b2CVARIANTS;
    }

    /**
     * Sets the value of the b2CVARIANTS property.
     * 
     * @param value
     *     allowed object is
     *     {@link B2CVARIANTS }
     *     
     */
    public void setB2CVARIANTS(B2CVARIANTS value) {
        this.b2CVARIANTS = value;
    }

}
