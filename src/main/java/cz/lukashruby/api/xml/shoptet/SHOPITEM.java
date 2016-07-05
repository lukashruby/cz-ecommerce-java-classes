package cz.lukashruby.api.xml.shoptet;

import cz.lukashruby.api.xml.shoptet.adapters.CDataAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "name",
        "xmlFeedName",
        "shortdescription",
        "description",
        "manufacturer",
        "warranty",
        "itemtype",
        "unit",
        "categories",
        "images",
        "textproperties",
        "relatedproducts",
        "alternativeproducts",
        "flags",
        "code",
        "price",
        "standardprice",
        "purchaseprice",
        "pricevat",
        "weight",
        "vat",
        "ean",
        "currency",
        "stock",
        "availability_out_of_stock",
        "availability_in_stock",
        "variants"
})
@XmlRootElement
public class SHOPITEM {

    @XmlElement(name = "NAME", required = true)
    protected String name;
    @XmlElement(name = "XML_FEED_NAME")
    protected String xmlFeedName;
    @XmlElement(name = "SHORT_DESCRIPTION", required = true)
    protected String shortdescription;
    @XmlElement(name = "DESCRIPTION", required = true)
    protected String description;
    @XmlElement(name = "MANUFACTURER", required = true)
    protected String manufacturer;
    @XmlElement(name = "WARRANTY")
    protected byte warranty;
    @XmlElement(name = "ITEM_TYPE", required = true)
    protected String itemtype;
    @XmlElement(name = "UNIT", required = true)
    protected String unit;
    @XmlElement(name = "CATEGORIES", required = true)
    protected CATEGORIES categories;
    @XmlElement(name = "IMAGES", required = true)
    protected IMAGES images;
    @XmlElement(name = "TEXT_PROPERTIES")
    protected TEXTPROPERTIES textproperties;
    @XmlElement(name = "RELATED_PRODUCTS")
    protected RELATEDPRODUCTS relatedproducts;
    @XmlElement(name = "ALTERNATIVE_PRODUCTS")
    protected ALTERNATIVEPRODUCTS alternativeproducts;
    @XmlElement(name = "FLAGS", required = true)
    protected FLAGS flags;
    @XmlElement(name = "CODE")
    protected String code;
    @XmlElement(name = "PRICE")
    protected BigDecimal price;
    @XmlElement(name = "STANDARD_PRICE")
    protected BigDecimal standardprice;
    @XmlElement(name = "PURCHASE_PRICE")
    protected BigDecimal purchaseprice;
    @XmlElement(name = "PRICE_VAT")
    protected BigDecimal pricevat;
    @XmlElement(name = "WEIGHT")
    protected String weight;
    @XmlElement(name = "VAT")
    protected Byte vat;
    @XmlElement(name = "EAN")
    protected Long ean;
    @XmlElement(name = "CURRENCY")
    protected String currency;
    @XmlElement(name = "STOCK")
    protected STOCK stock;
    @XmlElement(name = "AVAILABILITY_OUT_OF_STOCK")
    protected String availability_out_of_stock;
    @XmlElement(name = "AVAILABILITY_IN_STOCK")
    protected String availability_in_stock;
    @XmlElement(name = "VARIANTS")
    protected VARIANTS variants;

    public String getNAME() {
        return name;
    }

    public void setNAME(String value) {
        this.name = value;
    }

    public String getXmlFeedName() {
        return xmlFeedName;
    }

    public void setXML_FEED_NAME(String xmlFeedName) {
        this.xmlFeedName = xmlFeedName;
    }

    public String getSHORTDESCRIPTION() {
        return shortdescription;
    }

    public void setSHORTDESCRIPTION(String value) {
        this.shortdescription = value;
    }

    public String getDESCRIPTION() {
        return description;
    }

    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    public String getMANUFACTURER() {
        return manufacturer;
    }

    public void setMANUFACTURER(String value) {
        this.manufacturer = value;
    }

    public byte getWARRANTY() {
        return warranty;
    }

    public void setWARRANTY(byte value) {
        this.warranty = value;
    }

    public String getITEMTYPE() {
        return itemtype;
    }

    public void setITEMTYPE(String value) {
        this.itemtype = value;
    }

    public String getUNIT() {
        return unit;
    }

    public void setUNIT(String value) {
        this.unit = value;
    }

    public CATEGORIES getCATEGORIES() {
        return categories;
    }

    public void setCATEGORIES(CATEGORIES value) {
        this.categories = value;
    }

    public IMAGES getIMAGES() {
        return images;
    }

    public void setIMAGES(IMAGES value) {
        this.images = value;
    }

    public TEXTPROPERTIES getTEXTPROPERTIES() {
        return textproperties;
    }

    public void setTEXTPROPERTIES(TEXTPROPERTIES value) {
        this.textproperties = value;
    }

    public RELATEDPRODUCTS getRELATEDPRODUCTS() {
        return relatedproducts;
    }

    public void setRELATEDPRODUCTS(RELATEDPRODUCTS value) {
        this.relatedproducts = value;
    }

    public ALTERNATIVEPRODUCTS getALTERNATIVEPRODUCTS() {
        return alternativeproducts;
    }

    public void setALTERNATIVEPRODUCTS(ALTERNATIVEPRODUCTS value) {
        this.alternativeproducts = value;
    }

    public FLAGS getFLAGS() {
        return flags;
    }

    public void setFLAGS(FLAGS value) {
        this.flags = value;
    }

    public String getCODE() {
        return code;
    }

    public void setCODE(String value) {
        this.code = value;
    }

    public BigDecimal getPRICE() {
        return price;
    }

    public void setPRICE(BigDecimal value) {
        this.price = value;
    }

    public BigDecimal getSTANDARDPRICE() {
        return standardprice;
    }

    public void setSTANDARDPRICE(BigDecimal value) {
        this.standardprice = value;
    }

    public BigDecimal getPURCHASEPRICE() {
        return purchaseprice;
    }

    public void setPURCHASEPRICE(BigDecimal value) {
        this.purchaseprice = value;
    }

    public BigDecimal getPRICEVAT() {
        return pricevat;
    }

    public void setPRICEVAT(BigDecimal value) {
        this.pricevat = value;
    }

    public String getWEIGHT() {
        return weight;
    }

    public void setWEIGHT(String value) {
        this.weight = value;
    }

    public Byte getVAT() {
        return vat;
    }

    public void setVAT(Byte value) {
        this.vat = value;
    }

    public Long getEAN() {
        return ean;
    }

    public void setEAN(Long value) {
        this.ean = value;
    }

    public String getCURRENCY() {
        return currency;
    }

    public void setCURRENCY(String value) {
        this.currency = value;
    }

    public STOCK getSTOCK() {
        return stock;
    }

    public void setSTOCK(STOCK value) {
        this.stock = value;
    }


    public String getAvailability_out_of_stock() {
        return availability_out_of_stock;
    }

    public void setAvailability_out_of_stock(String availability_out_of_stock) {
        this.availability_out_of_stock = availability_out_of_stock;
    }

    public String getAvailability_in_stock() {
        return availability_in_stock;
    }

    public void setAvailability_in_stock(String availability_in_stock) {
        this.availability_in_stock = availability_in_stock;
    }

    public VARIANTS getVARIANTS() {
        return variants;
    }

    public void setVARIANTS(VARIANTS value) {
        this.variants = value;
    }


}