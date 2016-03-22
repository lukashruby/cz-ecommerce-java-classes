package cz.lukashruby.api.xml.onlinekoupelny;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemType", propOrder = {"producer", "catalog"})
public class ItemType {
    @XmlElement(name = "Producer", required = true)
    protected String producer;
    @XmlElement(name = "Catalog", required = true)
    protected String catalog;

    public String getProducer() {
        return this.producer;
    }

    public void setProducer(String value) {
        this.producer = value;
    }


    public String getCatalog() {
        return this.catalog;
    }


    public void setCatalog(String value) {
        this.catalog = value;
    }
}