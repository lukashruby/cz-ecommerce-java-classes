
package cz.lukashruby.api.xml.nellys;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pricevat"
})
@XmlRootElement(name = "PRICES_VAT")
public class PRICESVAT {

    @XmlElement(name = "PRICE_VAT", required = true)
    protected List<PRICEVAT> pricevat;

    public List<PRICEVAT> getPRICEVAT() {
        if (pricevat == null) {
            pricevat = new ArrayList<PRICEVAT>();
        }
        return this.pricevat;
    }

}
