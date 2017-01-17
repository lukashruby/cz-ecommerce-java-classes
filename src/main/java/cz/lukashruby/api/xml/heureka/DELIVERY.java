
package cz.lukashruby.api.xml.heureka;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigInteger;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "deliveryid",
        "deliveryprice",
        "deliverypricecod"
})
@XmlRootElement(name = "DELIVERY")
@Data
public class DELIVERY {
    @XmlElement(name = "DELIVERY_ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String deliveryid;
    @XmlElement(name = "DELIVERY_PRICE", required = true)
    protected BigInteger deliveryprice;
    @XmlElement(name = "DELIVERY_PRICE_COD", required = true)
    protected BigInteger deliverypricecod;
}
