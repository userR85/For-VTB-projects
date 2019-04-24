
package com.mycompany.wsvalidator;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.wsvalidator package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TestDB_QNAME = new QName("http://wsvalidator.mycompany.com/", "TestDB");
    private final static QName _TestDBResponse_QNAME = new QName("http://wsvalidator.mycompany.com/", "TestDBResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.wsvalidator
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TestDB }
     * 
     */
    public TestDB createTestDB() {
        return new TestDB();
    }

    /**
     * Create an instance of {@link TestDBResponse }
     * 
     */
    public TestDBResponse createTestDBResponse() {
        return new TestDBResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestDB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsvalidator.mycompany.com/", name = "TestDB")
    public JAXBElement<TestDB> createTestDB(TestDB value) {
        return new JAXBElement<TestDB>(_TestDB_QNAME, TestDB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestDBResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsvalidator.mycompany.com/", name = "TestDBResponse")
    public JAXBElement<TestDBResponse> createTestDBResponse(TestDBResponse value) {
        return new JAXBElement<TestDBResponse>(_TestDBResponse_QNAME, TestDBResponse.class, null, value);
    }

}
