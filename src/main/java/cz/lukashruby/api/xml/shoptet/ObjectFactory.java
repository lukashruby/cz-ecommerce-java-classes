
package cz.lukashruby.api.xml.shoptet;

import javax.xml.bind.annotation.XmlRegistry;


@XmlRegistry
public class ObjectFactory {


    public ObjectFactory() {
    }


    public SHOP createSHOP() {
        return new SHOP();
    }


    public SHOPITEM createSHOPSHOPITEM() {
        return new SHOPITEM();
    }


    public VARIANTS createSHOPSHOPITEMVARIANTS() {
        return new VARIANTS();
    }


    public VARIANT createSHOPSHOPITEMVARIANTSVARIANT() {
        return new VARIANT();
    }


    public PARAMETERS createSHOPSHOPITEMVARIANTSVARIANTPARAMETERS() {
        return new PARAMETERS();
    }


    public TEXTPROPERTIES createSHOPSHOPITEMTEXTPROPERTIES() {
        return new TEXTPROPERTIES();
    }


    public CATEGORIES createSHOPSHOPITEMCATEGORIES() {
        return new CATEGORIES();
    }


    public IMAGES createSHOPSHOPITEMIMAGES() {
        return new IMAGES();
    }


    public RELATEDPRODUCTS createSHOPSHOPITEMRELATEDPRODUCTS() {
        return new RELATEDPRODUCTS();
    }


    public ALTERNATIVEPRODUCTS createSHOPSHOPITEMALTERNATIVEPRODUCTS() {
        return new ALTERNATIVEPRODUCTS();
    }


    public FLAGS createSHOPSHOPITEMFLAGS() {
        return new FLAGS();
    }


    public STOCK createSHOPSHOPITEMSTOCK() {
        return new STOCK();
    }


    public PARAMETER createSHOPSHOPITEMVARIANTSVARIANTPARAMETERSPARAMETER() {
        return new PARAMETER();
    }


    public TEXTPROPERTY createSHOPSHOPITEMTEXTPROPERTIESTEXTPROPERTY() {
        return new TEXTPROPERTY();
    }

}
