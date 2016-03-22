package cz.lukashruby.api.xml.onlinekoupelny;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariantsType", propOrder = {"variant"})
public class VariantsType {
    @XmlElement(name = "Variant")
    protected List<VariantType> variant;

    public List<VariantType> getVariant() {
        if (this.variant == null) {
            this.variant = new ArrayList();
        }
        return this.variant;
    }
}