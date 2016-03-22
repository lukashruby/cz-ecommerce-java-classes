package cz.lukashruby.api.xml.onlinekoupelny;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedType", propOrder = {"content"})
public class RelatedType {
    @XmlElementRef(name = "Item", type = JAXBElement.class, required = false)
    @XmlMixed
    protected List<Serializable> content;

    public List<Serializable> getContent() {
        if (this.content == null) {
            this.content = new ArrayList();
        }
        return this.content;
    }
}