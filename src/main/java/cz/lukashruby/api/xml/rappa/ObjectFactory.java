package cz.lukashruby.api.xml.rappa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


@XmlRegistry
public class ObjectFactory {

    private final static QName _SHOP_QNAME = new QName("", "SHOP");
    private final static QName _IMAGESTypeIMAGE_QNAME = new QName("", "IMAGE");

    public ObjectFactory() {
    }

    public Shop createSHOPType() {
        return new Shop();
    }

    public Images createIMAGESType() {
        return new Images();
    }

    public Item createSHOPITEMType() {
        return new Item();
    }

    @XmlElementDecl(namespace = "", name = "SHOP")
    public JAXBElement<Shop> createSHOP(Shop value) {
        return new JAXBElement<Shop>(_SHOP_QNAME, Shop.class, null, value);
    }

    @XmlElementDecl(namespace = "", name = "IMAGE", scope = Images.class)
    public JAXBElement<String> createIMAGESTypeIMAGE(String value) {
        return new JAXBElement<String>(_IMAGESTypeIMAGE_QNAME, String.class, Images.class, value);
    }

}
