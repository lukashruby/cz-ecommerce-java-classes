
package cz.lukashruby.api.xml.nellys;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "PRICE")
public class PRICE {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "level", required = true)
    protected BigInteger level;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigInteger getLevel() {
        return level;
    }

    public void setLevel(BigInteger value) {
        this.level = value;
    }

}
