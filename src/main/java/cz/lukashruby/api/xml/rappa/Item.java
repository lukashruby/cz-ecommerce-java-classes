package cz.lukashruby.api.xml.rappa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Item", propOrder = {
        "product",
        "description",
        "url",
        "deliverydate",
        "kod",
        "price",
        "pricevat",
        "pricevo",
        "pricevovat",
        "imgurl",
        "categorytext",
        "manufacturer",
        "images",
        "ean",
        "packageminimum",
        "packagesize",
        "packaging",
        "stock",
        "age",
        "discountgroupid",
        "discountgroup",
        "colors"
})
public class Item {

    @XmlElement(name = "PRODUCT", required = true)
    protected String product;
    @XmlElement(name = "DESCRIPTION", required = true)
    protected String description;
    @XmlElement(name = "URL", required = true)
    protected String url;
    @XmlElement(name = "DELIVERY_DATE", required = true)
    protected String deliverydate;
    @XmlElement(name = "KOD", required = true)
    protected String kod;
    @XmlElement(name = "PRICE", required = true)
    protected String price;
    @XmlElement(name = "PRICE_VAT", required = true)
    protected String pricevat;
    @XmlElement(name = "PRICEVO", required = true)
    protected String pricevo;
    @XmlElement(name = "PRICEVO_VAT", required = true)
    protected String pricevovat;
    @XmlElement(name = "IMGURL", required = true)
    protected String imgurl;
    @XmlElement(name = "CATEGORYTEXT")
    protected List<String> categorytext;
    @XmlElement(name = "MANUFACTURER", required = true)
    protected String manufacturer;
    @XmlElement(name = "IMAGES", required = true)
    protected Images images;
    @XmlElement(name = "EAN", required = true)
    protected String ean;
    @XmlElement(name = "PACKAGE_MINIMUM", required = true)
    protected String packageminimum;
    @XmlElement(name = "PACKAGE_SIZE", required = true)
    protected String packagesize;
    @XmlElement(name = "PACKAGING", required = true)
    protected String packaging;
    @XmlElement(name = "STOCK", required = true)
    protected String stock;
    @XmlElement(name = "AGE", required = true)
    protected String age;
    @XmlElement(name = "DISCOUNTGROUPID", required = true)
    protected String discountgroupid;
    @XmlElement(name = "DISCOUNTGROUP", required = true)
    protected String discountgroup;
    @XmlElement(name = "COLORS", required = true)
    protected String colors;

    public String getPRODUCT() {
        return product;
    }

    public void setPRODUCT(String value) {
        this.product = value;
    }

    public String getDESCRIPTION() {
        return description;
    }

    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    public String getURL() {
        return url;
    }

    public void setURL(String value) {
        this.url = value;
    }

    public String getDELIVERYDATE() {
        return deliverydate;
    }

    public void setDELIVERYDATE(String value) {
        this.deliverydate = value;
    }

    public String getKOD() {
        return kod;
    }

    public void setKOD(String value) {
        this.kod = value;
    }

    public String getPRICE() {
        return price;
    }

    public void setPRICE(String value) {
        this.price = value;
    }

    public String getPRICEVAT() {
        return pricevat;
    }

    public void setPRICEVAT(String value) {
        this.pricevat = value;
    }

    public String getPRICEVO() {
        return pricevo;
    }

    public void setPRICEVO(String value) {
        this.pricevo = value;
    }

    public String getPRICEVOVAT() {
        return pricevovat;
    }

    public void setPRICEVOVAT(String value) {
        this.pricevovat = value;
    }

    public String getIMGURL() {
        return imgurl;
    }

    public void setIMGURL(String value) {
        this.imgurl = value;
    }

    public List<String> getCATEGORYTEXT() {
        if (categorytext == null) {
            categorytext = new ArrayList<String>();
        }
        return this.categorytext;
    }

    public String getMANUFACTURER() {
        return manufacturer;
    }

    public void setMANUFACTURER(String value) {
        this.manufacturer = value;
    }

    public Images getIMAGES() {
        return images;
    }

    public void setIMAGES(Images value) {
        this.images = value;
    }

    public String getEAN() {
        return ean;
    }

    public void setEAN(String value) {
        this.ean = value;
    }

    public String getPACKAGEMINIMUM() {
        return packageminimum;
    }

    public void setPACKAGEMINIMUM(String value) {
        this.packageminimum = value;
    }

    public String getPACKAGESIZE() {
        return packagesize;
    }

    public void setPACKAGESIZE(String value) {
        this.packagesize = value;
    }

    public String getPACKAGING() {
        return packaging;
    }

    public void setPACKAGING(String value) {
        this.packaging = value;
    }

    public String getSTOCK() {
        return stock;
    }

    public void setSTOCK(String value) {
        this.stock = value;
    }

    public String getAGE() {
        return age;
    }

    public void setAGE(String value) {
        this.age = value;
    }

    public String getDISCOUNTGROUPID() {
        return discountgroupid;
    }

    public void setDISCOUNTGROUPID(String value) {
        this.discountgroupid = value;
    }

    public String getDISCOUNTGROUP() {
        return discountgroup;
    }

    public void setDISCOUNTGROUP(String value) {
        this.discountgroup = value;
    }

    public String getCOLORS() {
        return colors;
    }

    public void setCOLORS(String value) {
        this.colors = value;
    }

}
