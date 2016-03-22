package cz.lukashruby.api.xml.shoptet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "parameter"
})
public class PARAMETERS {

    @XmlElement(name = "PARAMETER")
    protected List<PARAMETER> parameter;


    public List<PARAMETER> getPARAMETER() {
        if (parameter == null) {
            parameter = new ArrayList<PARAMETER>();
        }
        return this.parameter;
    }





}