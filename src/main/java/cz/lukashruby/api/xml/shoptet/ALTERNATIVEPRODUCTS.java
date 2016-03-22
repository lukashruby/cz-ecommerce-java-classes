package cz.lukashruby.api.xml.shoptet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "code"
})
public class ALTERNATIVEPRODUCTS {

    @XmlElement(name = "CODE")
    protected List<String> code;

    public List<String> getCODE() {
        if (code == null) {
            code = new ArrayList<String>();
        }
        return this.code;
    }

}