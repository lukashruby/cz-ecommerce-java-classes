package cz.lukashruby.api.xml.lampshracky;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "myshopType", propOrder = {
        "categories",
        "items"
})
@Data
public class MyshopType {

    @XmlElement(required = true)
    protected CategoriesType categories;
    @XmlElement(required = true)
    protected ItemsType items;
}
