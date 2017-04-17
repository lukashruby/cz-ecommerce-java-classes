package cz.lukashruby.api.xml.rappa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Shop", propOrder = {
        "shopitem"
})
public class Shop {

    @XmlElement(name = "SHOPITEM")
    protected List<Item> shopitem;

    public List<Item> getSHOPITEM() {
        if (shopitem == null) {
            shopitem = new ArrayList<Item>();
        }
        return this.shopitem;
    }

}
