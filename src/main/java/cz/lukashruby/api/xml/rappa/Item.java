package cz.lukashruby.api.xml.rappa;

import lombok.Data;
import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
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
@Data
@ToString
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
    protected BigDecimal price;
    @XmlElement(name = "PRICE_VAT", required = true)
    protected BigDecimal pricevat;
    @XmlElement(name = "PRICEVO", required = true)
    protected BigDecimal pricevo;
    @XmlElement(name = "PRICEVO_VAT", required = true)
    protected BigDecimal pricevovat;
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


    public List<String> getCATEGORYTEXT() {
        if (categorytext == null) {
            categorytext = new ArrayList<String>();
        }
        return this.categorytext;
    }

    private void setCATEGORYTEXT(List<String> categorytext) {
    }


}
