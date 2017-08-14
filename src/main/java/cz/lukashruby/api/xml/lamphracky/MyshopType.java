package cz.lukashruby.api.xml.lamphracky;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "myshopType", propOrder = {
        "categories",
        "items"
})
public class MyshopType {

    @XmlElement(required = true)
    protected CategoriesType categories;
    @XmlElement(required = true)
    protected ItemsType items;

    public CategoriesType getCategories() {
        return categories;
    }

    public void setCategories(CategoriesType value) {
        this.categories = value;
    }

    public ItemsType getItems() {
        return items;
    }

    public void setItems(ItemsType value) {
        this.items = value;
    }

}
