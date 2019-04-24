/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientappvalidator;

import clientappvalidator.XMLValidator;
import clientappvalidator.ReadFile;

import java.io.*;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.*;
import org.xml.sax.SAXException;
/**
 *
 * @author Администратор
 */
public class ClientAppValidator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SAXException, IOException {
        // TODO code application logic here
        //ReadFile file = new ReadFile();
        //String xml = file.readData(D:/XML/Person Update.xml");
        //String xsd = file.readData("D:/XML/Person.xsd");
        
        String xmlURL = "file:///D:/XML/Person.xml";
        String xsdURL = "file:///D:/XML/Person.xsd";
        XMLValidator vali = new XMLValidator();
        if (vali.ValidateXML(xmlURL, xsdURL)) System.out.println("Версия Java-приложения. Валидация файлов XML и XSD прошла успешно!");
            else System.out.println("Версия Java-приложения. Валидация файлов XML и XSD не прошла...");
        
        if (testDB(xmlURL, xsdURL)) System.out.println("Версия Web-сервиса. Валидация файлов XML и XSD прошла успешно!");
            else System.out.println("Версия Web-сервиса. Валидация файлов XML и XSD не прошла...");
        
   /*     
         // 1. Поиск и создание экземпляра фабрики для языка XML Schema
        SchemaFactory factory = 
            SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
         
        // 2. Компиляция схемы
        // Схема загружается в объект типа java.io.File, но вы также можете использовать 
        // классы java.net.URL и javax.xml.transform.Source
        File schemaLocation = new File("D:/XML/Person.xsd");
        Schema schema = factory.newSchema(schemaLocation);
     
        // 3. Создание валидатора для схемы
        Validator validator = schema.newValidator();
         
        // 4. Разбор проверяемого документа
        Source source = new StreamSource(args[0]);
         
        // 5. Валидация документа
        try {
            validator.validate(source);
            System.out.println(args[0] + " is valid.");
        }
        catch (SAXException ex) {
            System.out.println(args[0] + " is not valid because ");
            System.out.println(ex.getMessage());
        }  
  */  
    }

    private static Boolean testDB(java.lang.String xmlURL, java.lang.String xsdURL) {
        com.mycompany.wsvalidator.Validate_Service service = new com.mycompany.wsvalidator.Validate_Service();
        com.mycompany.wsvalidator.Validate port = service.getValidatePort();
        return port.testDB(xmlURL, xsdURL);
    }

}
