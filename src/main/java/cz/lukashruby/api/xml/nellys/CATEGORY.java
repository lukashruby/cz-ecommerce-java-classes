
package cz.lukashruby.api.xml.nellys;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "content"
})
@XmlRootElement(name = "CATEGORY")
public class CATEGORY {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "id", required = true)
    protected BigInteger id;
    @XmlAttribute(name = "index", required = true)
    protected BigInteger index;
    @XmlAttribute(name = "main")
    protected BigInteger main;

    public String getContent() {
        return content;
    }

    public void setContent(String value) {
        this.content = value;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger value) {
        this.id = value;
    }

    public BigInteger getIndex() {
        return index;
    }

    public void setIndex(BigInteger value) {
        this.index = value;
    }

    public BigInteger getMain() {
        return main;
    }

    public void setMain(BigInteger value) {
        this.main = value;
    }

}
