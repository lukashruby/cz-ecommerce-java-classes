package cz.lukashruby.api.xml.shoptet;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "variant"
})
public class VARIANTS {

    @XmlElement(name = "VARIANT")
    protected List<VARIANT> variant;


    public List<VARIANT> getVARIANT() {
        if (variant == null) {
            variant = new ArrayList<VARIANT>();
        }
        return this.variant;
    }

    public void setVARIANT(List<VARIANT> VARIANT) {
        this.variant = VARIANT;
    }





}