package cz.lukashruby.api.xml.onlinekoupelny;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusType", propOrder = {"code", "message"})
public class StatusType {
    @XmlElement(name = "Code")
    protected short code;
    @XmlElement(name = "Message", required = true)
    protected String message;

    public short getCode() {
        return this.code;
    }


    public void setCode(short value) {
        this.code = value;
    }


    public String getMessage() {
        return this.message;
    }


    public void setMessage(String value) {
        this.message = value;
    }
}
