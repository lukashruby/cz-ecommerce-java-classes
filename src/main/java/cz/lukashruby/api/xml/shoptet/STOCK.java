package cz.lukashruby.api.xml.shoptet;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "amount",
        "minimalamount"
})
public class STOCK {

    @XmlElement(name = "AMOUNT")
    protected byte amount;
    @XmlElement(name = "MINIMAL_AMOUNT")
    protected byte minimalamount;


    public byte getAMOUNT() {
        return amount;
    }


    public void setAMOUNT(byte value) {
        this.amount = value;
    }


    public byte getMINIMALAMOUNT() {
        return minimalamount;
    }


    public void setMINIMALAMOUNT(byte value) {
        this.minimalamount = value;
    }

}