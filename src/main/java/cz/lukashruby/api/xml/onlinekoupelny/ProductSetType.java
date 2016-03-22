package cz.lukashruby.api.xml.onlinekoupelny;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSetType", propOrder = {"product"})
public class ProductSetType {
    @XmlElement(name = "Product")
    protected List<ProductType> product;

    public List<ProductType> getProduct() {
        if (this.product == null) {
            this.product = new ArrayList();
        }
        return this.product;
    }
}