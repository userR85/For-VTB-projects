/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientappvalidator;

import java.io.*;
import java.net.URL;
import javax.xml.transform.Source;
import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.stream.*;
import javax.xml.validation.*;
import org.xml.sax.SAXException;
/**
 *
 * @author Администратор
 */
public class XMLValidator {
    
    boolean ValidateXML(String xmlURL, String xsdURL) throws SAXException, IOException {
     
        //String tt = "";
        try
        {
            // 1. Поиск и создание экземпляра фабрики для языка XML Schema
            SchemaFactory factory = 
                SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            
            // 2. Компиляция схемы
            // Схема загружается в объект типа java.io.File, но вы также можете использовать 
            // классы java.net.URL и javax.xml.transform.Source
            Schema schema = factory.newSchema(new StreamSource(new URL(xsdURL).openStream()));
/*            
             StreamSource reportStream = 
              new StreamSource(new URL("file:///D:/XML/Person.xsd").openStream());
            XMLInputFactory xif = XMLInputFactory.newFactory();
            XMLStreamReader xmlReader = xif.createXMLStreamReader(reportStream);
            xmlReader.nextTag();
            while (xmlReader.hasNext()) {
                //if (xmlReader.getLocalName().equals("attributeICareAbout")) {
                    tt = tt + xmlReader.getText().toString();
                    xmlReader.nextTag();
                //}
            }
            xmlReader.close();
*/            
            // 3. Создание валидатора для схемы
            Validator validator = schema.newValidator();
            
            try {
                 // 4. Валидация документа
                 validator.validate(new StreamSource(new URL(xmlURL).openStream()));
            }
            catch (SAXException ex) {
                System.out.println(ex.getMessage());
                return false;
            }  
            return true;
        }
        catch(Exception ex)
        {
            System.out.println("Error: "+ex.getMessage());
            return false;
        }
    }
}
