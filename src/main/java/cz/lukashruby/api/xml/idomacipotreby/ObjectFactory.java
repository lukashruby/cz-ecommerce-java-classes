
package cz.lukashruby.api.xml.idomacipotreby;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cz.lukashruby.dopo.xml.classes.idomacipotreby package. 
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

    private final static QName _SALEPRICE_QNAME = new QName("", "SALEPRICE");
    private final static QName _PRICE_QNAME = new QName("", "PRICE");
    private final static QName _CATALOGNUMBER_QNAME = new QName("", "CATALOGNUMBER");
    private final static QName _Thumbnail_QNAME = new QName("", "Thumbnail");
    private final static QName _PRODUCTNAME_QNAME = new QName("", "PRODUCTNAME");
    private final static QName _URL_QNAME = new QName("", "URL");
    private final static QName _STOCK_QNAME = new QName("", "STOCK");
    private final static QName _STOCKDATE_QNAME = new QName("", "STOCK_DATE");
    private final static QName _EAN_QNAME = new QName("", "EAN");
    private final static QName _DESCRIPTION_QNAME = new QName("", "DESCRIPTION");
    private final static QName _AVAILABILITY_QNAME = new QName("", "AVAILABILITY");
    private final static QName _PRODUCT_QNAME = new QName("", "PRODUCT");
    private final static QName _CATEGORY_QNAME = new QName("", "CATEGORY");
    private final static QName _Picture_QNAME = new QName("", "Picture");
    private final static QName _CATEGORY2_QNAME = new QName("", "CATEGORY2");
    private final static QName _CATEGORY3_QNAME = new QName("", "CATEGORY3");
    private final static QName _CATEGORY4_QNAME = new QName("", "CATEGORY4");
    private final static QName _CATEGORY5_QNAME = new QName("", "CATEGORY5");
    private final static QName _VYROBCE_QNAME = new QName("", "VYROBCE");
    private final static QName _CATEGORY1_QNAME = new QName("", "CATEGORY1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cz.lukashruby.dopo.xml.classes.idomacipotreby
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SALEPRICE")
    public JAXBElement<BigDecimal> createSALEPRICE(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SALEPRICE_QNAME, BigDecimal.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CATALOGNUMBER")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCATALOGNUMBER(String value) {
        return new JAXBElement<String>(_CATALOGNUMBER_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Thumbnail")
    public JAXBElement<String> createThumbnail(String value) {
        return new JAXBElement<String>(_Thumbnail_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRODUCTNAME")
    public JAXBElement<String> createPRODUCTNAME(String value) {
        return new JAXBElement<String>(_PRODUCTNAME_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STOCK")
    public JAXBElement<BigInteger> createSTOCK(BigInteger value) {
        return new JAXBElement<BigInteger>(_STOCK_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STOCK_DATE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSTOCKDATE(String value) {
        return new JAXBElement<String>(_STOCKDATE_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AVAILABILITY")
    public JAXBElement<BigInteger> createAVAILABILITY(BigInteger value) {
        return new JAXBElement<BigInteger>(_AVAILABILITY_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "CATEGORY")
    public JAXBElement<String> createCATEGORY(String value) {
        return new JAXBElement<String>(_CATEGORY_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Picture")
    public JAXBElement<String> createPicture(String value) {
        return new JAXBElement<String>(_Picture_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CATEGORY2")
    public JAXBElement<String> createCATEGORY2(String value) {
        return new JAXBElement<String>(_CATEGORY2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CATEGORY3")
    public JAXBElement<String> createCATEGORY3(String value) {
        return new JAXBElement<String>(_CATEGORY3_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CATEGORY4")
    public JAXBElement<String> createCATEGORY4(String value) {
        return new JAXBElement<String>(_CATEGORY4_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CATEGORY5")
    public JAXBElement<String> createCATEGORY5(String value) {
        return new JAXBElement<String>(_CATEGORY5_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VYROBCE")
    public JAXBElement<String> createVYROBCE(String value) {
        return new JAXBElement<String>(_VYROBCE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CATEGORY1")
    public JAXBElement<String> createCATEGORY1(String value) {
        return new JAXBElement<String>(_CATEGORY1_QNAME, String.class, null, value);
    }

}
