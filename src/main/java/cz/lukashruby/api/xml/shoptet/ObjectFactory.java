
package cz.lukashruby.api.xml.shoptet;

import javax.xml.bind.annotation.XmlRegistry;


@XmlRegistry
public class ObjectFactory {


    public ObjectFactory() {
    }


    public SHOP createSHOP() {
        return new SHOP();
    }


    public SHOP.SHOPITEM createSHOPSHOPITEM() {
        return new SHOP.SHOPITEM();
    }


    public SHOP.SHOPITEM.VARIANTS createSHOPSHOPITEMVARIANTS() {
        return new SHOP.SHOPITEM.VARIANTS();
    }


    public SHOP.SHOPITEM.VARIANTS.VARIANT createSHOPSHOPITEMVARIANTSVARIANT() {
        return new SHOP.SHOPITEM.VARIANTS.VARIANT();
    }


    public SHOP.SHOPITEM.VARIANTS.VARIANT.PARAMETERS createSHOPSHOPITEMVARIANTSVARIANTPARAMETERS() {
        return new SHOP.SHOPITEM.VARIANTS.VARIANT.PARAMETERS();
    }


    public SHOP.SHOPITEM.TEXTPROPERTIES createSHOPSHOPITEMTEXTPROPERTIES() {
        return new SHOP.SHOPITEM.TEXTPROPERTIES();
    }


    public SHOP.SHOPITEM.CATEGORIES createSHOPSHOPITEMCATEGORIES() {
        return new SHOP.SHOPITEM.CATEGORIES();
    }


    public SHOP.SHOPITEM.IMAGES createSHOPSHOPITEMIMAGES() {
        return new SHOP.SHOPITEM.IMAGES();
    }


    public SHOP.SHOPITEM.RELATEDPRODUCTS createSHOPSHOPITEMRELATEDPRODUCTS() {
        return new SHOP.SHOPITEM.RELATEDPRODUCTS();
    }


    public SHOP.SHOPITEM.ALTERNATIVEPRODUCTS createSHOPSHOPITEMALTERNATIVEPRODUCTS() {
        return new SHOP.SHOPITEM.ALTERNATIVEPRODUCTS();
    }


    public SHOP.SHOPITEM.FLAGS createSHOPSHOPITEMFLAGS() {
        return new SHOP.SHOPITEM.FLAGS();
    }


    public SHOP.SHOPITEM.STOCK createSHOPSHOPITEMSTOCK() {
        return new SHOP.SHOPITEM.STOCK();
    }


    public SHOP.SHOPITEM.VARIANTS.VARIANT.PARAMETERS.PARAMETER createSHOPSHOPITEMVARIANTSVARIANTPARAMETERSPARAMETER() {
        return new SHOP.SHOPITEM.VARIANTS.VARIANT.PARAMETERS.PARAMETER();
    }


    public SHOP.SHOPITEM.TEXTPROPERTIES.TEXTPROPERTY createSHOPSHOPITEMTEXTPROPERTIESTEXTPROPERTY() {
        return new SHOP.SHOPITEM.TEXTPROPERTIES.TEXTPROPERTY();
    }

}
