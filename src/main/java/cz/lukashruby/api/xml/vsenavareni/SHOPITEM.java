
package cz.lukashruby.api.xml.vsenavareni;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

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
    protected BigDecimal pricevo;
    @XmlElement(name = "PRICE_VO_VAT", required = true)
    protected BigDecimal pricevovat;
    @XmlElement(name = "PRICE", required = true)
    protected BigDecimal price;
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


    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public BigDecimal getPricevo() {
        return pricevo;
    }

    public void setPricevo(BigDecimal pricevo) {
        this.pricevo = pricevo;
    }

    public BigDecimal getPricevovat() {
        return pricevovat;
    }

    public void setPricevovat(BigDecimal pricevovat) {
        this.pricevovat = pricevovat;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigInteger getPricevat() {
        return pricevat;
    }

    public void setPricevat(BigInteger pricevat) {
        this.pricevat = pricevat;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<String> getCategorytext() {
        return categorytext;
    }

    public void setCategorytext(List<String> categorytext) {
        this.categorytext = categorytext;
    }

    public String getProductno() {
        return productno;
    }

    public void setProductno(String productno) {
        this.productno = productno;
    }

    public BigInteger getItemid() {
        return itemid;
    }

    public void setItemid(BigInteger itemid) {
        this.itemid = itemid;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(String deliverydate) {
        this.deliverydate = deliverydate;
    }

    public BigInteger getStorecount() {
        return storecount;
    }

    public void setStorecount(BigInteger storecount) {
        this.storecount = storecount;
    }
}
