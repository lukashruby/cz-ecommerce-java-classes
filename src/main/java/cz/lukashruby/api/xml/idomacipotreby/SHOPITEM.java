
package cz.lukashruby.api.xml.idomacipotreby;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;element ref="{}AVAILABILITY"/>
 *         &lt;element ref="{}PRICE"/>
 *         &lt;element ref="{}SALEPRICE"/>
 *         &lt;element ref="{}CATEGORY" minOccurs="0"/>
 *         &lt;element ref="{}CATEGORY1" minOccurs="0"/>
 *         &lt;element ref="{}CATEGORY2" minOccurs="0"/>
 *         &lt;element ref="{}CATEGORY3" minOccurs="0"/>
 *         &lt;element ref="{}CATEGORY4" minOccurs="0"/>
 *         &lt;element ref="{}CATEGORY5" minOccurs="0"/>
 *         &lt;element ref="{}CATALOGNUMBER"/>
 *         &lt;element ref="{}Thumbnail"/>
 *         &lt;element ref="{}Picture"/>
 *         &lt;element ref="{}EAN"/>
 *         &lt;element ref="{}STOCK"/>
 *         &lt;element ref="{}PRODUCTNAME"/>
 *         &lt;element ref="{}STOCK_DATE" minOccurs="0"/>
 *         &lt;element ref="{}VYROBCE"/>
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
    "availability",
    "price",
    "saleprice",
    "category",
    "category1",
    "category2",
    "category3",
    "category4",
    "category5",
    "catalognumber",
    "thumbnail",
    "picture",
    "ean",
    "stock",
    "productname",
    "stockdate",
    "vyrobce"
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
    @XmlElement(name = "AVAILABILITY", required = true)
    protected BigInteger availability;
    @XmlElement(name = "PRICE", required = true)
    protected String price;
    @XmlElement(name = "SALEPRICE", required = true)
    protected BigDecimal saleprice;
    @XmlElement(name = "CATEGORY")
    protected String category;
    @XmlElement(name = "CATEGORY1")
    protected String category1;
    @XmlElement(name = "CATEGORY2")
    protected String category2;
    @XmlElement(name = "CATEGORY3")
    protected String category3;
    @XmlElement(name = "CATEGORY4")
    protected String category4;
    @XmlElement(name = "CATEGORY5")
    protected String category5;
    @XmlElement(name = "CATALOGNUMBER", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String catalognumber;
    @XmlElement(name = "Thumbnail", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String thumbnail;
    @XmlElement(name = "Picture", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String picture;
    @XmlElement(name = "EAN", required = true)
    protected String ean;
    @XmlElement(name = "STOCK", required = true)
    protected BigInteger stock;
    @XmlElement(name = "PRODUCTNAME", required = true)
    protected String productname;
    @XmlElement(name = "STOCK_DATE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String stockdate;
    @XmlElement(name = "VYROBCE", required = true)
    protected String vyrobce;

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
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAVAILABILITY() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAVAILABILITY(BigInteger value) {
        this.availability = value;
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
     * Gets the value of the saleprice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSALEPRICE() {
        return saleprice;
    }

    /**
     * Sets the value of the saleprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSALEPRICE(BigDecimal value) {
        this.saleprice = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATEGORY() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATEGORY(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the category1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATEGORY1() {
        return category1;
    }

    /**
     * Sets the value of the category1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATEGORY1(String value) {
        this.category1 = value;
    }

    /**
     * Gets the value of the category2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATEGORY2() {
        return category2;
    }

    /**
     * Sets the value of the category2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATEGORY2(String value) {
        this.category2 = value;
    }

    /**
     * Gets the value of the category3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATEGORY3() {
        return category3;
    }

    /**
     * Sets the value of the category3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATEGORY3(String value) {
        this.category3 = value;
    }

    /**
     * Gets the value of the category4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATEGORY4() {
        return category4;
    }

    /**
     * Sets the value of the category4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATEGORY4(String value) {
        this.category4 = value;
    }

    /**
     * Gets the value of the category5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATEGORY5() {
        return category5;
    }

    /**
     * Sets the value of the category5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATEGORY5(String value) {
        this.category5 = value;
    }

    /**
     * Gets the value of the catalognumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATALOGNUMBER() {
        return catalognumber;
    }

    /**
     * Sets the value of the catalognumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATALOGNUMBER(String value) {
        this.catalognumber = value;
    }

    /**
     * Gets the value of the thumbnail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * Sets the value of the thumbnail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbnail(String value) {
        this.thumbnail = value;
    }

    /**
     * Gets the value of the picture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPicture() {
        return picture;
    }

    /**
     * Sets the value of the picture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPicture(String value) {
        this.picture = value;
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
     * Gets the value of the productname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODUCTNAME() {
        return productname;
    }

    /**
     * Sets the value of the productname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODUCTNAME(String value) {
        this.productname = value;
    }

    /**
     * Gets the value of the stockdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTOCKDATE() {
        return stockdate;
    }

    /**
     * Sets the value of the stockdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTOCKDATE(String value) {
        this.stockdate = value;
    }

    /**
     * Gets the value of the vyrobce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVYROBCE() {
        return vyrobce;
    }

    /**
     * Sets the value of the vyrobce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVYROBCE(String value) {
        this.vyrobce = value;
    }

}
