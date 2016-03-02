
package cz.lukashruby.dopo.feeder.xml.classes.shoptet;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SHOPITEM" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SHORT_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MANUFACTURER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="WARRANTY" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="ITEM_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="UNIT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CATEGORIES">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="IMAGES">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="IMAGE" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TEXT_PROPERTIES" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TEXT_PROPERTY" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RELATED_PRODUCTS" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ALTERNATIVE_PRODUCTS" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FLAGS">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ACTION" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="NEW" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="TIP" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *                   &lt;element name="STANDARD_PRICE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *                   &lt;element name="PURCHASE_PRICE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *                   &lt;element name="PRICE_VAT" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *                   &lt;element name="WEIGHT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
 *                   &lt;element name="EAN" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="STOCK" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="MINIMAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AVAILABILITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="VARIANTS" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="VARIANT" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="PARAMETERS">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="PARAMETER" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="EAN" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                                       &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                       &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                                       &lt;element name="PURCHASE_PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                                       &lt;element name="STANDARD_PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                                       &lt;element name="PRICE_VAT" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                                       &lt;element name="AVAILABILITY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "shopitem"
})
@XmlRootElement(name = "SHOP")
public class SHOP {

    @XmlElement(name = "SHOPITEM")
    protected List<SHOPITEM> shopitem;

    /**
     * Gets the value of the shopitem property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shopitem property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSHOPITEM().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SHOP.SHOPITEM }
     */
    public List<SHOPITEM> getSHOPITEM() {
        if (shopitem == null) {
            shopitem = new ArrayList<SHOPITEM>();
        }
        return this.shopitem;
    }

    public void setShopitem(List<SHOPITEM> shopitem) {
        this.shopitem = shopitem;
    }


    /**
     * <p>Java class for anonymous complex type.
     * <p>
     * <p>The following schema fragment specifies the expected content contained within this class.
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SHORT_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MANUFACTURER" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="WARRANTY" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="ITEM_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="UNIT" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CATEGORIES">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="IMAGES">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="IMAGE" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TEXT_PROPERTIES" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TEXT_PROPERTY" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RELATED_PRODUCTS" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ALTERNATIVE_PRODUCTS" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FLAGS">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ACTION" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="NEW" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="TIP" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
     *         &lt;element name="STANDARD_PRICE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
     *         &lt;element name="PURCHASE_PRICE" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
     *         &lt;element name="PRICE_VAT" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
     *         &lt;element name="WEIGHT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
     *         &lt;element name="EAN" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="STOCK" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="MINIMAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AVAILABILITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="VARIANTS" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="VARIANT" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PARAMETERS">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="PARAMETER" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="EAN" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *                             &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                             &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                             &lt;element name="PURCHASE_PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                             &lt;element name="STANDARD_PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                             &lt;element name="PRICE_VAT" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                             &lt;element name="AVAILABILITY" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "name",
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
            "availability",
            "variants"
    })
    public static class SHOPITEM {

        @XmlElement(name = "NAME", required = true)
        protected String name;
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
        protected SHOP.SHOPITEM.CATEGORIES categories;
        @XmlElement(name = "IMAGES", required = true)
        protected SHOP.SHOPITEM.IMAGES images;
        @XmlElement(name = "TEXT_PROPERTIES")
        protected SHOP.SHOPITEM.TEXTPROPERTIES textproperties;
        @XmlElement(name = "RELATED_PRODUCTS")
        protected SHOP.SHOPITEM.RELATEDPRODUCTS relatedproducts;
        @XmlElement(name = "ALTERNATIVE_PRODUCTS")
        protected SHOP.SHOPITEM.ALTERNATIVEPRODUCTS alternativeproducts;
        @XmlElement(name = "FLAGS", required = true)
        protected SHOP.SHOPITEM.FLAGS flags;
        @XmlElement(name = "CODE")
        protected String code;
        @XmlElement(name = "PRICE")
        protected Float price;
        @XmlElement(name = "STANDARD_PRICE")
        protected Float standardprice;
        @XmlElement(name = "PURCHASE_PRICE")
        protected Float purchaseprice;
        @XmlElement(name = "PRICE_VAT")
        protected Float pricevat;
        @XmlElement(name = "WEIGHT")
        protected String weight;
        @XmlElement(name = "VAT")
        protected Byte vat;
        @XmlElement(name = "EAN")
        protected Long ean;
        @XmlElement(name = "CURRENCY")
        protected String currency;
        @XmlElement(name = "STOCK")
        protected SHOP.SHOPITEM.STOCK stock;
        @XmlElement(name = "AVAILABILITY")
        protected String availability;
        @XmlElement(name = "VARIANTS")
        protected SHOP.SHOPITEM.VARIANTS variants;

        /**
         * Gets the value of the name property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getNAME() {
            return name;
        }

        /**
         * Sets the value of the name property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setNAME(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the shortdescription property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getSHORTDESCRIPTION() {
            return shortdescription;
        }

        /**
         * Sets the value of the shortdescription property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setSHORTDESCRIPTION(String value) {
            this.shortdescription = value;
        }

        /**
         * Gets the value of the description property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getDESCRIPTION() {
            return description;
        }

        /**
         * Sets the value of the description property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDESCRIPTION(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the manufacturer property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getMANUFACTURER() {
            return manufacturer;
        }

        /**
         * Sets the value of the manufacturer property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setMANUFACTURER(String value) {
            this.manufacturer = value;
        }

        /**
         * Gets the value of the warranty property.
         */
        public byte getWARRANTY() {
            return warranty;
        }

        /**
         * Sets the value of the warranty property.
         */
        public void setWARRANTY(byte value) {
            this.warranty = value;
        }

        /**
         * Gets the value of the itemtype property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getITEMTYPE() {
            return itemtype;
        }

        /**
         * Sets the value of the itemtype property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setITEMTYPE(String value) {
            this.itemtype = value;
        }

        /**
         * Gets the value of the unit property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getUNIT() {
            return unit;
        }

        /**
         * Sets the value of the unit property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setUNIT(String value) {
            this.unit = value;
        }

        /**
         * Gets the value of the categories property.
         *
         * @return possible object is
         * {@link SHOP.SHOPITEM.CATEGORIES }
         */
        public SHOP.SHOPITEM.CATEGORIES getCATEGORIES() {
            return categories;
        }

        /**
         * Sets the value of the categories property.
         *
         * @param value allowed object is
         *              {@link SHOP.SHOPITEM.CATEGORIES }
         */
        public void setCATEGORIES(SHOP.SHOPITEM.CATEGORIES value) {
            this.categories = value;
        }

        /**
         * Gets the value of the images property.
         *
         * @return possible object is
         * {@link SHOP.SHOPITEM.IMAGES }
         */
        public SHOP.SHOPITEM.IMAGES getIMAGES() {
            return images;
        }

        /**
         * Sets the value of the images property.
         *
         * @param value allowed object is
         *              {@link SHOP.SHOPITEM.IMAGES }
         */
        public void setIMAGES(SHOP.SHOPITEM.IMAGES value) {
            this.images = value;
        }

        /**
         * Gets the value of the textproperties property.
         *
         * @return possible object is
         * {@link SHOP.SHOPITEM.TEXTPROPERTIES }
         */
        public SHOP.SHOPITEM.TEXTPROPERTIES getTEXTPROPERTIES() {
            return textproperties;
        }

        /**
         * Sets the value of the textproperties property.
         *
         * @param value allowed object is
         *              {@link SHOP.SHOPITEM.TEXTPROPERTIES }
         */
        public void setTEXTPROPERTIES(SHOP.SHOPITEM.TEXTPROPERTIES value) {
            this.textproperties = value;
        }

        /**
         * Gets the value of the relatedproducts property.
         *
         * @return possible object is
         * {@link SHOP.SHOPITEM.RELATEDPRODUCTS }
         */
        public SHOP.SHOPITEM.RELATEDPRODUCTS getRELATEDPRODUCTS() {
            return relatedproducts;
        }

        /**
         * Sets the value of the relatedproducts property.
         *
         * @param value allowed object is
         *              {@link SHOP.SHOPITEM.RELATEDPRODUCTS }
         */
        public void setRELATEDPRODUCTS(SHOP.SHOPITEM.RELATEDPRODUCTS value) {
            this.relatedproducts = value;
        }

        /**
         * Gets the value of the alternativeproducts property.
         *
         * @return possible object is
         * {@link SHOP.SHOPITEM.ALTERNATIVEPRODUCTS }
         */
        public SHOP.SHOPITEM.ALTERNATIVEPRODUCTS getALTERNATIVEPRODUCTS() {
            return alternativeproducts;
        }

        /**
         * Sets the value of the alternativeproducts property.
         *
         * @param value allowed object is
         *              {@link SHOP.SHOPITEM.ALTERNATIVEPRODUCTS }
         */
        public void setALTERNATIVEPRODUCTS(SHOP.SHOPITEM.ALTERNATIVEPRODUCTS value) {
            this.alternativeproducts = value;
        }

        /**
         * Gets the value of the flags property.
         *
         * @return possible object is
         * {@link SHOP.SHOPITEM.FLAGS }
         */
        public SHOP.SHOPITEM.FLAGS getFLAGS() {
            return flags;
        }

        /**
         * Sets the value of the flags property.
         *
         * @param value allowed object is
         *              {@link SHOP.SHOPITEM.FLAGS }
         */
        public void setFLAGS(SHOP.SHOPITEM.FLAGS value) {
            this.flags = value;
        }

        /**
         * Gets the value of the code property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getCODE() {
            return code;
        }

        /**
         * Sets the value of the code property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCODE(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the price property.
         *
         * @return possible object is
         * {@link Float }
         */
        public Float getPRICE() {
            return price;
        }

        /**
         * Sets the value of the price property.
         *
         * @param value allowed object is
         *              {@link Float }
         */
        public void setPRICE(Float value) {
            this.price = value;
        }

        /**
         * Gets the value of the standardprice property.
         *
         * @return possible object is
         * {@link Float }
         */
        public Float getSTANDARDPRICE() {
            return standardprice;
        }

        /**
         * Sets the value of the standardprice property.
         *
         * @param value allowed object is
         *              {@link Float }
         */
        public void setSTANDARDPRICE(Float value) {
            this.standardprice = value;
        }

        /**
         * Gets the value of the purchaseprice property.
         *
         * @return possible object is
         * {@link Float }
         */
        public Float getPURCHASEPRICE() {
            return purchaseprice;
        }

        /**
         * Sets the value of the purchaseprice property.
         *
         * @param value allowed object is
         *              {@link Float }
         */
        public void setPURCHASEPRICE(Float value) {
            this.purchaseprice = value;
        }

        /**
         * Gets the value of the pricevat property.
         *
         * @return possible object is
         * {@link Float }
         */
        public Float getPRICEVAT() {
            return pricevat;
        }

        /**
         * Sets the value of the pricevat property.
         *
         * @param value allowed object is
         *              {@link Float }
         */
        public void setPRICEVAT(Float value) {
            this.pricevat = value;
        }

        /**
         * Gets the value of the weight property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getWEIGHT() {
            return weight;
        }

        /**
         * Sets the value of the weight property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setWEIGHT(String value) {
            this.weight = value;
        }

        /**
         * Gets the value of the vat property.
         *
         * @return possible object is
         * {@link Byte }
         */
        public Byte getVAT() {
            return vat;
        }

        /**
         * Sets the value of the vat property.
         *
         * @param value allowed object is
         *              {@link Byte }
         */
        public void setVAT(Byte value) {
            this.vat = value;
        }

        /**
         * Gets the value of the ean property.
         *
         * @return possible object is
         * {@link Long }
         */
        public Long getEAN() {
            return ean;
        }

        /**
         * Sets the value of the ean property.
         *
         * @param value allowed object is
         *              {@link Long }
         */
        public void setEAN(Long value) {
            this.ean = value;
        }

        /**
         * Gets the value of the currency property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getCURRENCY() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCURRENCY(String value) {
            this.currency = value;
        }

        /**
         * Gets the value of the stock property.
         *
         * @return possible object is
         * {@link SHOP.SHOPITEM.STOCK }
         */
        public SHOP.SHOPITEM.STOCK getSTOCK() {
            return stock;
        }

        /**
         * Sets the value of the stock property.
         *
         * @param value allowed object is
         *              {@link SHOP.SHOPITEM.STOCK }
         */
        public void setSTOCK(SHOP.SHOPITEM.STOCK value) {
            this.stock = value;
        }

        /**
         * Gets the value of the availability property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getAVAILABILITY() {
            return availability;
        }

        /**
         * Sets the value of the availability property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAVAILABILITY(String value) {
            this.availability = value;
        }

        /**
         * Gets the value of the variants property.
         *
         * @return possible object is
         * {@link SHOP.SHOPITEM.VARIANTS }
         */
        public SHOP.SHOPITEM.VARIANTS getVARIANTS() {
            return variants;
        }

        /**
         * Sets the value of the variants property.
         *
         * @param value allowed object is
         *              {@link SHOP.SHOPITEM.VARIANTS }
         */
        public void setVARIANTS(SHOP.SHOPITEM.VARIANTS value) {
            this.variants = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * <p>
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "code"
        })
        public static class ALTERNATIVEPRODUCTS {

            @XmlElement(name = "CODE")
            protected List<String> code;

            /**
             * Gets the value of the code property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the code property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCODE().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             */
            public List<String> getCODE() {
                if (code == null) {
                    code = new ArrayList<String>();
                }
                return this.code;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * <p>
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "category"
        })
        public static class CATEGORIES {

            @XmlElement(name = "CATEGORY")
            protected List<String> category;

            /**
             * Gets the value of the category property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the category property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCATEGORY().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             */
            public List<String> getCATEGORY() {
                if (category == null) {
                    category = new ArrayList<String>();
                }
                return this.category;
            }

            public void setCategory(List<String> category) {
                this.category = category;
            }
        }


        /**
         * <p>Java class for anonymous complex type.
         * <p>
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ACTION" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="NEW" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="TIP" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "action",
                "_new",
                "tip"
        })
        public static class FLAGS {

            @XmlElement(name = "ACTION")
            protected byte action;
            @XmlElement(name = "NEW")
            protected byte _new;
            @XmlElement(name = "TIP")
            protected byte tip;

            /**
             * Gets the value of the action property.
             */
            public byte getACTION() {
                return action;
            }

            /**
             * Sets the value of the action property.
             */
            public void setACTION(byte value) {
                this.action = value;
            }

            /**
             * Gets the value of the new property.
             */
            public byte getNEW() {
                return _new;
            }

            /**
             * Sets the value of the new property.
             */
            public void setNEW(byte value) {
                this._new = value;
            }

            /**
             * Gets the value of the tip property.
             */
            public byte getTIP() {
                return tip;
            }

            /**
             * Sets the value of the tip property.
             */
            public void setTIP(byte value) {
                this.tip = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * <p>
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="IMAGE" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "image"
        })
        public static class IMAGES {

            @XmlElement(name = "IMAGE")
            @XmlSchemaType(name = "anyURI")
            protected List<String> image;

            /**
             * Gets the value of the image property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the image property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIMAGE().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             */
            public List<String> getIMAGE() {
                if (image == null) {
                    image = new ArrayList<String>();
                }
                return this.image;
            }

            public void setImage(List<String> image) {
                this.image = image;
            }
        }


        /**
         * <p>Java class for anonymous complex type.
         * <p>
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "code"
        })
        public static class RELATEDPRODUCTS {

            @XmlElement(name = "CODE")
            protected List<String> code;

            /**
             * Gets the value of the code property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the code property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCODE().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             */
            public List<String> getCODE() {
                if (code == null) {
                    code = new ArrayList<String>();
                }
                return this.code;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * <p>
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="MINIMAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "amount",
                "minimalamount"
        })
        public static class STOCK {

            @XmlElement(name = "AMOUNT")
            protected byte amount;
            @XmlElement(name = "MINIMAL_AMOUNT")
            protected byte minimalamount;

            /**
             * Gets the value of the amount property.
             */
            public byte getAMOUNT() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             */
            public void setAMOUNT(byte value) {
                this.amount = value;
            }

            /**
             * Gets the value of the minimalamount property.
             */
            public byte getMINIMALAMOUNT() {
                return minimalamount;
            }

            /**
             * Sets the value of the minimalamount property.
             */
            public void setMINIMALAMOUNT(byte value) {
                this.minimalamount = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * <p>
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="TEXT_PROPERTY" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "textproperty"
        })
        public static class TEXTPROPERTIES {

            @XmlElement(name = "TEXT_PROPERTY")
            protected List<TEXTPROPERTY> textproperty;

            /**
             * Gets the value of the textproperty property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the textproperty property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTEXTPROPERTY().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SHOP.SHOPITEM.TEXTPROPERTIES.TEXTPROPERTY }
             */
            public List<TEXTPROPERTY> getTEXTPROPERTY() {
                if (textproperty == null) {
                    textproperty = new ArrayList<TEXTPROPERTY>();
                }
                return this.textproperty;
            }


            /**
             * <p>Java class for anonymous complex type.
             * <p>
             * <p>The following schema fragment specifies the expected content contained within this class.
             * <p>
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "name",
                    "value"
            })
            public static class TEXTPROPERTY {

                @XmlElement(name = "NAME", required = true)
                protected String name;
                @XmlElement(name = "VALUE", required = true)
                protected String value;

                /**
                 * Gets the value of the name property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getNAME() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setNAME(String value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the value property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getVALUE() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setVALUE(String value) {
                    this.value = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * <p>
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="VARIANT" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PARAMETERS">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="PARAMETER" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="EAN" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                   &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *                   &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *                   &lt;element name="PURCHASE_PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *                   &lt;element name="STANDARD_PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *                   &lt;element name="PRICE_VAT" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *                   &lt;element name="AVAILABILITY" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "variant"
        })
        public static class VARIANTS {

            @XmlElement(name = "VARIANT")
            protected List<VARIANT> variant;

            /**
             * Gets the value of the variant property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the variant property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getVARIANT().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SHOP.SHOPITEM.VARIANTS.VARIANT }
             */
            public List<VARIANT> getVARIANT() {
                if (variant == null) {
                    variant = new ArrayList<VARIANT>();
                }
                return this.variant;
            }

            public void setVARIANT(List<VARIANT> VARIANT) {
                this.variant = VARIANT;
            }


            /**
             * <p>Java class for anonymous complex type.
             * <p>
             * <p>The following schema fragment specifies the expected content contained within this class.
             * <p>
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PARAMETERS">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="PARAMETER" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="EAN" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}byte"/>
             *         &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/>
             *         &lt;element name="PURCHASE_PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/>
             *         &lt;element name="STANDARD_PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/>
             *         &lt;element name="PRICE_VAT" type="{http://www.w3.org/2001/XMLSchema}short"/>
             *         &lt;element name="AVAILABILITY" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
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
                    "availability"
            })
            public static class VARIANT {

                @XmlElement(name = "CODE", required = true)
                protected String code;
                @XmlElement(name = "PARAMETERS", required = true)
                protected SHOP.SHOPITEM.VARIANTS.VARIANT.PARAMETERS parameters;
                @XmlElement(name = "EAN")
                protected Long ean;
                @XmlElement(name = "CURRENCY", required = true)
                protected String currency;
                @XmlElement(name = "VAT")
                protected byte vat;
                @XmlElement(name = "PRICE")
                protected float price;
                @XmlElement(name = "PURCHASE_PRICE")
                protected float purchaseprice;
                @XmlElement(name = "STANDARD_PRICE")
                protected float standardprice;
                @XmlElement(name = "PRICE_VAT")
                protected short pricevat;
                @XmlElement(name = "AVAILABILITY", required = true)
                protected String availability;

                /**
                 * Gets the value of the code property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getCODE() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setCODE(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the parameters property.
                 *
                 * @return possible object is
                 * {@link SHOP.SHOPITEM.VARIANTS.VARIANT.PARAMETERS }
                 */
                public SHOP.SHOPITEM.VARIANTS.VARIANT.PARAMETERS getPARAMETERS() {
                    return parameters;
                }

                /**
                 * Sets the value of the parameters property.
                 *
                 * @param value allowed object is
                 *              {@link SHOP.SHOPITEM.VARIANTS.VARIANT.PARAMETERS }
                 */
                public void setPARAMETERS(SHOP.SHOPITEM.VARIANTS.VARIANT.PARAMETERS value) {
                    this.parameters = value;
                }

                /**
                 * Gets the value of the ean property.
                 *
                 * @return possible object is
                 * {@link Long }
                 */
                public Long getEAN() {
                    return ean;
                }

                /**
                 * Sets the value of the ean property.
                 *
                 * @param value allowed object is
                 *              {@link Long }
                 */
                public void setEAN(Long value) {
                    this.ean = value;
                }

                /**
                 * Gets the value of the currency property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getCURRENCY() {
                    return currency;
                }

                /**
                 * Sets the value of the currency property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setCURRENCY(String value) {
                    this.currency = value;
                }

                /**
                 * Gets the value of the vat property.
                 */
                public byte getVAT() {
                    return vat;
                }

                /**
                 * Sets the value of the vat property.
                 */
                public void setVAT(byte value) {
                    this.vat = value;
                }

                /**
                 * Gets the value of the price property.
                 */
                public float getPRICE() {
                    return price;
                }

                /**
                 * Sets the value of the price property.
                 */
                public void setPRICE(float value) {
                    this.price = value;
                }

                /**
                 * Gets the value of the purchaseprice property.
                 */
                public float getPURCHASEPRICE() {
                    return purchaseprice;
                }

                /**
                 * Sets the value of the purchaseprice property.
                 */
                public void setPURCHASEPRICE(float value) {
                    this.purchaseprice = value;
                }

                /**
                 * Gets the value of the standardprice property.
                 */
                public float getSTANDARDPRICE() {
                    return standardprice;
                }

                /**
                 * Sets the value of the standardprice property.
                 */
                public void setSTANDARDPRICE(float value) {
                    this.standardprice = value;
                }

                /**
                 * Gets the value of the pricevat property.
                 */
                public short getPRICEVAT() {
                    return pricevat;
                }

                /**
                 * Sets the value of the pricevat property.
                 */
                public void setPRICEVAT(short value) {
                    this.pricevat = value;
                }

                /**
                 * Gets the value of the availability property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getAVAILABILITY() {
                    return availability;
                }

                /**
                 * Sets the value of the availability property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setAVAILABILITY(String value) {
                    this.availability = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * <p>
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * <p>
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="PARAMETER" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "parameter"
                })
                public static class PARAMETERS {

                    @XmlElement(name = "PARAMETER")
                    protected List<PARAMETER> parameter;

                    /**
                     * Gets the value of the parameter property.
                     * <p>
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the parameter property.
                     * <p>
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPARAMETER().add(newItem);
                     * </pre>
                     * <p>
                     * <p>
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link SHOP.SHOPITEM.VARIANTS.VARIANT.PARAMETERS.PARAMETER }
                     */
                    public List<PARAMETER> getPARAMETER() {
                        if (parameter == null) {
                            parameter = new ArrayList<PARAMETER>();
                        }
                        return this.parameter;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * <p>
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * <p>
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                            "name",
                            "value"
                    })
                    public static class PARAMETER {

                        @XmlElement(name = "NAME", required = true)
                        protected String name;
                        @XmlElement(name = "VALUE", required = true)
                        protected String value;

                        /**
                         * Gets the value of the name property.
                         *
                         * @return possible object is
                         * {@link String }
                         */
                        public String getNAME() {
                            return name;
                        }

                        /**
                         * Sets the value of the name property.
                         *
                         * @param value allowed object is
                         *              {@link String }
                         */
                        public void setNAME(String value) {
                            this.name = value;
                        }

                        /**
                         * Gets the value of the value property.
                         *
                         * @return possible object is
                         * {@link String }
                         */
                        public String getVALUE() {
                            return value;
                        }

                        /**
                         * Sets the value of the value property.
                         *
                         * @param value allowed object is
                         *              {@link String }
                         */
                        public void setVALUE(String value) {
                            this.value = value;
                        }

                    }

                }

            }

        }

    }

}
