# Data Extractor for the European e-Invoice Specification (en16931)
## Summary
Open sourced for the creators of the e-invoice specification to allow easier sanity checks of the data within the tables to improve the quality of the specification.
Build as part of the [PrototypeFund project "paperless"](https://prototypefund.de/project/papierloser-alltag/) to generate larger parts of the software implementing the [European e-invoice specifcation (en16931)](https://invoice.fans/en/en16931-en/).

## XML Syntax Binding of en16931
The EU e-invoice specification demands the support of two XML file formats (OASIS UBL 1.2)[http://docs.oasis-open.org/ubl/UBL-2.1.html] and (UN/CEFACT XML Industry Invoice D16B)[https://www.unece.org/cefact/xml_schemas/index].
In its 3rd part the EU specification binds the XML syntax to the EU e-invoice semantic. For each syntax exist a document with at least two mapping table.
The first normative table describe the syntax binding from the semantic to XML, the second informative table describes it the other way around from XML to semantic.
![Two example tables for UN/CEFACT](en16931-3-reader/src/site/3-3-both-tables.png)
The informative table does not add any new information. It starts with the XML part, but uses only two of the five XML attributes from the normative table.
In theory, the comparison of both tables should provide the same data.

## en16931 Data Reader
The data of the above mapping tables is being read from the tables.
The XML part (dark grey) is loaded as XMLNode object.
The semantic part (light grey) is loaded as SemanticNode object.
The data extractor saves the model of each table in its own XML file to ease reading the data.
The normative tables is being saved twice, once with all information and a second time as subset equal to the informative table, making comparison easier.

## Usage
1) Call 'mvn install' in the root directory of the project once, to build the ODF reader (ODFDOM library)
2) Create a test document by saving either the UBL or UN/CEFACT 16931-3 specification from DOCX as OpenDocument Text format (ODT) in the folder en16931-3-reader/src/test/resources
3) Provide its name in the test en16931-3-reader/src/test/java/de/prototypefund/en16931/ExtractionTest.java
4) Call 'mvn install' in the 'en16931-3-reader' folder
5) The extracted data can be found as XML files in the folder en16931-3-reader/target/test-classes
6) Use a text comparing tool like (Total Commander on Windows)[https://www.ghisler.com/download.htm] to find any differences between the


## Future features
1) Support of reading EDITFACT tables from 16931-3-4 using different column numbers.
2) Providing an executable JAR instead of own build. Allowing to provide the ODT spec document path as argument on command line.
3) Additional documentation.
