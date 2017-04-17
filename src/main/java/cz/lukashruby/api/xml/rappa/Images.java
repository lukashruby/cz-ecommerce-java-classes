package cz.lukashruby.api.xml.rappa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Images", propOrder = {
        "content"
})
public class Images {

    @XmlElement(name = "IMAGE", required = false)
    protected List<String> content;

    public List<String> getContent() {
        if (content == null) {
            content = new ArrayList<>();
        }
        return this.content;
    }

}
