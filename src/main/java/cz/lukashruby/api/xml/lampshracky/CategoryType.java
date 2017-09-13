package cz.lukashruby.api.xml.lampshracky;

import lombok.Data;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "categoryType", propOrder = {
        "title"
})
@Data
public class CategoryType {

    @XmlElement(required = true)
    protected String title;
    @XmlAttribute(name = "cat_id")
    protected String catId;
    @XmlAttribute(name = "parent_id")
    protected String parentId;
}
