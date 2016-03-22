package cz.lukashruby.api.xml.shoptet;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "name",
        "value"
})
public class TEXTPROPERTY {

    @XmlElement(name = "NAME", required = true)
    protected String name;
    @XmlElement(name = "VALUE", required = true)
    protected String value;


    public String getNAME() {
        return name;
    }


    public void setNAME(String value) {
        this.name = value;
    }


    public String getVALUE() {
        return value;
    }


    public void setVALUE(String value) {
        this.value = value;
    }

}