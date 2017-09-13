package cz.lukashruby.api.xml.lampshracky;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _Myshop_QNAME = new QName("", "myshop");

    public ObjectFactory() {
    }

    public MyshopType createMyshopType() {
        return new MyshopType();
    }

    public CategoryType createCategoryType() {
        return new CategoryType();
    }

    public CategoriesType createCategoriesType() {
        return new CategoriesType();
    }

    public ItemType createItemType() {
        return new ItemType();
    }

    public ItemsType createItemsType() {
        return new ItemsType();
    }

    @XmlElementDecl(namespace = "", name = "myshop")
    public JAXBElement<MyshopType> createMyshop(MyshopType value) {
        return new JAXBElement<MyshopType>(_Myshop_QNAME, MyshopType.class, null, value);
    }

}
