
package cz.lukashruby.api.xml.nellys;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.math.BigInteger;

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

    public String getNAME() {
        return name;
    }

    public void setNAME(String value) {
        this.name = value;
    }

    public BigInteger getID() {
        return id;
    }

    public void setID(BigInteger value) {
        this.id = value;
    }

    public BigInteger getIDMAIN() {
        return idmain;
    }

    public void setIDMAIN(BigInteger value) {
        this.idmain = value;
    }

    public String getCODE() {
        return code;
    }

    public void setCODE(String value) {
        this.code = value;
    }

    public String getEAN() {
        return ean;
    }

    public void setEAN(String value) {
        this.ean = value;
    }

    public String getURL() {
        return url;
    }

    public void setURL(String value) {
        this.url = value;
    }

    public PRICES getPRICES() {
        return prices;
    }

    public void setPRICES(PRICES value) {
        this.prices = value;
    }

    public PRICESVAT getPRICESVAT() {
        return pricesvat;
    }

    public void setPRICESVAT(PRICESVAT value) {
        this.pricesvat = value;
    }

    public String getDELIVERYTIME() {
        return deliverytime;
    }

    public void setDELIVERYTIME(String value) {
        this.deliverytime = value;
    }

    public BigInteger getAVAILABLE() {
        return available;
    }

    public void setAVAILABLE(BigInteger value) {
        this.available = value;
    }

    public DUTIES getDUTIES() {
        return duties;
    }

    public void setDUTIES(DUTIES value) {
        this.duties = value;
    }

    public String getPRICEBUY() {
        return pricebuy;
    }

    public void setPRICEBUY(String value) {
        this.pricebuy = value;
    }

    public BigDecimal getPRICEOLD() {
        return priceold;
    }

    public void setPRICEOLD(BigDecimal value) {
        this.priceold = value;
    }

    public BigInteger getVAT() {
        return vat;
    }

    public void setVAT(BigInteger value) {
        this.vat = value;
    }

    public BigDecimal getQUANTITY() {
        return quantity;
    }

    public void setQUANTITY(BigDecimal value) {
        this.quantity = value;
    }

    public BigDecimal getLOCK() {
        return lock;
    }

    public void setLOCK(BigDecimal value) {
        this.lock = value;
    }

    public String getUNIT() {
        return unit;
    }

    public void setUNIT(String value) {
        this.unit = value;
    }

    public BigInteger getWEIGHT() {
        return weight;
    }

    public void setWEIGHT(BigInteger value) {
        this.weight = value;
    }

    public IMAGES getIMAGES() {
        return images;
    }

    public void setIMAGES(IMAGES value) {
        this.images = value;
    }

    public CATEGORIES getCATEGORIES() {
        return categories;
    }

    public void setCATEGORIES(CATEGORIES value) {
        this.categories = value;
    }

    public String getCATEGORYSHORT() {
        return categoryshort;
    }

    public void setCATEGORYSHORT(String value) {
        this.categoryshort = value;
    }

    public PARAMS getPARAMS() {
        return params;
    }

    public void setPARAMS(PARAMS value) {
        this.params = value;
    }

    public String getPRODUCER() {
        return producer;
    }

    public void setPRODUCER(String value) {
        this.producer = value;
    }

    public SIGNS getSIGNS() {
        return signs;
    }

    public void setSIGNS(SIGNS value) {
        this.signs = value;
    }

    public String getPEREX() {
        return perex;
    }

    public void setPEREX(String value) {
        this.perex = value;
    }

    public String getDESCRIPTION() {
        return description;
    }

    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    public BigInteger getPRIORITY() {
        return priority;
    }

    public void setPRIORITY(BigInteger value) {
        this.priority = value;
    }

    public BigInteger getSYNCHRONISM() {
        return synchronism;
    }

    public void setSYNCHRONISM(BigInteger value) {
        this.synchronism = value;
    }

    public BigInteger getEXPORT() {
        return export;
    }

    public void setEXPORT(BigInteger value) {
        this.export = value;
    }

    public BigInteger getACTIVE() {
        return active;
    }

    public void setACTIVE(BigInteger value) {
        this.active = value;
    }

}
