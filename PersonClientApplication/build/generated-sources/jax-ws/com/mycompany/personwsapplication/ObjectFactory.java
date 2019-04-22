
package com.mycompany.personwsapplication;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.personwsapplication package. 
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

    private final static QName _RAgeResponse_QNAME = new QName("http://personwsapplication.mycompany.com/", "RAgeResponse");
    private final static QName _RPersonResponse_QNAME = new QName("http://personwsapplication.mycompany.com/", "RPersonResponse");
    private final static QName _RAge_QNAME = new QName("http://personwsapplication.mycompany.com/", "RAge");
    private final static QName _RSalary_QNAME = new QName("http://personwsapplication.mycompany.com/", "RSalary");
    private final static QName _RPerson_QNAME = new QName("http://personwsapplication.mycompany.com/", "RPerson");
    private final static QName _RSalaryResponse_QNAME = new QName("http://personwsapplication.mycompany.com/", "RSalaryResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.personwsapplication
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RPerson }
     * 
     */
    public RPerson createRPerson() {
        return new RPerson();
    }

    /**
     * Create an instance of {@link RSalaryResponse }
     * 
     */
    public RSalaryResponse createRSalaryResponse() {
        return new RSalaryResponse();
    }

    /**
     * Create an instance of {@link RSalary }
     * 
     */
    public RSalary createRSalary() {
        return new RSalary();
    }

    /**
     * Create an instance of {@link RAgeResponse }
     * 
     */
    public RAgeResponse createRAgeResponse() {
        return new RAgeResponse();
    }

    /**
     * Create an instance of {@link RPersonResponse }
     * 
     */
    public RPersonResponse createRPersonResponse() {
        return new RPersonResponse();
    }

    /**
     * Create an instance of {@link RAge }
     * 
     */
    public RAge createRAge() {
        return new RAge();
    }

    /**
     * Create an instance of {@link PersonInfo }
     * 
     */
    public PersonInfo createPersonInfo() {
        return new PersonInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RAgeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://personwsapplication.mycompany.com/", name = "RAgeResponse")
    public JAXBElement<RAgeResponse> createRAgeResponse(RAgeResponse value) {
        return new JAXBElement<RAgeResponse>(_RAgeResponse_QNAME, RAgeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://personwsapplication.mycompany.com/", name = "RPersonResponse")
    public JAXBElement<RPersonResponse> createRPersonResponse(RPersonResponse value) {
        return new JAXBElement<RPersonResponse>(_RPersonResponse_QNAME, RPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RAge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://personwsapplication.mycompany.com/", name = "RAge")
    public JAXBElement<RAge> createRAge(RAge value) {
        return new JAXBElement<RAge>(_RAge_QNAME, RAge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RSalary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://personwsapplication.mycompany.com/", name = "RSalary")
    public JAXBElement<RSalary> createRSalary(RSalary value) {
        return new JAXBElement<RSalary>(_RSalary_QNAME, RSalary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://personwsapplication.mycompany.com/", name = "RPerson")
    public JAXBElement<RPerson> createRPerson(RPerson value) {
        return new JAXBElement<RPerson>(_RPerson_QNAME, RPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RSalaryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://personwsapplication.mycompany.com/", name = "RSalaryResponse")
    public JAXBElement<RSalaryResponse> createRSalaryResponse(RSalaryResponse value) {
        return new JAXBElement<RSalaryResponse>(_RSalaryResponse_QNAME, RSalaryResponse.class, null, value);
    }

}
