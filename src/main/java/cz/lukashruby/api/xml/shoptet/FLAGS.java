package cz.lukashruby.api.xml.shoptet;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "action",
        "_new",
        "tip"
})
public class FLAGS {

    @XmlElement(name = "ACTION")
    protected byte action;
    @XmlElement(name = "NEW")
    protected byte _new;
    @XmlElement(name = "TIP")
    protected byte tip;

    public byte getACTION() {
        return action;
    }

    public void setACTION(byte value) {
        this.action = value;
    }

    public byte getNEW() {
        return _new;
    }

    public void setNEW(byte value) {
        this._new = value;
    }

    public byte getTIP() {
        return tip;
    }

    public void setTIP(byte value) {
        this.tip = value;
    }

}
