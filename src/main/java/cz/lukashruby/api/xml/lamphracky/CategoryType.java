package cz.lukashruby.api.xml.lamphracky;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "categoryType", propOrder = {
        "title"
})
public class CategoryType {

    @XmlElement(required = true)
    protected String title;
    @XmlAttribute(name = "cat_id")
    protected String catId;
    @XmlAttribute(name = "parent_id")
    protected String parentId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String value) {
        this.catId = value;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String value) {
        this.parentId = value;
    }

}
