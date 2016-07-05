
package cz.lukashruby.api.xml.vsenavareni;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "shopitem"
})
@XmlRootElement(name = "SHOP")
public class SHOP {

    @XmlElement(name = "SHOPITEM", required = true)
    protected List<SHOPITEM> shopitem;

    public List<SHOPITEM> getSHOPITEM() {
        if (shopitem == null) {
            shopitem = new ArrayList<SHOPITEM>();
        }
        return this.shopitem;
    }
}
