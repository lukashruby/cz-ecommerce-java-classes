
package cz.lukashruby.api.xml.vsenavareni;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import java.math.BigInteger;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cz.lukashruby.dopo.xml.classes.vsenavareni package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PRICE_QNAME = new QName("", "PRICE");
    private final static QName _PRICEVAT_QNAME = new QName("", "PRICE_VAT");
    private final static QName _ITEMID_QNAME = new QName("", "ITEM_ID");
    private final static QName _MANUFACTURER_QNAME = new QName("", "MANUFACTURER");
    private final static QName _STORECOUNT_QNAME = new QName("", "STORE_COUNT");
    private final static QName _URL_QNAME = new QName("", "URL");
    private final static QName _PRICEVO_QNAME = new QName("", "PRICE_VO");
    private final static QName _EAN_QNAME = new QName("", "EAN");
    private final static QName _DESCRIPTION_QNAME = new QName("", "DESCRIPTION");
    private final static QName _DELIVERYDATE_QNAME = new QName("", "DELIVERY_DATE");
    private final static QName _PRODUCT_QNAME = new QName("", "PRODUCT");
    private final static QName _PRODUCTNO_QNAME = new QName("", "PRODUCTNO");
    private final static QName _IMGURL_QNAME = new QName("", "IMGURL");
    private final static QName _CATEGORYTEXT_QNAME = new QName("", "CATEGORYTEXT");
    private final static QName _PRICEVOVAT_QNAME = new QName("", "PRICE_VO_VAT");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cz.lukashruby.dopo.xml.classes.vsenavareni
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SHOP }
     * 
     */
    public SHOP createSHOP() {
        return new SHOP();
    }

    /**
     * Create an instance of {@link SHOPITEM }
     * 
     */
    public SHOPITEM createSHOPITEM() {
        return new SHOPITEM();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRICE")
    public JAXBElement<String> createPRICE(String value) {
        return new JAXBElement<String>(_PRICE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRICE_VAT")
    public JAXBElement<BigInteger> createPRICEVAT(BigInteger value) {
        return new JAXBElement<BigInteger>(_PRICEVAT_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ITEM_ID")
    public JAXBElement<BigInteger> createITEMID(BigInteger value) {
        return new JAXBElement<BigInteger>(_ITEMID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MANUFACTURER")
    public JAXBElement<String> createMANUFACTURER(String value) {
        return new JAXBElement<String>(_MANUFACTURER_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STORE_COUNT")
    public JAXBElement<BigInteger> createSTORECOUNT(BigInteger value) {
        return new JAXBElement<BigInteger>(_STORECOUNT_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "URL")
    public JAXBElement<String> createURL(String value) {
        return new JAXBElement<String>(_URL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRICE_VO")
    public JAXBElement<String> createPRICEVO(String value) {
        return new JAXBElement<String>(_PRICEVO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EAN")
    public JAXBElement<String> createEAN(String value) {
        return new JAXBElement<String>(_EAN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DESCRIPTION")
    public JAXBElement<String> createDESCRIPTION(String value) {
        return new JAXBElement<String>(_DESCRIPTION_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DELIVERY_DATE")
    public JAXBElement<String> createDELIVERYDATE(String value) {
        return new JAXBElement<String>(_DELIVERYDATE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRODUCT")
    public JAXBElement<String> createPRODUCT(String value) {
        return new JAXBElement<String>(_PRODUCT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRODUCTNO")
    public JAXBElement<String> createPRODUCTNO(String value) {
        return new JAXBElement<String>(_PRODUCTNO_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IMGURL")
    public JAXBElement<String> createIMGURL(String value) {
        return new JAXBElement<String>(_IMGURL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CATEGORYTEXT")
    public JAXBElement<String> createCATEGORYTEXT(String value) {
        return new JAXBElement<String>(_CATEGORYTEXT_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRICE_VO_VAT")
    public JAXBElement<BigInteger> createPRICEVOVAT(BigInteger value) {
        return new JAXBElement<BigInteger>(_PRICEVOVAT_QNAME, BigInteger.class, null, value);
    }

}
