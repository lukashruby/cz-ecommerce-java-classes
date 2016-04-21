
package cz.lukashruby.api.xml.nellys;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


@XmlRegistry
public class ObjectFactory {

    private final static QName _PRODUCER_QNAME = new QName("", "PRODUCER");
    private final static QName _UNIT_QNAME = new QName("", "UNIT");
    private final static QName _ACTIVE_QNAME = new QName("", "ACTIVE");
    private final static QName _QUANTITY_QNAME = new QName("", "QUANTITY");
    private final static QName _PRICEOLD_QNAME = new QName("", "PRICE_OLD");
    private final static QName _PRICEBUY_QNAME = new QName("", "PRICE_BUY");
    private final static QName _VAT_QNAME = new QName("", "VAT");
    private final static QName _LOCK_QNAME = new QName("", "LOCK");
    private final static QName _EXPORT_QNAME = new QName("", "EXPORT");
    private final static QName _PRIORITY_QNAME = new QName("", "PRIORITY");
    private final static QName _DELIVERYTIME_QNAME = new QName("", "DELIVERY_TIME");
    private final static QName _CATEGORYSHORT_QNAME = new QName("", "CATEGORY_SHORT");
    private final static QName _URL_QNAME = new QName("", "URL");
    private final static QName _NAME_QNAME = new QName("", "NAME");
    private final static QName _AVAILABLE_QNAME = new QName("", "AVAILABLE");
    private final static QName _IDMAIN_QNAME = new QName("", "ID_MAIN");
    private final static QName _CODE_QNAME = new QName("", "CODE");
    private final static QName _EAN_QNAME = new QName("", "EAN");
    private final static QName _DESCRIPTION_QNAME = new QName("", "DESCRIPTION");
    private final static QName _PEREX_QNAME = new QName("", "PEREX");
    private final static QName _SIGN_QNAME = new QName("", "SIGN");
    private final static QName _ID_QNAME = new QName("", "ID");
    private final static QName _WEIGHT_QNAME = new QName("", "WEIGHT");
    private final static QName _SYNCHRONISM_QNAME = new QName("", "SYNCHRONISM");

    public ObjectFactory() {
    }

    public PRICEVAT createPRICEVAT() {
        return new PRICEVAT();
    }

    public SIGNS createSIGNS() {
        return new SIGNS();
    }

    public PRICESVAT createPRICESVAT() {
        return new PRICESVAT();
    }

    public ITEMS createITEMS() {
        return new ITEMS();
    }

    public ITEM createITEM() {
        return new ITEM();
    }

    public PRICES createPRICES() {
        return new PRICES();
    }

    public PRICE createPRICE() {
        return new PRICE();
    }

    public DUTIES createDUTIES() {
        return new DUTIES();
    }

    public IMAGES createIMAGES() {
        return new IMAGES();
    }

    public IMAGE createIMAGE() {
        return new IMAGE();
    }

    public CATEGORIES createCATEGORIES() {
        return new CATEGORIES();
    }

    public CATEGORY createCATEGORY() {
        return new CATEGORY();
    }

    public PARAMS createPARAMS() {
        return new PARAMS();
    }

    public PARAM createPARAM() {
        return new PARAM();
    }

    @XmlElementDecl(namespace = "", name = "PRODUCER")
    public JAXBElement<String> createPRODUCER(String value) {
        return new JAXBElement<String>(_PRODUCER_QNAME, String.class, null, value);
    }

    @XmlElementDecl(namespace = "", name = "UNIT")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUNIT(String value) {
        return new JAXBElement<String>(_UNIT_QNAME, String.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "ACTIVE")
    public JAXBElement<BigInteger> createACTIVE(BigInteger value) {
        return new JAXBElement<BigInteger>(_ACTIVE_QNAME, BigInteger.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "QUANTITY")
    public JAXBElement<BigDecimal> createQUANTITY(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_QUANTITY_QNAME, BigDecimal.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "PRICE_OLD")
    public JAXBElement<BigDecimal> createPRICEOLD(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PRICEOLD_QNAME, BigDecimal.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "PRICE_BUY")
    public JAXBElement<String> createPRICEBUY(String value) {
        return new JAXBElement<String>(_PRICEBUY_QNAME, String.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "VAT")
    public JAXBElement<BigInteger> createVAT(BigInteger value) {
        return new JAXBElement<BigInteger>(_VAT_QNAME, BigInteger.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "LOCK")
    public JAXBElement<BigDecimal> createLOCK(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LOCK_QNAME, BigDecimal.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "EXPORT")
    public JAXBElement<BigInteger> createEXPORT(BigInteger value) {
        return new JAXBElement<BigInteger>(_EXPORT_QNAME, BigInteger.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "PRIORITY")
    public JAXBElement<BigInteger> createPRIORITY(BigInteger value) {
        return new JAXBElement<BigInteger>(_PRIORITY_QNAME, BigInteger.class, null, value);
    }

    @XmlElementDecl(namespace = "", name = "DELIVERY_TIME")
    public JAXBElement<String> createDELIVERYTIME(String value) {
        return new JAXBElement<String>(_DELIVERYTIME_QNAME, String.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "CATEGORY_SHORT")
    public JAXBElement<String> createCATEGORYSHORT(String value) {
        return new JAXBElement<String>(_CATEGORYSHORT_QNAME, String.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "URL")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createURL(String value) {
        return new JAXBElement<String>(_URL_QNAME, String.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "NAME")
    public JAXBElement<String> createNAME(String value) {
        return new JAXBElement<String>(_NAME_QNAME, String.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "AVAILABLE")
    public JAXBElement<BigInteger> createAVAILABLE(BigInteger value) {
        return new JAXBElement<BigInteger>(_AVAILABLE_QNAME, BigInteger.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "ID_MAIN")
    public JAXBElement<BigInteger> createIDMAIN(BigInteger value) {
        return new JAXBElement<BigInteger>(_IDMAIN_QNAME, BigInteger.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "CODE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCODE(String value) {
        return new JAXBElement<String>(_CODE_QNAME, String.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "EAN")
    public JAXBElement<String> createEAN(String value) {
        return new JAXBElement<String>(_EAN_QNAME, String.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "DESCRIPTION")
    public JAXBElement<String> createDESCRIPTION(String value) {
        return new JAXBElement<String>(_DESCRIPTION_QNAME, String.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "PEREX")
    public JAXBElement<String> createPEREX(String value) {
        return new JAXBElement<String>(_PEREX_QNAME, String.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "SIGN")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSIGN(String value) {
        return new JAXBElement<String>(_SIGN_QNAME, String.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "ID")
    public JAXBElement<BigInteger> createID(BigInteger value) {
        return new JAXBElement<BigInteger>(_ID_QNAME, BigInteger.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "WEIGHT")
    public JAXBElement<BigInteger> createWEIGHT(BigInteger value) {
        return new JAXBElement<BigInteger>(_WEIGHT_QNAME, BigInteger.class, null, value);
    }

    @XmlElementDecl(namespace = "", name = "SYNCHRONISM")
    public JAXBElement<BigInteger> createSYNCHRONISM(BigInteger value) {
        return new JAXBElement<BigInteger>(_SYNCHRONISM_QNAME, BigInteger.class, null, value);
    }

}
