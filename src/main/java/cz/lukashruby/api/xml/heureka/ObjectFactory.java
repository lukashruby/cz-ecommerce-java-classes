
package cz.lukashruby.api.xml.heureka;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cz.hrubysoftware.feeders.translator.model package. 
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

    private final static QName _PRICEVAT_QNAME = new QName("", "PRICE_VAT");
    private final static QName _ITEMGROUPID_QNAME = new QName("", "ITEMGROUP_ID");
    private final static QName _VAT_QNAME = new QName("", "VAT");
    private final static QName _ITEMID_QNAME = new QName("", "ITEM_ID");
    private final static QName _DELIVERYPRICECOD_QNAME = new QName("", "DELIVERY_PRICE_COD");
    private final static QName _PRODUCTNAME_QNAME = new QName("", "PRODUCTNAME");
    private final static QName _MANUFACTURER_QNAME = new QName("", "MANUFACTURER");
    private final static QName _URL_QNAME = new QName("", "URL");
    private final static QName _PARAMNAME_QNAME = new QName("", "PARAM_NAME");
    private final static QName _DELIVERYID_QNAME = new QName("", "DELIVERY_ID");
    private final static QName _EAN_QNAME = new QName("", "EAN");
    private final static QName _DESCRIPTION_QNAME = new QName("", "DESCRIPTION");
    private final static QName _DELIVERYDATE_QNAME = new QName("", "DELIVERY_DATE");
    private final static QName _PRODUCT_QNAME = new QName("", "PRODUCT");
    private final static QName _PRODUCTNO_QNAME = new QName("", "PRODUCTNO");
    private final static QName _HEUREKACPC_QNAME = new QName("", "HEUREKA_CPC");
    private final static QName _IMGURL_QNAME = new QName("", "IMGURL");
    private final static QName _ITEMTYPE_QNAME = new QName("", "ITEM_TYPE");
    private final static QName _CATEGORYTEXT_QNAME = new QName("", "CATEGORYTEXT");
    private final static QName _DELIVERYPRICE_QNAME = new QName("", "DELIVERY_PRICE");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cz.hrubysoftware.feeders.translator.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VAL }
     * 
     */
    public VAL createVAL() {
        return new VAL();
    }

    /**
     * Create an instance of {@link DELIVERY }
     * 
     */
    public DELIVERY createDELIVERY() {
        return new DELIVERY();
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
     * Create an instance of {@link PARAM }
     * 
     */
    public PARAM createPARAM() {
        return new PARAM();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ITEMGROUP_ID")
    public JAXBElement<String> createITEMGROUPID(String value) {
        return new JAXBElement<String>(_ITEMGROUPID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VAT")
    public JAXBElement<BigDecimal> createVAT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_VAT_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ITEM_ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createITEMID(String value) {
        return new JAXBElement<String>(_ITEMID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DELIVERY_PRICE_COD")
    public JAXBElement<BigInteger> createDELIVERYPRICECOD(BigInteger value) {
        return new JAXBElement<BigInteger>(_DELIVERYPRICECOD_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "MANUFACTURER")
    public JAXBElement<String> createMANUFACTURER(String value) {
        return new JAXBElement<String>(_MANUFACTURER_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "PARAM_NAME")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPARAMNAME(String value) {
        return new JAXBElement<String>(_PARAMNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DELIVERY_ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDELIVERYID(String value) {
        return new JAXBElement<String>(_DELIVERYID_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "DELIVERY_DATE")
    public JAXBElement<BigInteger> createDELIVERYDATE(BigInteger value) {
        return new JAXBElement<BigInteger>(_DELIVERYDATE_QNAME, BigInteger.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "HEUREKA_CPC")
    public JAXBElement<String> createHEUREKACPC(String value) {
        return new JAXBElement<String>(_HEUREKACPC_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "ITEM_TYPE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createITEMTYPE(String value) {
        return new JAXBElement<String>(_ITEMTYPE_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "DELIVERY_PRICE")
    public JAXBElement<BigInteger> createDELIVERYPRICE(BigInteger value) {
        return new JAXBElement<BigInteger>(_DELIVERYPRICE_QNAME, BigInteger.class, null, value);
    }

}
