
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
    "price"
})
@XmlRootElement(name = "PRICES")
public class PRICES {

    @XmlElement(name = "PRICE", required = true)
    protected List<PRICE> price;

    public List<PRICE> getPRICE() {
        if (price == null) {
            price = new ArrayList<PRICE>();
        }
        return this.price;
    }

}
