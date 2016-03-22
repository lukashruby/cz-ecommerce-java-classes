package cz.lukashruby.api.xml.onlinekoupelny;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductType", propOrder = {"category", "producer", "serie", "catalog", "ean", "productName", "description", "retailPrice", "price", "eshopPrice", "recommendedPrice", "guarantee", "stock", "stockCount", "delivery", "modifiedAt", "removed", "variants", "images", "related"})
public class ProductType {
    @XmlElement(name = "Category", required = true)
    protected String category;
    @XmlElement(name = "Producer", required = true)
    protected String producer;
    @XmlElement(name = "Serie", required = true)
    protected String serie;
    @XmlElement(name = "Catalog")
    protected String catalog;
    @XmlElement(name = "EAN")
    protected Long ean;
    @XmlElement(name = "ProductName", required = true)
    protected String productName;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "RetailPrice")
    protected BigDecimal retailPrice;
    @XmlElement(name = "Price")
    protected BigDecimal price;
    @XmlElement(name = "EshopPrice")
    protected BigDecimal eshopPrice;
    @XmlElement(name = "RecommendedPrice")
    protected BigDecimal recommendedPrice;
    @XmlElement(name = "Guarantee")
    protected Byte guarantee;
    @XmlElement(name = "Stock")
    protected String stock;
    @XmlElement(name = "StockCount")
    protected String stockCount;
    @XmlElement(name = "Delivery")
    protected Byte delivery;
    @XmlElement(name = "ModifiedAt", required = true)
    protected String modifiedAt;
    @XmlElement(name = "Removed")
    protected byte removed;
    @XmlElement(name = "Variants", required = true)
    protected VariantsType variants;
    @XmlElement(name = "Images", required = true)
    protected ImagesType images;
    @XmlElement(name = "Related", required = true)
    protected RelatedType related;

    public String getCategory() {
        return this.category;
    }


    public void setCategory(String value) {
        this.category = value;
    }


    public String getProducer() {
        return this.producer;
    }


    public void setProducer(String value) {
        this.producer = value;
    }


    public String getSerie() {
        return this.serie;
    }


    public void setSerie(String value) {
        this.serie = value;
    }


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


    public String getProductName() {
        return this.productName;
    }


    public void setProductName(String value) {
        this.productName = value;
    }


    public String getDescription() {
        return this.description;
    }


    public void setDescription(String value) {
        this.description = value;
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


    public Byte getGuarantee() {
        return this.guarantee;
    }


    public void setGuarantee(Byte value) {
        this.guarantee = value;
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


    public Byte getDelivery() {
        return this.delivery;
    }


    public void setDelivery(Byte value) {
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


    public VariantsType getVariants() {
        return this.variants;
    }


    public void setVariants(VariantsType value) {
        this.variants = value;
    }


    public ImagesType getImages() {
        return this.images;
    }


    public void setImages(ImagesType value) {
        this.images = value;
    }


    public RelatedType getRelated() {
        return this.related;
    }


    public void setRelated(RelatedType value) {
        this.related = value;
    }
}