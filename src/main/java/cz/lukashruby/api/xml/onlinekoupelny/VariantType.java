package cz.lukashruby.api.xml.onlinekoupelny;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariantType", propOrder = {"catalog", "ean", "variantName", "retailPrice", "price", "eshopPrice", "recommendedPrice", "stock", "stockCount", "delivery", "modifiedAt", "removed"})
public class VariantType {
    @XmlElement(name = "Catalog", required = true)
    protected String catalog;
    @XmlElement(name = "EAN", required = true)
    protected Long ean;
    @XmlElement(name = "VariantName", required = true)
    protected String variantName;
    @XmlElement(name = "RetailPrice")
    protected BigDecimal retailPrice;
    @XmlElement(name = "Price")
    protected BigDecimal price;
    @XmlElement(name = "EshopPrice")
    protected BigDecimal eshopPrice;
    @XmlElement(name = "RecommendedPrice")
    protected BigDecimal recommendedPrice;
    @XmlElement(name = "Stock", required = true)
    protected String stock;
    @XmlElement(name = "StockCount")
    protected String stockCount;
    @XmlElement(name = "Delivery")
    protected byte delivery;
    @XmlElement(name = "ModifiedAt", required = true)
    protected String modifiedAt;
    @XmlElement(name = "Removed")
    protected byte removed;

    public String getCatalog() {
        return this.catalog;
    }


    public void setCatalog(String value) {
        this.catalog = value;
    }


    public Long getEAN() {
        return this.ean;
    }


    public void setEAN(Long value) {
        this.ean = value;
    }


    public String getVariantName() {
        return this.variantName;
    }


    public void setVariantName(String value) {
        this.variantName = value;
    }


    public BigDecimal getRetailPrice() {
        return this.retailPrice;
    }


    public void setRetailPrice(BigDecimal value) {
        this.retailPrice = value;
    }


    public BigDecimal getPrice() {
        return this.price;
    }


    public void setPrice(BigDecimal value) {
        this.price = value;
    }


    public BigDecimal getEshopPrice() {
        return this.eshopPrice;
    }


    public void setEshopPrice(BigDecimal value) {
        this.eshopPrice = value;
    }


    public BigDecimal getRecommendedPrice() {
        return this.recommendedPrice;
    }


    public void setRecommendedPrice(BigDecimal value) {
        this.recommendedPrice = value;
    }


    public String getStock() {
        return this.stock;
    }


    public void setStock(String value) {
        this.stock = value;
    }


    public String getStockCount() {
        return this.stockCount;
    }


    public void setStockCount(String value) {
        this.stockCount = value;
    }


    public byte getDelivery() {
        return this.delivery;
    }


    public void setDelivery(byte value) {
        this.delivery = value;
    }


    public String getModifiedAt() {
        return this.modifiedAt;
    }


    public void setModifiedAt(String value) {
        this.modifiedAt = value;
    }


    public byte getRemoved() {
        return this.removed;
    }


    public void setRemoved(byte value) {
        this.removed = value;
    }
}