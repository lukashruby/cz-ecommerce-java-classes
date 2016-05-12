package cz.lukashruby.api.xml.shoptet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "code",
        "parameters",
        "ean",
        "currency",
        "vat",
        "price",
        "purchaseprice",
        "standardprice",
        "pricevat",
        "availability_in_stock",
        "availability_out_of_stock"
})
public class VARIANT {

    @XmlElement(name = "CODE", required = true)
    protected String code;
    @XmlElement(name = "PARAMETERS", required = true)
    protected PARAMETERS parameters;
    @XmlElement(name = "EAN")
    protected Long ean;
    @XmlElement(name = "CURRENCY", required = true)
    protected String currency;
    @XmlElement(name = "VAT")
    protected byte vat;
    @XmlElement(name = "PRICE")
    protected BigDecimal price;
    @XmlElement(name = "PURCHASE_PRICE")
    protected BigDecimal purchaseprice;
    @XmlElement(name = "STANDARD_PRICE")
    protected BigDecimal standardprice;
    @XmlElement(name = "PRICE_VAT")
    protected BigDecimal pricevat;
    @XmlElement(name = "AVAILABILITY_OUT_OF_STOCK")
    protected String availability_out_of_stock;
    @XmlElement(name = "AVAILABILITY_IN_STOCK")
    protected String availability_in_stock;


    public String getCODE() {
        return code;
    }


    public void setCODE(String value) {
        this.code = value;
    }


    public PARAMETERS getPARAMETERS() {
        return parameters;
    }


    public void setPARAMETERS(PARAMETERS value) {
        this.parameters = value;
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


    public byte getVAT() {
        return vat;
    }


    public void setVAT(byte value) {
        this.vat = value;
    }


    public BigDecimal getPRICE() {
        return price;
    }


    public void setPRICE(BigDecimal value) {
        this.price = value;
    }


    public BigDecimal getPURCHASEPRICE() {
        return purchaseprice;
    }


    public void setPURCHASEPRICE(BigDecimal value) {
        this.purchaseprice = value;
    }


    public BigDecimal getSTANDARDPRICE() {
        return standardprice;
    }


    public void setSTANDARDPRICE(BigDecimal value) {
        this.standardprice = value;
    }


    public BigDecimal getPRICEVAT() {
        return pricevat;
    }


    public void setPRICEVAT(BigDecimal value) {
        this.pricevat = value;
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


}