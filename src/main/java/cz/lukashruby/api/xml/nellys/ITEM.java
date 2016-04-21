
package cz.lukashruby.api.xml.nellys;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 *         &lt;element ref="{}NAME"/>
 *         &lt;element ref="{}ID"/>
 *         &lt;element ref="{}ID_MAIN"/>
 *         &lt;element ref="{}CODE"/>
 *         &lt;element ref="{}EAN" minOccurs="0"/>
 *         &lt;element ref="{}URL"/>
 *         &lt;element ref="{}PRICES"/>
 *         &lt;element ref="{}PRICES_VAT"/>
 *         &lt;element ref="{}DELIVERY_TIME"/>
 *         &lt;element ref="{}AVAILABLE"/>
 *         &lt;element ref="{}DUTIES"/>
 *         &lt;element ref="{}PRICE_BUY"/>
 *         &lt;element ref="{}PRICE_OLD"/>
 *         &lt;element ref="{}VAT"/>
 *         &lt;element ref="{}QUANTITY"/>
 *         &lt;element ref="{}LOCK"/>
 *         &lt;element ref="{}UNIT"/>
 *         &lt;element ref="{}WEIGHT"/>
 *         &lt;element ref="{}IMAGES"/>
 *         &lt;element ref="{}CATEGORIES"/>
 *         &lt;element ref="{}CATEGORY_SHORT"/>
 *         &lt;element ref="{}PARAMS"/>
 *         &lt;element ref="{}PRODUCER"/>
 *         &lt;element ref="{}SIGNS"/>
 *         &lt;element ref="{}PEREX"/>
 *         &lt;element ref="{}DESCRIPTION"/>
 *         &lt;element ref="{}PRIORITY"/>
 *         &lt;element ref="{}SYNCHRONISM"/>
 *         &lt;element ref="{}EXPORT"/>
 *         &lt;element ref="{}ACTIVE"/>
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
    "name",
    "id",
    "idmain",
    "code",
    "ean",
    "url",
    "prices",
    "pricesvat",
    "deliverytime",
    "available",
    "duties",
    "pricebuy",
    "priceold",
    "vat",
    "quantity",
    "lock",
    "unit",
    "weight",
    "images",
    "categories",
    "categoryshort",
    "params",
    "producer",
    "signs",
    "perex",
    "description",
    "priority",
    "synchronism",
    "export",
    "active"
})
@XmlRootElement(name = "ITEM")
public class ITEM {

    @XmlElement(name = "NAME", required = true)
    protected String name;
    @XmlElement(name = "ID", required = true)
    protected BigInteger id;
    @XmlElement(name = "ID_MAIN", required = true)
    protected BigInteger idmain;
    @XmlElement(name = "CODE", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String code;
    @XmlElement(name = "EAN")
    protected String ean;
    @XmlElement(name = "URL", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String url;
    @XmlElement(name = "PRICES", required = true)
    protected PRICES prices;
    @XmlElement(name = "PRICES_VAT", required = true)
    protected PRICESVAT pricesvat;
    @XmlElement(name = "DELIVERY_TIME", required = true)
    protected String deliverytime;
    @XmlElement(name = "AVAILABLE", required = true)
    protected BigInteger available;
    @XmlElement(name = "DUTIES", required = true)
    protected DUTIES duties;
    @XmlElement(name = "PRICE_BUY", required = true)
    protected String pricebuy;
    @XmlElement(name = "PRICE_OLD", required = true)
    protected BigDecimal priceold;
    @XmlElement(name = "VAT", required = true)
    protected BigInteger vat;
    @XmlElement(name = "QUANTITY", required = true)
    protected BigDecimal quantity;
    @XmlElement(name = "LOCK", required = true)
    protected BigDecimal lock;
    @XmlElement(name = "UNIT", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String unit;
    @XmlElement(name = "WEIGHT", required = true)
    protected BigInteger weight;
    @XmlElement(name = "IMAGES", required = true)
    protected IMAGES images;
    @XmlElement(name = "CATEGORIES", required = true)
    protected CATEGORIES categories;
    @XmlElement(name = "CATEGORY_SHORT", required = true)
    protected String categoryshort;
    @XmlElement(name = "PARAMS", required = true)
    protected PARAMS params;
    @XmlElement(name = "PRODUCER", required = true)
    protected String producer;
    @XmlElement(name = "SIGNS", required = true)
    protected SIGNS signs;
    @XmlElement(name = "PEREX", required = true)
    protected String perex;
    @XmlElement(name = "DESCRIPTION", required = true)
    protected String description;
    @XmlElement(name = "PRIORITY", required = true)
    protected BigInteger priority;
    @XmlElement(name = "SYNCHRONISM", required = true)
    protected BigInteger synchronism;
    @XmlElement(name = "EXPORT", required = true)
    protected BigInteger export;
    @XmlElement(name = "ACTIVE", required = true)
    protected BigInteger active;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setID(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the idmain property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIDMAIN() {
        return idmain;
    }

    /**
     * Sets the value of the idmain property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIDMAIN(BigInteger value) {
        this.idmain = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODE() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODE(String value) {
        this.code = value;
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
     * Gets the value of the prices property.
     * 
     * @return
     *     possible object is
     *     {@link PRICES }
     *     
     */
    public PRICES getPRICES() {
        return prices;
    }

    /**
     * Sets the value of the prices property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRICES }
     *     
     */
    public void setPRICES(PRICES value) {
        this.prices = value;
    }

    /**
     * Gets the value of the pricesvat property.
     * 
     * @return
     *     possible object is
     *     {@link PRICESVAT }
     *     
     */
    public PRICESVAT getPRICESVAT() {
        return pricesvat;
    }

    /**
     * Sets the value of the pricesvat property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRICESVAT }
     *     
     */
    public void setPRICESVAT(PRICESVAT value) {
        this.pricesvat = value;
    }

    /**
     * Gets the value of the deliverytime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVERYTIME() {
        return deliverytime;
    }

    /**
     * Sets the value of the deliverytime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVERYTIME(String value) {
        this.deliverytime = value;
    }

    /**
     * Gets the value of the available property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAVAILABLE() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAVAILABLE(BigInteger value) {
        this.available = value;
    }

    /**
     * Gets the value of the duties property.
     * 
     * @return
     *     possible object is
     *     {@link DUTIES }
     *     
     */
    public DUTIES getDUTIES() {
        return duties;
    }

    /**
     * Sets the value of the duties property.
     * 
     * @param value
     *     allowed object is
     *     {@link DUTIES }
     *     
     */
    public void setDUTIES(DUTIES value) {
        this.duties = value;
    }

    /**
     * Gets the value of the pricebuy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRICEBUY() {
        return pricebuy;
    }

    /**
     * Sets the value of the pricebuy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRICEBUY(String value) {
        this.pricebuy = value;
    }

    /**
     * Gets the value of the priceold property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPRICEOLD() {
        return priceold;
    }

    /**
     * Sets the value of the priceold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPRICEOLD(BigDecimal value) {
        this.priceold = value;
    }

    /**
     * Gets the value of the vat property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVAT() {
        return vat;
    }

    /**
     * Sets the value of the vat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVAT(BigInteger value) {
        this.vat = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQUANTITY() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQUANTITY(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the lock property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLOCK() {
        return lock;
    }

    /**
     * Sets the value of the lock property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLOCK(BigDecimal value) {
        this.lock = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNIT() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNIT(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWEIGHT() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWEIGHT(BigInteger value) {
        this.weight = value;
    }

    /**
     * Gets the value of the images property.
     * 
     * @return
     *     possible object is
     *     {@link IMAGES }
     *     
     */
    public IMAGES getIMAGES() {
        return images;
    }

    /**
     * Sets the value of the images property.
     * 
     * @param value
     *     allowed object is
     *     {@link IMAGES }
     *     
     */
    public void setIMAGES(IMAGES value) {
        this.images = value;
    }

    /**
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link CATEGORIES }
     *     
     */
    public CATEGORIES getCATEGORIES() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link CATEGORIES }
     *     
     */
    public void setCATEGORIES(CATEGORIES value) {
        this.categories = value;
    }

    /**
     * Gets the value of the categoryshort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATEGORYSHORT() {
        return categoryshort;
    }

    /**
     * Sets the value of the categoryshort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATEGORYSHORT(String value) {
        this.categoryshort = value;
    }

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link PARAMS }
     *     
     */
    public PARAMS getPARAMS() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARAMS }
     *     
     */
    public void setPARAMS(PARAMS value) {
        this.params = value;
    }

    /**
     * Gets the value of the producer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODUCER() {
        return producer;
    }

    /**
     * Sets the value of the producer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODUCER(String value) {
        this.producer = value;
    }

    /**
     * Gets the value of the signs property.
     * 
     * @return
     *     possible object is
     *     {@link SIGNS }
     *     
     */
    public SIGNS getSIGNS() {
        return signs;
    }

    /**
     * Sets the value of the signs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIGNS }
     *     
     */
    public void setSIGNS(SIGNS value) {
        this.signs = value;
    }

    /**
     * Gets the value of the perex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPEREX() {
        return perex;
    }

    /**
     * Sets the value of the perex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPEREX(String value) {
        this.perex = value;
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
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPRIORITY() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPRIORITY(BigInteger value) {
        this.priority = value;
    }

    /**
     * Gets the value of the synchronism property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSYNCHRONISM() {
        return synchronism;
    }

    /**
     * Sets the value of the synchronism property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSYNCHRONISM(BigInteger value) {
        this.synchronism = value;
    }

    /**
     * Gets the value of the export property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEXPORT() {
        return export;
    }

    /**
     * Sets the value of the export property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEXPORT(BigInteger value) {
        this.export = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getACTIVE() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setACTIVE(BigInteger value) {
        this.active = value;
    }

}
