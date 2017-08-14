package cz.lukashruby.api.xml.lamphracky;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemType", propOrder = {
        "title",
        "serialNum",
        "ean",
        "category",
        "priceRecommend",
        "priceWholesale",
        "priceWholesaleVat",
        "price",
        "discount",
        "minPack",
        "maxPack",
        "inStock",
        "vat",
        "description",
        "image",
        "thumb"
})
public class ItemType {

    @XmlElement(required = true)
    protected String title;
    @XmlElement(name = "serial_num", required = true)
    protected String serialNum;
    @XmlElement(required = true)
    protected String ean;
    @XmlElement(required = true)
    protected String category;
    @XmlElement(name = "price_recommend", required = true)
    protected String priceRecommend;
    @XmlElement(name = "price_wholesale", required = true)
    protected String priceWholesale;
    @XmlElement(name = "price_wholesale_vat", required = true)
    protected String priceWholesaleVat;
    @XmlElement(required = true)
    protected String price;
    @XmlElement(required = true)
    protected String discount;
    @XmlElement(name = "min_pack", required = true)
    protected String minPack;
    @XmlElement(name = "max_pack", required = true)
    protected String maxPack;
    @XmlElement(name = "in_stock", required = true)
    protected String inStock;
    @XmlElement(required = true)
    protected String vat;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String image;
    @XmlElement(required = true)
    protected String thumb;
    @XmlAttribute(name = "pid")
    protected String pid;

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String value) {
        this.serialNum = value;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String value) {
        this.ean = value;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String value) {
        this.category = value;
    }

    public String getPriceRecommend() {
        return priceRecommend;
    }

    public void setPriceRecommend(String value) {
        this.priceRecommend = value;
    }

    public String getPriceWholesale() {
        return priceWholesale;
    }

    public void setPriceWholesale(String value) {
        this.priceWholesale = value;
    }

    public String getPriceWholesaleVat() {
        return priceWholesaleVat;
    }

    public void setPriceWholesaleVat(String value) {
        this.priceWholesaleVat = value;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String value) {
        this.price = value;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String value) {
        this.discount = value;
    }

    public String getMinPack() {
        return minPack;
    }

    public void setMinPack(String value) {
        this.minPack = value;
    }

    public String getMaxPack() {
        return maxPack;
    }

    public void setMaxPack(String value) {
        this.maxPack = value;
    }

    public String getInStock() {
        return inStock;
    }

    public void setInStock(String value) {
        this.inStock = value;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String value) {
        this.vat = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String value) {
        this.image = value;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String value) {
        this.thumb = value;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String value) {
        this.pid = value;
    }

}
