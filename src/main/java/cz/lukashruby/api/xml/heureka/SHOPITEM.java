
package cz.lukashruby.api.xml.heureka;

import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}ITEM_ID"/>
 *         &lt;element ref="{}PRICE_VAT"/>
 *         &lt;element ref="{}VAT"/>
 *         &lt;element ref="{}PRODUCT"/>
 *         &lt;element ref="{}PRODUCTNAME"/>
 *         &lt;element ref="{}DESCRIPTION" minOccurs="0"/>
 *         &lt;element ref="{}URL"/>
 *         &lt;element ref="{}MANUFACTURER" minOccurs="0"/>
 *         &lt;element ref="{}PARAM"/>
 *         &lt;element ref="{}IMGURL"/>
 *         &lt;element ref="{}CATEGORYTEXT" minOccurs="0"/>
 *         &lt;element ref="{}HEUREKA_CPC"/>
 *         &lt;element ref="{}DELIVERY_DATE"/>
 *         &lt;element ref="{}DELIVERY"/>
 *         &lt;element ref="{}ITEM_TYPE"/>
 *         &lt;element ref="{}ITEMGROUP_ID" minOccurs="0"/>
 *         &lt;element ref="{}PRODUCTNO"/>
 *         &lt;element ref="{}EAN"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "itemid",
    "pricevat",
    "vat",
    "product",
    "productname",
    "description",
    "url",
    "manufacturer",
    "param",
    "imgurl",
    "categorytext",
    "heurekacpc",
    "deliverydate",
    "delivery",
    "itemtype",
    "itemgroupid",
    "productno",
    "ean"
})
@XmlRootElement(name = "SHOPITEM")
@Data
public class SHOPITEM {

    @XmlElement(name = "ITEM_ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String itemid;
    @XmlElement(name = "PRICE_VAT", required = true)
    protected BigInteger pricevat;
    @XmlElement(name = "VAT", required = true)
    protected BigDecimal vat;
    @XmlElement(name = "PRODUCT", required = true)
    protected String product;
    @XmlElement(name = "PRODUCTNAME", required = true)
    protected String productname;
    @XmlElement(name = "DESCRIPTION")
    protected String description;
    @XmlElement(name = "URL", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(name = "MANUFACTURER")
    protected String manufacturer;
    @XmlElement(name = "PARAM", required = true)
    protected PARAM param;
    @XmlElement(name = "IMGURL", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String imgurl;
    @XmlElement(name = "CATEGORYTEXT")
    protected String categorytext;
    @XmlElement(name = "HEUREKA_CPC", required = true)
    protected String heurekacpc;
    @XmlElement(name = "DELIVERY_DATE", required = true)
    protected BigInteger deliverydate;
    @XmlElement(name = "DELIVERY", required = true)
    protected DELIVERY delivery;
    @XmlElement(name = "ITEM_TYPE", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String itemtype;
    @XmlElement(name = "ITEMGROUP_ID")
    protected String itemgroupid;
    @XmlElement(name = "PRODUCTNO", required = true)
    protected String productno;
    @XmlElement(name = "EAN", required = true)
    protected String ean;
}
