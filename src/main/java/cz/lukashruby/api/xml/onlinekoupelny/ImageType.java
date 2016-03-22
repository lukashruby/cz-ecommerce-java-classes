package cz.lukashruby.api.xml.onlinekoupelny;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageType", propOrder = {"value"})
public class ImageType {
    @XmlValue
    @XmlSchemaType(name = "anyURI")
    protected String value;
    @XmlAttribute(name = "modification")
    protected String modification;

    public String getValue() {
        return this.value;
    }


    public void setValue(String value) {
        this.value = value;
    }


    public String getModification() {
        return this.modification;
    }


    public void setModification(String value) {
        this.modification = value;
    }
}