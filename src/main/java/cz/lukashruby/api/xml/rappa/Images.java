package cz.lukashruby.api.xml.rappa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Images", propOrder = {
        "content"
})
public class Images {

    @XmlElementRef(name = "IMAGE", type = JAXBElement.class, required = false)
    @XmlMixed
    protected List<String> content;

    public List<String> getContent() {
        if (content == null) {
            content = new ArrayList<>();
        }
        return this.content;
    }

}
