
package cz.lukashruby.api.xml.shoptet;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "shopitem"
})
@XmlRootElement(name = "SHOP")
public class SHOP {

    @XmlElement(name = "SHOPITEM")
    protected List<SHOPITEM> shopitem;

    public List<SHOPITEM> getSHOPITEM() {
        if (shopitem == null) {
            shopitem = new ArrayList<SHOPITEM>();
        }
        return this.shopitem;
    }

    public void setShopitem(List<SHOPITEM> shopitem) {
        this.shopitem = shopitem;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "name",
            "xmlFeedName",
            "shortdescription",
            "description",
            "manufacturer",
            "warranty",
            "itemtype",
            "unit",
            "categories",
            "images",
            "textproperties",
            "relatedproducts",
            "alternativeproducts",
            "flags",
            "code",
            "price",
            "standardprice",
            "purchaseprice",
            "pricevat",
            "weight",
            "vat",
            "ean",
            "currency",
            "stock",
            "availability_out_of_stock",
            "availability_in_stock",
            "variants"
    })
    public static class SHOPITEM {

        @XmlElement(name = "NAME", required = true)
        protected String name;
        @XmlElement(name = "XML_FEED_NAME")
        protected String xmlFeedName;
        @XmlElement(name = "SHORT_DESCRIPTION", required = true)
        protected String shortdescription;
        @XmlElement(name = "DESCRIPTION", required = true)
        protected String description;
        @XmlElement(name = "MANUFACTURER", required = true)
        protected String manufacturer;
        @XmlElement(name = "WARRANTY")
        protected byte warranty;
        @XmlElement(name = "ITEM_TYPE", required = true)
        protected String itemtype;
        @XmlElement(name = "UNIT", required = true)
        protected String unit;
        @XmlElement(name = "CATEGORIES", required = true)
        protected CATEGORIES categories;
        @XmlElement(name = "IMAGES", required = true)
        protected IMAGES images;
        @XmlElement(name = "TEXT_PROPERTIES")
        protected TEXTPROPERTIES textproperties;
        @XmlElement(name = "RELATED_PRODUCTS")
        protected RELATEDPRODUCTS relatedproducts;
        @XmlElement(name = "ALTERNATIVE_PRODUCTS")
        protected ALTERNATIVEPRODUCTS alternativeproducts;
        @XmlElement(name = "FLAGS", required = true)
        protected FLAGS flags;
        @XmlElement(name = "CODE")
        protected String code;
        @XmlElement(name = "PRICE")
        protected BigDecimal price;
        @XmlElement(name = "STANDARD_PRICE")
        protected BigDecimal standardprice;
        @XmlElement(name = "PURCHASE_PRICE")
        protected BigDecimal purchaseprice;
        @XmlElement(name = "PRICE_VAT")
        protected BigDecimal pricevat;
        @XmlElement(name = "WEIGHT")
        protected String weight;
        @XmlElement(name = "VAT")
        protected Byte vat;
        @XmlElement(name = "EAN")
        protected Long ean;
        @XmlElement(name = "CURRENCY")
        protected String currency;
        @XmlElement(name = "STOCK")
        protected STOCK stock;
        @XmlElement(name = "AVAILABILITY_OUT_OF_STOCK")
        protected String availability_out_of_stock;
        @XmlElement(name = "AVAILABILITY_IN_STOCK")
        protected String availability_in_stock;
        @XmlElement(name = "VARIANTS")
        protected VARIANTS variants;

        public String getNAME() {
            return name;
        }

        public void setNAME(String value) {
            this.name = value;
        }

        public String getXmlFeedName() {
            return xmlFeedName;
        }

        public void setXML_FEED_NAME(String xmlFeedName) {
            this.xmlFeedName = xmlFeedName;
        }

        public String getSHORTDESCRIPTION() {
            return shortdescription;
        }

        public void setSHORTDESCRIPTION(String value) {
            this.shortdescription = value;
        }

        public String getDESCRIPTION() {
            return description;
        }

        public void setDESCRIPTION(String value) {
            this.description = value;
        }

        public String getMANUFACTURER() {
            return manufacturer;
        }

        public void setMANUFACTURER(String value) {
            this.manufacturer = value;
        }

        public byte getWARRANTY() {
            return warranty;
        }

        public void setWARRANTY(byte value) {
            this.warranty = value;
        }

        public String getITEMTYPE() {
            return itemtype;
        }

        public void setITEMTYPE(String value) {
            this.itemtype = value;
        }

        public String getUNIT() {
            return unit;
        }

        public void setUNIT(String value) {
            this.unit = value;
        }

        public CATEGORIES getCATEGORIES() {
            return categories;
        }

        public void setCATEGORIES(CATEGORIES value) {
            this.categories = value;
        }

        public IMAGES getIMAGES() {
            return images;
        }

        public void setIMAGES(IMAGES value) {
            this.images = value;
        }

        public TEXTPROPERTIES getTEXTPROPERTIES() {
            return textproperties;
        }

        public void setTEXTPROPERTIES(TEXTPROPERTIES value) {
            this.textproperties = value;
        }

        public RELATEDPRODUCTS getRELATEDPRODUCTS() {
            return relatedproducts;
        }

        public void setRELATEDPRODUCTS(RELATEDPRODUCTS value) {
            this.relatedproducts = value;
        }

        public ALTERNATIVEPRODUCTS getALTERNATIVEPRODUCTS() {
            return alternativeproducts;
        }

        public void setALTERNATIVEPRODUCTS(ALTERNATIVEPRODUCTS value) {
            this.alternativeproducts = value;
        }

        public FLAGS getFLAGS() {
            return flags;
        }

        public void setFLAGS(FLAGS value) {
            this.flags = value;
        }

        public String getCODE() {
            return code;
        }

        public void setCODE(String value) {
            this.code = value;
        }

        public BigDecimal getPRICE() {
            return price;
        }

        public void setPRICE(BigDecimal value) {
            this.price = value;
        }

        public BigDecimal getSTANDARDPRICE() {
            return standardprice;
        }

        public void setSTANDARDPRICE(BigDecimal value) {
            this.standardprice = value;
        }

        public BigDecimal getPURCHASEPRICE() {
            return purchaseprice;
        }

        public void setPURCHASEPRICE(BigDecimal value) {
            this.purchaseprice = value;
        }

        public BigDecimal getPRICEVAT() {
            return pricevat;
        }

        public void setPRICEVAT(BigDecimal value) {
            this.pricevat = value;
        }

        public String getWEIGHT() {
            return weight;
        }

        public void setWEIGHT(String value) {
            this.weight = value;
        }

        public Byte getVAT() {
            return vat;
        }

        public void setVAT(Byte value) {
            this.vat = value;
        }

        public Long getEAN() {
            return ean;
        }

        public void setEAN(Long value) {
            this.ean = value;
        }

        public String getCURRENCY() {
            return currency;
        }

        public void setCURRENCY(String value) {
            this.currency = value;
        }

        public STOCK getSTOCK() {
            return stock;
        }

        public void setSTOCK(STOCK value) {
            this.stock = value;
        }


        public String getAvailability_out_of_stock() {
            return availability_out_of_stock;
        }

        public void setAvailability_out_of_stock(String availability_out_of_stock) {
            this.availability_out_of_stock = availability_out_of_stock;
        }

        public String getAvailability_in_stock() {
            return availability_in_stock;
        }

        public void setAvailability_in_stock(String availability_in_stock) {
            this.availability_in_stock = availability_in_stock;
        }

        public VARIANTS getVARIANTS() {
            return variants;
        }

        public void setVARIANTS(VARIANTS value) {
            this.variants = value;
        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "code"
        })
        public static class ALTERNATIVEPRODUCTS {

            @XmlElement(name = "CODE")
            protected List<String> code;

            public List<String> getCODE() {
                if (code == null) {
                    code = new ArrayList<String>();
                }
                return this.code;
            }

        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "category"
        })
        public static class CATEGORIES {

            @XmlElement(name = "CATEGORY")
            protected List<String> category;

            public List<String> getCATEGORY() {
                if (category == null) {
                    category = new ArrayList<String>();
                }
                return this.category;
            }

            public void setCategory(List<String> category) {
                this.category = category;
            }
        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "action",
                "_new",
                "tip"
        })
        public static class FLAGS {

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


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "image"
        })
        public static class IMAGES {

            @XmlElement(name = "IMAGE")
            @XmlSchemaType(name = "anyURI")
            protected List<String> image;

            public List<String> getIMAGE() {
                if (image == null) {
                    image = new ArrayList<String>();
                }
                return this.image;
            }

            public void setImage(List<String> image) {
                this.image = image;
            }
        }


        /**
         * <p>Java class for anonymous complex type.
         * <p>
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "code"
        })
        public static class RELATEDPRODUCTS {

            @XmlElement(name = "CODE")
            protected List<String> code;

            /**
             * Gets the value of the code property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the code property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCODE().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             */
            public List<String> getCODE() {
                if (code == null) {
                    code = new ArrayList<String>();
                }
                return this.code;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * <p>
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="MINIMAL_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "amount",
                "minimalamount"
        })
        public static class STOCK {

            @XmlElement(name = "AMOUNT")
            protected byte amount;
            @XmlElement(name = "MINIMAL_AMOUNT")
            protected byte minimalamount;

            /**
             * Gets the value of the amount property.
             */
            public byte getAMOUNT() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             */
            public void setAMOUNT(byte value) {
                this.amount = value;
            }

            /**
             * Gets the value of the minimalamount property.
             */
            public byte getMINIMALAMOUNT() {
                return minimalamount;
            }

            /**
             * Sets the value of the minimalamount property.
             */
            public void setMINIMALAMOUNT(byte value) {
                this.minimalamount = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * <p>
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="TEXT_PROPERTY" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "textproperty"
        })
        public static class TEXTPROPERTIES {

            @XmlElement(name = "TEXT_PROPERTY")
            protected List<TEXTPROPERTY> textproperty;

            /**
             * Gets the value of the textproperty property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the textproperty property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTEXTPROPERTY().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TEXTPROPERTY }
             */
            public List<TEXTPROPERTY> getTEXTPROPERTY() {
                if (textproperty == null) {
                    textproperty = new ArrayList<TEXTPROPERTY>();
                }
                return this.textproperty;
            }


            /**
             * <p>Java class for anonymous complex type.
             * <p>
             * <p>The following schema fragment specifies the expected content contained within this class.
             * <p>
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "name",
                    "value"
            })
            public static class TEXTPROPERTY {

                @XmlElement(name = "NAME", required = true)
                protected String name;
                @XmlElement(name = "VALUE", required = true)
                protected String value;

                /**
                 * Gets the value of the name property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getNAME() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setNAME(String value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the value property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getVALUE() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setVALUE(String value) {
                    this.value = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * <p>
         * <p>The following schema fragment specifies the expected content contained within this class.
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="VARIANT" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PARAMETERS">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="PARAMETER" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="EAN" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
         *                   &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *                   &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *                   &lt;element name="PURCHASE_PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *                   &lt;element name="STANDARD_PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *                   &lt;element name="PRICE_VAT" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *                   &lt;element name="AVAILABILITY" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "variant"
        })
        public static class VARIANTS {

            @XmlElement(name = "VARIANT")
            protected List<VARIANT> variant;

            /**
             * Gets the value of the variant property.
             * <p>
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the variant property.
             * <p>
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getVARIANT().add(newItem);
             * </pre>
             * <p>
             * <p>
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link VARIANT }
             */
            public List<VARIANT> getVARIANT() {
                if (variant == null) {
                    variant = new ArrayList<VARIANT>();
                }
                return this.variant;
            }

            public void setVARIANT(List<VARIANT> VARIANT) {
                this.variant = VARIANT;
            }


            /**
             * <p>Java class for anonymous complex type.
             * <p>
             * <p>The following schema fragment specifies the expected content contained within this class.
             * <p>
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PARAMETERS">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="PARAMETER" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="EAN" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
             *         &lt;element name="CURRENCY" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="VAT" type="{http://www.w3.org/2001/XMLSchema}byte"/>
             *         &lt;element name="PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/>
             *         &lt;element name="PURCHASE_PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/>
             *         &lt;element name="STANDARD_PRICE" type="{http://www.w3.org/2001/XMLSchema}float"/>
             *         &lt;element name="PRICE_VAT" type="{http://www.w3.org/2001/XMLSchema}short"/>
             *         &lt;element name="AVAILABILITY" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "code",
                    "parameters",
                    "ean",
                    "currency",
                    "vat",
                    "price",
                    "purchaseprice",
                    "standardprice",
                    "pricevat",
                    "availability"
            })
            public static class VARIANT {

                @XmlElement(name = "CODE", required = true)
                protected String code;
                @XmlElement(name = "PARAMETERS", required = true)
                protected PARAMETERS parameters;
                @XmlElement(name = "EAN")
                protected Long ean;
                @XmlElement(name = "CURRENCY", required = true)
                protected String currency;
                @XmlElement(name = "VAT")
                protected byte vat;
                @XmlElement(name = "PRICE")
                protected BigDecimal price;
                @XmlElement(name = "PURCHASE_PRICE")
                protected BigDecimal purchaseprice;
                @XmlElement(name = "STANDARD_PRICE")
                protected BigDecimal standardprice;
                @XmlElement(name = "PRICE_VAT")
                protected BigDecimal pricevat;
                @XmlElement(name = "AVAILABILITY", required = true)
                protected String availability;

                /**
                 * Gets the value of the code property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getCODE() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setCODE(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the parameters property.
                 *
                 * @return possible object is
                 * {@link PARAMETERS }
                 */
                public PARAMETERS getPARAMETERS() {
                    return parameters;
                }

                /**
                 * Sets the value of the parameters property.
                 *
                 * @param value allowed object is
                 *              {@link PARAMETERS }
                 */
                public void setPARAMETERS(PARAMETERS value) {
                    this.parameters = value;
                }

                /**
                 * Gets the value of the ean property.
                 *
                 * @return possible object is
                 * {@link Long }
                 */
                public Long getEAN() {
                    return ean;
                }

                /**
                 * Sets the value of the ean property.
                 *
                 * @param value allowed object is
                 *              {@link Long }
                 */
                public void setEAN(Long value) {
                    this.ean = value;
                }

                /**
                 * Gets the value of the currency property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getCURRENCY() {
                    return currency;
                }

                /**
                 * Sets the value of the currency property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setCURRENCY(String value) {
                    this.currency = value;
                }

                /**
                 * Gets the value of the vat property.
                 */
                public byte getVAT() {
                    return vat;
                }

                /**
                 * Sets the value of the vat property.
                 */
                public void setVAT(byte value) {
                    this.vat = value;
                }

                /**
                 * Gets the value of the price property.
                 */
                public BigDecimal getPRICE() {
                    return price;
                }

                /**
                 * Sets the value of the price property.
                 */
                public void setPRICE(BigDecimal value) {
                    this.price = value;
                }

                /**
                 * Gets the value of the purchaseprice property.
                 */
                public BigDecimal getPURCHASEPRICE() {
                    return purchaseprice;
                }

                /**
                 * Sets the value of the purchaseprice property.
                 */
                public void setPURCHASEPRICE(BigDecimal value) {
                    this.purchaseprice = value;
                }

                /**
                 * Gets the value of the standardprice property.
                 */
                public BigDecimal getSTANDARDPRICE() {
                    return standardprice;
                }

                /**
                 * Sets the value of the standardprice property.
                 */
                public void setSTANDARDPRICE(BigDecimal value) {
                    this.standardprice = value;
                }

                /**
                 * Gets the value of the pricevat property.
                 */
                public BigDecimal getPRICEVAT() {
                    return pricevat;
                }

                /**
                 * Sets the value of the pricevat property.
                 */
                public void setPRICEVAT(BigDecimal value) {
                    this.pricevat = value;
                }

                /**
                 * Gets the value of the availability property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getAVAILABILITY() {
                    return availability;
                }

                /**
                 * Sets the value of the availability property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setAVAILABILITY(String value) {
                    this.availability = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * <p>
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * <p>
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="PARAMETER" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "parameter"
                })
                public static class PARAMETERS {

                    @XmlElement(name = "PARAMETER")
                    protected List<PARAMETER> parameter;

                    /**
                     * Gets the value of the parameter property.
                     * <p>
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the parameter property.
                     * <p>
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPARAMETER().add(newItem);
                     * </pre>
                     * <p>
                     * <p>
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link PARAMETER }
                     */
                    public List<PARAMETER> getPARAMETER() {
                        if (parameter == null) {
                            parameter = new ArrayList<PARAMETER>();
                        }
                        return this.parameter;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * <p>
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * <p>
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                            "name",
                            "value"
                    })
                    public static class PARAMETER {

                        @XmlElement(name = "NAME", required = true)
                        protected String name;
                        @XmlElement(name = "VALUE", required = true)
                        protected String value;

                        /**
                         * Gets the value of the name property.
                         *
                         * @return possible object is
                         * {@link String }
                         */
                        public String getNAME() {
                            return name;
                        }

                        /**
                         * Sets the value of the name property.
                         *
                         * @param value allowed object is
                         *              {@link String }
                         */
                        public void setNAME(String value) {
                            this.name = value;
                        }

                        /**
                         * Gets the value of the value property.
                         *
                         * @return possible object is
                         * {@link String }
                         */
                        public String getVALUE() {
                            return value;
                        }

                        /**
                         * Sets the value of the value property.
                         *
                         * @param value allowed object is
                         *              {@link String }
                         */
                        public void setVALUE(String value) {
                            this.value = value;
                        }

                    }

                }

            }

        }

    }

}
