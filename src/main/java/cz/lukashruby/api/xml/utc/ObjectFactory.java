
package cz.lukashruby.api.xml.utc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cz.lukashruby.dopo.xml.classes.utc package. 
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
    private final static QName _HmotVahaNettoKsG_QNAME = new QName("", "hmot_vaha_netto_ks_g");
    private final static QName _VAT_QNAME = new QName("", "VAT");
    private final static QName _PocetKsKar_QNAME = new QName("", "pocet_ks_kar");
    private final static QName _PRICEB2C_QNAME = new QName("", "PRICE_B2C");
    private final static QName _HmotVahaBruttoKsG_QNAME = new QName("", "hmot_vaha_brutto_ks_g");
    private final static QName _RozmHloubkaPaletaCm_QNAME = new QName("", "rozm_hloubka_paleta_cm");
    private final static QName _VALUE_QNAME = new QName("", "VALUE");
    private final static QName _RozmVyskaSubkarCm_QNAME = new QName("", "rozm_vyska_subkar_cm");
    private final static QName _PRODUCT_QNAME = new QName("", "PRODUCT");
    private final static QName _RozmVyskaKsCm_QNAME = new QName("", "rozm_vyska_ks_cm");
    private final static QName _HmotVahaVrstvaG_QNAME = new QName("", "hmot_vaha_vrstva_g");
    private final static QName _ID_QNAME = new QName("", "ID");
    private final static QName _RozmVyskaVrstvaCm_QNAME = new QName("", "rozm_vyska_vrstva_cm");
    private final static QName _FULLNAME_QNAME = new QName("", "FULLNAME");
    private final static QName _PRICE_QNAME = new QName("", "PRICE");
    private final static QName _PocetKsPaleta_QNAME = new QName("", "pocet_ks_paleta");
    private final static QName _PocetKsVrstva_QNAME = new QName("", "pocet_ks_vrstva");
    private final static QName _RozmDelkaKarCm_QNAME = new QName("", "rozm_delka_kar_cm");
    private final static QName _RozmHloubkaVrstvaCm_QNAME = new QName("", "rozm_hloubka_vrstva_cm");
    private final static QName _RozmVyskaKarCm_QNAME = new QName("", "rozm_vyska_kar_cm");
    private final static QName _ISB2C_QNAME = new QName("", "IS_B2C");
    private final static QName _HmotVahaKarG_QNAME = new QName("", "hmot_vaha_kar_g");
    private final static QName _EAN_QNAME = new QName("", "EAN");
    private final static QName _HmotVahaSubkarG_QNAME = new QName("", "hmot_vaha_subkar_g");
    private final static QName _RozmDelkaVrstvaCm_QNAME = new QName("", "rozm_delka_vrstva_cm");
    private final static QName _RozmDelkaPaletaCm_QNAME = new QName("", "rozm_delka_paleta_cm");
    private final static QName _IMGURL_QNAME = new QName("", "IMGURL");
    private final static QName _PRICEMOC_QNAME = new QName("", "PRICE_MOC");
    private final static QName _CATEGORYTEXT_QNAME = new QName("", "CATEGORYTEXT");
    private final static QName _RozmDelkaSubkarCm_QNAME = new QName("", "rozm_delka_subkar_cm");
    private final static QName _RozmHloubkaKarCm_QNAME = new QName("", "rozm_hloubka_kar_cm");
    private final static QName _RozmDelkaKsCm_QNAME = new QName("", "rozm_delka_ks_cm");
    private final static QName _PIKTOGRAMY_QNAME = new QName("", "PIKTOGRAMY");
    private final static QName _SUPPLIER_QNAME = new QName("", "SUPPLIER");
    private final static QName _URL_QNAME = new QName("", "URL");
    private final static QName _STOCK_QNAME = new QName("", "STOCK");
    private final static QName _HmotVahaPaletaG_QNAME = new QName("", "hmot_vaha_paleta_g");
    private final static QName _DESCRIPTION_QNAME = new QName("", "DESCRIPTION");
    private final static QName _RozmHloubkaSubkarCm_QNAME = new QName("", "rozm_hloubka_subkar_cm");
    private final static QName _PocetKsSubkar_QNAME = new QName("", "pocet_ks_subkar");
    private final static QName _GENERATED_QNAME = new QName("", "GENERATED");
    private final static QName _PocetVrstvaPaleta_QNAME = new QName("", "pocet_vrstva_paleta");
    private final static QName _RozmVyskaPaletaCm_QNAME = new QName("", "rozm_vyska_paleta_cm");
    private final static QName _PocetKarPaleta_QNAME = new QName("", "pocet_kar_paleta");
    private final static QName _PocetKarVrstva_QNAME = new QName("", "pocet_kar_vrstva");
    private final static QName _PRICEVOC_QNAME = new QName("", "PRICE_VOC");
    private final static QName _RozmHloubkaKsCm_QNAME = new QName("", "rozm_hloubka_ks_cm");
    private final static QName _MANUFACTURER_QNAME = new QName("", "MANUFACTURER");
    private final static QName _PRODUCTSHOPID_QNAME = new QName("", "PRODUCT_SHOP_ID");
    private final static QName _PocetSubkarKar_QNAME = new QName("", "pocet_subkar_kar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cz.lukashruby.dopo.xml.classes.utc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SHORTLANG }
     * 
     */
    public SHORTLANG createSHORTLANG() {
        return new SHORTLANG();
    }

    /**
     * Create an instance of {@link VARIANT }
     * 
     */
    public VARIANT createVARIANT() {
        return new VARIANT();
    }

    /**
     * Create an instance of {@link PROPERTY }
     * 
     */
    public PROPERTY createPROPERTY() {
        return new PROPERTY();
    }

    /**
     * Create an instance of {@link NAME }
     * 
     */
    public NAME createNAME() {
        return new NAME();
    }

    /**
     * Create an instance of {@link GOLDLANG }
     * 
     */
    public GOLDLANG createGOLDLANG() {
        return new GOLDLANG();
    }

    /**
     * Create an instance of {@link NAMELANG }
     * 
     */
    public NAMELANG createNAMELANG() {
        return new NAMELANG();
    }

    /**
     * Create an instance of {@link SHOPITEM }
     * 
     */
    public SHOPITEM createSHOPITEM() {
        return new SHOPITEM();
    }

    /**
     * Create an instance of {@link ZARUKA }
     * 
     */
    public ZARUKA createZARUKA() {
        return new ZARUKA();
    }

    /**
     * Create an instance of {@link LOGISTICDATA }
     * 
     */
    public LOGISTICDATA createLOGISTICDATA() {
        return new LOGISTICDATA();
    }

    /**
     * Create an instance of {@link DESCRIPTIONS }
     * 
     */
    public DESCRIPTIONS createDESCRIPTIONS() {
        return new DESCRIPTIONS();
    }

    /**
     * Create an instance of {@link LONG }
     * 
     */
    public LONG createLONG() {
        return new LONG();
    }

    /**
     * Create an instance of {@link LONGLANG }
     * 
     */
    public LONGLANG createLONGLANG() {
        return new LONGLANG();
    }

    /**
     * Create an instance of {@link SHORT }
     * 
     */
    public SHORT createSHORT() {
        return new SHORT();
    }

    /**
     * Create an instance of {@link PARAMETERS }
     * 
     */
    public PARAMETERS createPARAMETERS() {
        return new PARAMETERS();
    }

    /**
     * Create an instance of {@link PARAMETER }
     * 
     */
    public PARAMETER createPARAMETER() {
        return new PARAMETER();
    }

    /**
     * Create an instance of {@link B2CVARIANTS }
     * 
     */
    public B2CVARIANTS createB2CVARIANTS() {
        return new B2CVARIANTS();
    }

    /**
     * Create an instance of {@link CUSTOMER }
     * 
     */
    public CUSTOMER createCUSTOMER() {
        return new CUSTOMER();
    }

    /**
     * Create an instance of {@link HEADER }
     * 
     */
    public HEADER createHEADER() {
        return new HEADER();
    }

    /**
     * Create an instance of {@link SHOP }
     * 
     */
    public SHOP createSHOP() {
        return new SHOP();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRICE_VAT")
    public JAXBElement<BigDecimal> createPRICEVAT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PRICEVAT_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hmot_vaha_netto_ks_g")
    public JAXBElement<BigDecimal> createHmotVahaNettoKsG(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_HmotVahaNettoKsG_QNAME, BigDecimal.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pocet_ks_kar")
    public JAXBElement<BigInteger> createPocetKsKar(BigInteger value) {
        return new JAXBElement<BigInteger>(_PocetKsKar_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRICE_B2C")
    public JAXBElement<BigDecimal> createPRICEB2C(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PRICEB2C_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hmot_vaha_brutto_ks_g")
    public JAXBElement<BigDecimal> createHmotVahaBruttoKsG(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_HmotVahaBruttoKsG_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rozm_hloubka_paleta_cm")
    public JAXBElement<BigDecimal> createRozmHloubkaPaletaCm(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RozmHloubkaPaletaCm_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "VALUE")
    public JAXBElement<String> createVALUE(String value) {
        return new JAXBElement<String>(_VALUE_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rozm_vyska_subkar_cm")
    public JAXBElement<BigDecimal> createRozmVyskaSubkarCm(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RozmVyskaSubkarCm_QNAME, BigDecimal.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rozm_vyska_ks_cm")
    public JAXBElement<BigDecimal> createRozmVyskaKsCm(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RozmVyskaKsCm_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hmot_vaha_vrstva_g")
    public JAXBElement<BigDecimal> createHmotVahaVrstvaG(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_HmotVahaVrstvaG_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ID")
    public JAXBElement<BigInteger> createID(BigInteger value) {
        return new JAXBElement<BigInteger>(_ID_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rozm_vyska_vrstva_cm")
    public JAXBElement<BigDecimal> createRozmVyskaVrstvaCm(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RozmVyskaVrstvaCm_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FULLNAME")
    public JAXBElement<String> createFULLNAME(String value) {
        return new JAXBElement<String>(_FULLNAME_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRICE")
    public JAXBElement<BigDecimal> createPRICE(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PRICE_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pocet_ks_paleta")
    public JAXBElement<BigInteger> createPocetKsPaleta(BigInteger value) {
        return new JAXBElement<BigInteger>(_PocetKsPaleta_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pocet_ks_vrstva")
    public JAXBElement<BigInteger> createPocetKsVrstva(BigInteger value) {
        return new JAXBElement<BigInteger>(_PocetKsVrstva_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rozm_delka_kar_cm")
    public JAXBElement<BigDecimal> createRozmDelkaKarCm(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RozmDelkaKarCm_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rozm_hloubka_vrstva_cm")
    public JAXBElement<BigDecimal> createRozmHloubkaVrstvaCm(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RozmHloubkaVrstvaCm_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rozm_vyska_kar_cm")
    public JAXBElement<BigDecimal> createRozmVyskaKarCm(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RozmVyskaKarCm_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IS_B2C")
    public JAXBElement<String> createISB2C(String value) {
        return new JAXBElement<String>(_ISB2C_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hmot_vaha_kar_g")
    public JAXBElement<BigDecimal> createHmotVahaKarG(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_HmotVahaKarG_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EAN")
    public JAXBElement<BigInteger> createEAN(BigInteger value) {
        return new JAXBElement<BigInteger>(_EAN_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hmot_vaha_subkar_g")
    public JAXBElement<BigDecimal> createHmotVahaSubkarG(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_HmotVahaSubkarG_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rozm_delka_vrstva_cm")
    public JAXBElement<BigDecimal> createRozmDelkaVrstvaCm(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RozmDelkaVrstvaCm_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rozm_delka_paleta_cm")
    public JAXBElement<BigDecimal> createRozmDelkaPaletaCm(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RozmDelkaPaletaCm_QNAME, BigDecimal.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRICE_MOC")
    public JAXBElement<BigDecimal> createPRICEMOC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PRICEMOC_QNAME, BigDecimal.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rozm_delka_subkar_cm")
    public JAXBElement<BigDecimal> createRozmDelkaSubkarCm(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RozmDelkaSubkarCm_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rozm_hloubka_kar_cm")
    public JAXBElement<BigDecimal> createRozmHloubkaKarCm(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RozmHloubkaKarCm_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rozm_delka_ks_cm")
    public JAXBElement<BigDecimal> createRozmDelkaKsCm(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RozmDelkaKsCm_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PIKTOGRAMY")
    public JAXBElement<String> createPIKTOGRAMY(String value) {
        return new JAXBElement<String>(_PIKTOGRAMY_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SUPPLIER")
    public JAXBElement<String> createSUPPLIER(String value) {
        return new JAXBElement<String>(_SUPPLIER_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "hmot_vaha_paleta_g")
    public JAXBElement<BigDecimal> createHmotVahaPaletaG(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_HmotVahaPaletaG_QNAME, BigDecimal.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rozm_hloubka_subkar_cm")
    public JAXBElement<BigDecimal> createRozmHloubkaSubkarCm(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RozmHloubkaSubkarCm_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pocet_ks_subkar")
    public JAXBElement<BigInteger> createPocetKsSubkar(BigInteger value) {
        return new JAXBElement<BigInteger>(_PocetKsSubkar_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GENERATED")
    public JAXBElement<XMLGregorianCalendar> createGENERATED(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GENERATED_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pocet_vrstva_paleta")
    public JAXBElement<BigInteger> createPocetVrstvaPaleta(BigInteger value) {
        return new JAXBElement<BigInteger>(_PocetVrstvaPaleta_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rozm_vyska_paleta_cm")
    public JAXBElement<BigDecimal> createRozmVyskaPaletaCm(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RozmVyskaPaletaCm_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pocet_kar_paleta")
    public JAXBElement<BigInteger> createPocetKarPaleta(BigInteger value) {
        return new JAXBElement<BigInteger>(_PocetKarPaleta_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pocet_kar_vrstva")
    public JAXBElement<BigInteger> createPocetKarVrstva(BigInteger value) {
        return new JAXBElement<BigInteger>(_PocetKarVrstva_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRICE_VOC")
    public JAXBElement<BigDecimal> createPRICEVOC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PRICEVOC_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rozm_hloubka_ks_cm")
    public JAXBElement<BigDecimal> createRozmHloubkaKsCm(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RozmHloubkaKsCm_QNAME, BigDecimal.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "PRODUCT_SHOP_ID")
    public JAXBElement<String> createPRODUCTSHOPID(String value) {
        return new JAXBElement<String>(_PRODUCTSHOPID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pocet_subkar_kar")
    public JAXBElement<BigInteger> createPocetSubkarKar(BigInteger value) {
        return new JAXBElement<BigInteger>(_PocetSubkarKar_QNAME, BigInteger.class, null, value);
    }

}
