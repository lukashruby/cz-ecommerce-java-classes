package cz.lukashruby.api.xml.onlinekoupelny;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseDataType", propOrder = {"dateTime", "status", "count", "productSet"})
public class ResponseDataType {
    @XmlElement(name = "DateTime", required = true)
    protected String dateTime;
    @XmlElement(name = "Status", required = true)
    protected StatusType status;
    @XmlElement(name = "Count")
    protected byte count;
    @XmlElement(name = "ProductSet", required = true)
    protected ProductSetType productSet;

    public String getDateTime() {
        return this.dateTime;
    }


    public void setDateTime(String value) {
        this.dateTime = value;
    }


    public StatusType getStatus() {
        return this.status;
    }


    public void setStatus(StatusType value) {
        this.status = value;
    }


    public byte getCount() {
        return this.count;
    }


    public void setCount(byte value) {
        this.count = value;
    }


    public ProductSetType getProductSet() {
        return this.productSet;
    }


    public void setProductSet(ProductSetType value) {
        this.productSet = value;
    }
}