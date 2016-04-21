
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
        "category"
})
@XmlRootElement(name = "CATEGORIES")
public class CATEGORIES {

    @XmlElement(name = "CATEGORY", required = true)
    protected List<CATEGORY> category;

    public List<CATEGORY> getCATEGORY() {
        if (category == null) {
            category = new ArrayList<CATEGORY>();
        }
        return this.category;
    }

}
