
package cz.lukashruby.api.xml.shoptet;

import cz.lukashruby.api.xml.shoptet.adapters.CDataAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "shopitem"
})
@XmlRootElement(name = "SHOP")
public class SHOP {

    @XmlElement(name = "SHOPITEM")
    protected List<SHOPITEM> shopitem;

    public List<SHOPITEM> getSHOPITEM() {
        if (shopitem == null) {
            shopitem = new ArrayList<SHOPITEM>();
        }
        return this.shopitem;
    }

    public void setShopitem(List<SHOPITEM> shopitem) {
        this.shopitem = shopitem;
    }



}
