package cz.lukashruby.api.xml.shoptet;


import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "image"
})
public class IMAGES {

    @XmlElement(name = "IMAGE")
    @XmlSchemaType(name = "anyURI")
    protected List<String> image;

    public List<String> getIMAGE() {
        if (image == null) {
            image = new ArrayList<String>();
        }
        return this.image;
    }

    public void setImage(List<String> image) {
        this.image = image;
    }
}

