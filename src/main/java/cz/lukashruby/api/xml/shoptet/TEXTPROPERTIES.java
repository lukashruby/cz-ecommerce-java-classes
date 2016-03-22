package cz.lukashruby.api.xml.shoptet;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "textproperty"
})
public class TEXTPROPERTIES {

    @XmlElement(name = "TEXT_PROPERTY")
    protected List<TEXTPROPERTY> textproperty;


    public List<TEXTPROPERTY> getTEXTPROPERTY() {
        if (textproperty == null) {
            textproperty = new ArrayList<TEXTPROPERTY>();
        }
        return this.textproperty;
    }


}
