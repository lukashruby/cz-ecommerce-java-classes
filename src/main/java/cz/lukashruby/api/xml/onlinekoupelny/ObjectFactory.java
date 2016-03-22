package cz.lukashruby.api.xml.onlinekoupelny;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


@XmlRegistry
public class ObjectFactory {
    private static final QName _ResponseData_QNAME = new QName("", "ResponseData");
    private static final QName _ProductTypeVariantsVariant_QNAME = new QName("", "Variant");
    private static final QName _RelatedTypeItem_QNAME = new QName("", "Item");


    public ProductType createProductType() {
        return new ProductType();
    }


    public ResponseDataType createResponseDataType() {
        return new ResponseDataType();
    }


    public ProductSetType createProductSetType() {
        return new ProductSetType();
    }


    public VariantsType createVariantsType() {
        return new VariantsType();
    }


    public RelatedType createRelatedType() {
        return new RelatedType();
    }


    public StatusType createStatusType() {
        return new StatusType();
    }


    public ItemType createItemType() {
        return new ItemType();
    }


    public VariantType createVariantType() {
        return new VariantType();
    }


    public ImagesType createImagesType() {
        return new ImagesType();
    }


    public ImageType createImageType() {
        return new ImageType();
    }


    public VariantsType createProductTypeVariants() {
        return new VariantsType();
    }


    @XmlElementDecl(namespace = "", name = "ResponseData")
    public JAXBElement<ResponseDataType> createResponseData(ResponseDataType value) {
        return new JAXBElement(_ResponseData_QNAME, ResponseDataType.class, null, value);
    }


    @XmlElementDecl(namespace = "", name = "Variant", scope = VariantsType.class)
    public JAXBElement<VariantType> createProductTypeVariantsVariant(VariantType value) {
        return new JAXBElement(_ProductTypeVariantsVariant_QNAME, VariantType.class, VariantsType.class, value);
    }


    @XmlElementDecl(namespace = "", name = "Item", scope = RelatedType.class)
    public JAXBElement<ItemType> createRelatedTypeItem(ItemType value) {
        return new JAXBElement(_RelatedTypeItem_QNAME, ItemType.class, RelatedType.class, value);
    }
}