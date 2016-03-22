package cz.lukashruby.api.xml.shoptet;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "category"
})
public class CATEGORIES {

    @XmlElement(name = "CATEGORY")
    protected List<String> category;

    public List<String> getCATEGORY() {
        if (category == null) {
            category = new ArrayList<String>();
        }
        return this.category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }
}
