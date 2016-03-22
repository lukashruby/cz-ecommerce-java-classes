(Project is aimed for use in Czech Republic, therefore description is in czech language only.)
# cz-ecommerce-java-classes
## Java třídy pro přípravu xml feedu pro různé dodavatele a e-shopová řešení

###Shoptet

####Použití
```java
SHOP rootShop = new SHOP();
List<SHOP.SHOPITEM> shopitem = rootShop.getSHOPITEM();
// do shopitem přidáte vlastní položky
JAXBContext shoptetJaxbContext = JAXBContext.newInstance(SHOP.class);
Marshaller shoptetJaxbMarshaller = shoptetJaxbContext.createMarshaller();
shoptetJaxbMarshaller.marshal(rootShop, ...);
```

###Podpora a řešení problémů
Projekt upravuji podle aktuálních potřeb. V případě zájmu o rozšíření funkcionality nebo realizaci transformace dat mě můžete kontaktovat na http://lukashruby.cz .
