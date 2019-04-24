/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wsvalidator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

import java.io.*;
import java.util.logging.*;
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
@WebService(serviceName = "Validate")
public class Validate {

    /**
	 * Возвращает результат валидации XML и XSD файлов
	 * @param xmlURL URL к XML источнику 
         * @param xsdURL URL к XSD источнику 
	 * @return BOOLEAN
	 */
    @WebMethod(operationName = "TestDB")
    public Boolean TestDB(@WebParam(name = "xmlURL") String xml, @WebParam(name = "xsdURL") String xsd) {
       
        Logger log = Logger.getLogger(Logger.class.getName());
        
        try
        {           
            // 1. Поиск и создание экземпляра фабрики для языка XML Schema
            SchemaFactory factory = 
            SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            
            // 2. Компиляция схемы
            // Схема загружается в объект типа java.io.File, но вы также можете использовать 
            // классы java.net.URL и javax.xml.transform.Source
            Schema schema = factory.newSchema(new StreamSource(new URL(xsd).openStream()));
          
            // 3. Создание валидатора для схемы
            Validator validator = schema.newValidator();
            
            try {
            // 4. Валидация документа
                 validator.validate(new StreamSource(new URL(xml).openStream()));
            }
            catch (SAXException ex) {
                log.log(Level.SEVERE, "Exception: ", ex);
                return false;
            }  
            return true;
        }
        catch(Exception ex)
        {
            log.log(Level.SEVERE, "Exception: ", ex);
            return false;
        }
    }

}
