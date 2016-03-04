(Project is aimed for use in Czech Republic, therefore description is in czech language only.)
# shoptet-pojo-classes
## Java třídy pro přípravu xml importu pro Shoptet

Tento projekt obsahuje základní třídy pro pohodlnou transformaci data od dodavatele pro Váš e-shop postavený na řešení od firmy Shoptet.

###Použití
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
