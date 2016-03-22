package cz.lukashruby.api.xml.onlinekoupelny;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImagesType", propOrder = {"image"})
public class ImagesType {
    @XmlElement(name = "Image")
    protected List<ImageType> image;

    public List<ImageType> getImage() {
        if (this.image == null) {
            this.image = new ArrayList();
        }
        return this.image;
    }
}