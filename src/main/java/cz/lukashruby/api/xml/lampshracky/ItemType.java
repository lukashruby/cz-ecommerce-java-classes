package cz.lukashruby.api.xml.lampshracky;

import lombok.Data;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemType", propOrder = {
        "title",
        "serialNum",
        "ean",
        "category",
        "category_sub",
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
@Data
public class ItemType {

    @XmlElement(required = true)
    protected String title;
    @XmlElement(name = "serial_num", required = true)
    protected String serialNum;
    @XmlElement(required = true)
    protected String ean;
    @XmlElement(name = "category_sub", required = true)
    protected String categorySub;
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
}
