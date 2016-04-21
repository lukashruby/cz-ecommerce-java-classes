
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
    "param"
})
@XmlRootElement(name = "PARAMS")
public class PARAMS {

    @XmlElement(name = "PARAM")
    protected List<PARAM> param;

    public List<PARAM> getPARAM() {
        if (param == null) {
            param = new ArrayList<PARAM>();
        }
        return this.param;
    }

}
