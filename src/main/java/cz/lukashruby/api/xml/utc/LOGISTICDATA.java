
package cz.lukashruby.api.xml.utc;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.math.BigInteger;


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
 *         &lt;element ref="{}pocet_ks_subkar"/>
 *         &lt;element ref="{}pocet_ks_kar"/>
 *         &lt;element ref="{}pocet_ks_vrstva"/>
 *         &lt;element ref="{}pocet_ks_paleta"/>
 *         &lt;element ref="{}rozm_delka_ks_cm"/>
 *         &lt;element ref="{}rozm_hloubka_ks_cm"/>
 *         &lt;element ref="{}rozm_vyska_ks_cm"/>
 *         &lt;element ref="{}hmot_vaha_netto_ks_g"/>
 *         &lt;element ref="{}hmot_vaha_brutto_ks_g"/>
 *         &lt;element ref="{}hmot_vaha_subkar_g"/>
 *         &lt;element ref="{}hmot_vaha_kar_g"/>
 *         &lt;element ref="{}hmot_vaha_vrstva_g"/>
 *         &lt;element ref="{}hmot_vaha_paleta_g"/>
 *         &lt;element ref="{}rozm_delka_subkar_cm"/>
 *         &lt;element ref="{}rozm_hloubka_subkar_cm"/>
 *         &lt;element ref="{}rozm_vyska_subkar_cm"/>
 *         &lt;element ref="{}rozm_delka_kar_cm"/>
 *         &lt;element ref="{}rozm_hloubka_kar_cm"/>
 *         &lt;element ref="{}rozm_vyska_kar_cm"/>
 *         &lt;element ref="{}rozm_delka_vrstva_cm"/>
 *         &lt;element ref="{}rozm_hloubka_vrstva_cm"/>
 *         &lt;element ref="{}rozm_vyska_vrstva_cm"/>
 *         &lt;element ref="{}rozm_delka_paleta_cm"/>
 *         &lt;element ref="{}rozm_hloubka_paleta_cm"/>
 *         &lt;element ref="{}rozm_vyska_paleta_cm"/>
 *         &lt;element ref="{}pocet_kar_vrstva"/>
 *         &lt;element ref="{}pocet_vrstva_paleta"/>
 *         &lt;element ref="{}pocet_kar_paleta"/>
 *         &lt;element ref="{}pocet_subkar_kar"/>
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
    "pocetKsSubkar",
    "pocetKsKar",
    "pocetKsVrstva",
    "pocetKsPaleta",
    "rozmDelkaKsCm",
    "rozmHloubkaKsCm",
    "rozmVyskaKsCm",
    "hmotVahaNettoKsG",
    "hmotVahaBruttoKsG",
    "hmotVahaSubkarG",
    "hmotVahaKarG",
    "hmotVahaVrstvaG",
    "hmotVahaPaletaG",
    "rozmDelkaSubkarCm",
    "rozmHloubkaSubkarCm",
    "rozmVyskaSubkarCm",
    "rozmDelkaKarCm",
    "rozmHloubkaKarCm",
    "rozmVyskaKarCm",
    "rozmDelkaVrstvaCm",
    "rozmHloubkaVrstvaCm",
    "rozmVyskaVrstvaCm",
    "rozmDelkaPaletaCm",
    "rozmHloubkaPaletaCm",
    "rozmVyskaPaletaCm",
    "pocetKarVrstva",
    "pocetVrstvaPaleta",
    "pocetKarPaleta",
    "pocetSubkarKar"
})
@XmlRootElement(name = "LOGISTIC_DATA")
public class LOGISTICDATA {

    @XmlElement(name = "pocet_ks_subkar", required = true)
    protected BigInteger pocetKsSubkar;
    @XmlElement(name = "pocet_ks_kar", required = true)
    protected BigInteger pocetKsKar;
    @XmlElement(name = "pocet_ks_vrstva", required = true)
    protected BigInteger pocetKsVrstva;
    @XmlElement(name = "pocet_ks_paleta", required = true)
    protected BigInteger pocetKsPaleta;
    @XmlElement(name = "rozm_delka_ks_cm", required = true)
    protected BigDecimal rozmDelkaKsCm;
    @XmlElement(name = "rozm_hloubka_ks_cm", required = true)
    protected BigDecimal rozmHloubkaKsCm;
    @XmlElement(name = "rozm_vyska_ks_cm", required = true)
    protected BigDecimal rozmVyskaKsCm;
    @XmlElement(name = "hmot_vaha_netto_ks_g", required = true)
    protected BigDecimal hmotVahaNettoKsG;
    @XmlElement(name = "hmot_vaha_brutto_ks_g", required = true)
    protected BigDecimal hmotVahaBruttoKsG;
    @XmlElement(name = "hmot_vaha_subkar_g", required = true)
    protected BigDecimal hmotVahaSubkarG;
    @XmlElement(name = "hmot_vaha_kar_g", required = true)
    protected BigDecimal hmotVahaKarG;
    @XmlElement(name = "hmot_vaha_vrstva_g", required = true)
    protected BigDecimal hmotVahaVrstvaG;
    @XmlElement(name = "hmot_vaha_paleta_g", required = true)
    protected BigDecimal hmotVahaPaletaG;
    @XmlElement(name = "rozm_delka_subkar_cm", required = true)
    protected BigDecimal rozmDelkaSubkarCm;
    @XmlElement(name = "rozm_hloubka_subkar_cm", required = true)
    protected BigDecimal rozmHloubkaSubkarCm;
    @XmlElement(name = "rozm_vyska_subkar_cm", required = true)
    protected BigDecimal rozmVyskaSubkarCm;
    @XmlElement(name = "rozm_delka_kar_cm", required = true)
    protected BigDecimal rozmDelkaKarCm;
    @XmlElement(name = "rozm_hloubka_kar_cm", required = true)
    protected BigDecimal rozmHloubkaKarCm;
    @XmlElement(name = "rozm_vyska_kar_cm", required = true)
    protected BigDecimal rozmVyskaKarCm;
    @XmlElement(name = "rozm_delka_vrstva_cm", required = true)
    protected BigDecimal rozmDelkaVrstvaCm;
    @XmlElement(name = "rozm_hloubka_vrstva_cm", required = true)
    protected BigDecimal rozmHloubkaVrstvaCm;
    @XmlElement(name = "rozm_vyska_vrstva_cm", required = true)
    protected BigDecimal rozmVyskaVrstvaCm;
    @XmlElement(name = "rozm_delka_paleta_cm", required = true)
    protected BigDecimal rozmDelkaPaletaCm;
    @XmlElement(name = "rozm_hloubka_paleta_cm", required = true)
    protected BigDecimal rozmHloubkaPaletaCm;
    @XmlElement(name = "rozm_vyska_paleta_cm", required = true)
    protected BigDecimal rozmVyskaPaletaCm;
    @XmlElement(name = "pocet_kar_vrstva", required = true)
    protected BigInteger pocetKarVrstva;
    @XmlElement(name = "pocet_vrstva_paleta", required = true)
    protected BigInteger pocetVrstvaPaleta;
    @XmlElement(name = "pocet_kar_paleta", required = true)
    protected BigInteger pocetKarPaleta;
    @XmlElement(name = "pocet_subkar_kar", required = true)
    protected BigInteger pocetSubkarKar;

    /**
     * Gets the value of the pocetKsSubkar property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPocetKsSubkar() {
        return pocetKsSubkar;
    }

    /**
     * Sets the value of the pocetKsSubkar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPocetKsSubkar(BigInteger value) {
        this.pocetKsSubkar = value;
    }

    /**
     * Gets the value of the pocetKsKar property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPocetKsKar() {
        return pocetKsKar;
    }

    /**
     * Sets the value of the pocetKsKar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPocetKsKar(BigInteger value) {
        this.pocetKsKar = value;
    }

    /**
     * Gets the value of the pocetKsVrstva property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPocetKsVrstva() {
        return pocetKsVrstva;
    }

    /**
     * Sets the value of the pocetKsVrstva property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPocetKsVrstva(BigInteger value) {
        this.pocetKsVrstva = value;
    }

    /**
     * Gets the value of the pocetKsPaleta property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPocetKsPaleta() {
        return pocetKsPaleta;
    }

    /**
     * Sets the value of the pocetKsPaleta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPocetKsPaleta(BigInteger value) {
        this.pocetKsPaleta = value;
    }

    /**
     * Gets the value of the rozmDelkaKsCm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRozmDelkaKsCm() {
        return rozmDelkaKsCm;
    }

    /**
     * Sets the value of the rozmDelkaKsCm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRozmDelkaKsCm(BigDecimal value) {
        this.rozmDelkaKsCm = value;
    }

    /**
     * Gets the value of the rozmHloubkaKsCm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRozmHloubkaKsCm() {
        return rozmHloubkaKsCm;
    }

    /**
     * Sets the value of the rozmHloubkaKsCm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRozmHloubkaKsCm(BigDecimal value) {
        this.rozmHloubkaKsCm = value;
    }

    /**
     * Gets the value of the rozmVyskaKsCm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRozmVyskaKsCm() {
        return rozmVyskaKsCm;
    }

    /**
     * Sets the value of the rozmVyskaKsCm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRozmVyskaKsCm(BigDecimal value) {
        this.rozmVyskaKsCm = value;
    }

    /**
     * Gets the value of the hmotVahaNettoKsG property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHmotVahaNettoKsG() {
        return hmotVahaNettoKsG;
    }

    /**
     * Sets the value of the hmotVahaNettoKsG property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHmotVahaNettoKsG(BigDecimal value) {
        this.hmotVahaNettoKsG = value;
    }

    /**
     * Gets the value of the hmotVahaBruttoKsG property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHmotVahaBruttoKsG() {
        return hmotVahaBruttoKsG;
    }

    /**
     * Sets the value of the hmotVahaBruttoKsG property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHmotVahaBruttoKsG(BigDecimal value) {
        this.hmotVahaBruttoKsG = value;
    }

    /**
     * Gets the value of the hmotVahaSubkarG property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHmotVahaSubkarG() {
        return hmotVahaSubkarG;
    }

    /**
     * Sets the value of the hmotVahaSubkarG property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHmotVahaSubkarG(BigDecimal value) {
        this.hmotVahaSubkarG = value;
    }

    /**
     * Gets the value of the hmotVahaKarG property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHmotVahaKarG() {
        return hmotVahaKarG;
    }

    /**
     * Sets the value of the hmotVahaKarG property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHmotVahaKarG(BigDecimal value) {
        this.hmotVahaKarG = value;
    }

    /**
     * Gets the value of the hmotVahaVrstvaG property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHmotVahaVrstvaG() {
        return hmotVahaVrstvaG;
    }

    /**
     * Sets the value of the hmotVahaVrstvaG property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHmotVahaVrstvaG(BigDecimal value) {
        this.hmotVahaVrstvaG = value;
    }

    /**
     * Gets the value of the hmotVahaPaletaG property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHmotVahaPaletaG() {
        return hmotVahaPaletaG;
    }

    /**
     * Sets the value of the hmotVahaPaletaG property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHmotVahaPaletaG(BigDecimal value) {
        this.hmotVahaPaletaG = value;
    }

    /**
     * Gets the value of the rozmDelkaSubkarCm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRozmDelkaSubkarCm() {
        return rozmDelkaSubkarCm;
    }

    /**
     * Sets the value of the rozmDelkaSubkarCm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRozmDelkaSubkarCm(BigDecimal value) {
        this.rozmDelkaSubkarCm = value;
    }

    /**
     * Gets the value of the rozmHloubkaSubkarCm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRozmHloubkaSubkarCm() {
        return rozmHloubkaSubkarCm;
    }

    /**
     * Sets the value of the rozmHloubkaSubkarCm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRozmHloubkaSubkarCm(BigDecimal value) {
        this.rozmHloubkaSubkarCm = value;
    }

    /**
     * Gets the value of the rozmVyskaSubkarCm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRozmVyskaSubkarCm() {
        return rozmVyskaSubkarCm;
    }

    /**
     * Sets the value of the rozmVyskaSubkarCm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRozmVyskaSubkarCm(BigDecimal value) {
        this.rozmVyskaSubkarCm = value;
    }

    /**
     * Gets the value of the rozmDelkaKarCm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRozmDelkaKarCm() {
        return rozmDelkaKarCm;
    }

    /**
     * Sets the value of the rozmDelkaKarCm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRozmDelkaKarCm(BigDecimal value) {
        this.rozmDelkaKarCm = value;
    }

    /**
     * Gets the value of the rozmHloubkaKarCm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRozmHloubkaKarCm() {
        return rozmHloubkaKarCm;
    }

    /**
     * Sets the value of the rozmHloubkaKarCm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRozmHloubkaKarCm(BigDecimal value) {
        this.rozmHloubkaKarCm = value;
    }

    /**
     * Gets the value of the rozmVyskaKarCm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRozmVyskaKarCm() {
        return rozmVyskaKarCm;
    }

    /**
     * Sets the value of the rozmVyskaKarCm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRozmVyskaKarCm(BigDecimal value) {
        this.rozmVyskaKarCm = value;
    }

    /**
     * Gets the value of the rozmDelkaVrstvaCm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRozmDelkaVrstvaCm() {
        return rozmDelkaVrstvaCm;
    }

    /**
     * Sets the value of the rozmDelkaVrstvaCm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRozmDelkaVrstvaCm(BigDecimal value) {
        this.rozmDelkaVrstvaCm = value;
    }

    /**
     * Gets the value of the rozmHloubkaVrstvaCm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRozmHloubkaVrstvaCm() {
        return rozmHloubkaVrstvaCm;
    }

    /**
     * Sets the value of the rozmHloubkaVrstvaCm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRozmHloubkaVrstvaCm(BigDecimal value) {
        this.rozmHloubkaVrstvaCm = value;
    }

    /**
     * Gets the value of the rozmVyskaVrstvaCm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRozmVyskaVrstvaCm() {
        return rozmVyskaVrstvaCm;
    }

    /**
     * Sets the value of the rozmVyskaVrstvaCm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRozmVyskaVrstvaCm(BigDecimal value) {
        this.rozmVyskaVrstvaCm = value;
    }

    /**
     * Gets the value of the rozmDelkaPaletaCm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRozmDelkaPaletaCm() {
        return rozmDelkaPaletaCm;
    }

    /**
     * Sets the value of the rozmDelkaPaletaCm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRozmDelkaPaletaCm(BigDecimal value) {
        this.rozmDelkaPaletaCm = value;
    }

    /**
     * Gets the value of the rozmHloubkaPaletaCm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRozmHloubkaPaletaCm() {
        return rozmHloubkaPaletaCm;
    }

    /**
     * Sets the value of the rozmHloubkaPaletaCm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRozmHloubkaPaletaCm(BigDecimal value) {
        this.rozmHloubkaPaletaCm = value;
    }

    /**
     * Gets the value of the rozmVyskaPaletaCm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRozmVyskaPaletaCm() {
        return rozmVyskaPaletaCm;
    }

    /**
     * Sets the value of the rozmVyskaPaletaCm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRozmVyskaPaletaCm(BigDecimal value) {
        this.rozmVyskaPaletaCm = value;
    }

    /**
     * Gets the value of the pocetKarVrstva property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPocetKarVrstva() {
        return pocetKarVrstva;
    }

    /**
     * Sets the value of the pocetKarVrstva property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPocetKarVrstva(BigInteger value) {
        this.pocetKarVrstva = value;
    }

    /**
     * Gets the value of the pocetVrstvaPaleta property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPocetVrstvaPaleta() {
        return pocetVrstvaPaleta;
    }

    /**
     * Sets the value of the pocetVrstvaPaleta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPocetVrstvaPaleta(BigInteger value) {
        this.pocetVrstvaPaleta = value;
    }

    /**
     * Gets the value of the pocetKarPaleta property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPocetKarPaleta() {
        return pocetKarPaleta;
    }

    /**
     * Sets the value of the pocetKarPaleta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPocetKarPaleta(BigInteger value) {
        this.pocetKarPaleta = value;
    }

    /**
     * Gets the value of the pocetSubkarKar property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPocetSubkarKar() {
        return pocetSubkarKar;
    }

    /**
     * Sets the value of the pocetSubkarKar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPocetSubkarKar(BigInteger value) {
        this.pocetSubkarKar = value;
    }

}
