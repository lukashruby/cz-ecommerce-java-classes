
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
        "image"
})
@XmlRootElement(name = "IMAGES")
public class IMAGES {

    @XmlElement(name = "IMAGE")
    protected List<IMAGE> image;

    public List<IMAGE> getIMAGE() {
        if (image == null) {
            image = new ArrayList<IMAGE>();
        }
        return this.image;
    }

}
