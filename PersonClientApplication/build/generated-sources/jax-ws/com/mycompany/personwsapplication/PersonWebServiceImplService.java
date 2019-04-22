
package com.mycompany.personwsapplication;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PersonWebServiceImplService", targetNamespace = "http://personwsapplication.mycompany.com/", wsdlLocation = "http://localhost:8080/PersonWSApplication/PersonWebServiceImplService?wsdl")
public class PersonWebServiceImplService
    extends Service
{

    private final static URL PERSONWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException PERSONWEBSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName PERSONWEBSERVICEIMPLSERVICE_QNAME = new QName("http://personwsapplication.mycompany.com/", "PersonWebServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/PersonWSApplication/PersonWebServiceImplService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PERSONWEBSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        PERSONWEBSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public PersonWebServiceImplService() {
        super(__getWsdlLocation(), PERSONWEBSERVICEIMPLSERVICE_QNAME);
    }

    public PersonWebServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PERSONWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public PersonWebServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, PERSONWEBSERVICEIMPLSERVICE_QNAME);
    }

    public PersonWebServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PERSONWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public PersonWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PersonWebServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PersonWebServiceImpl
     */
    @WebEndpoint(name = "PersonWebServiceImplPort")
    public PersonWebServiceImpl getPersonWebServiceImplPort() {
        return super.getPort(new QName("http://personwsapplication.mycompany.com/", "PersonWebServiceImplPort"), PersonWebServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PersonWebServiceImpl
     */
    @WebEndpoint(name = "PersonWebServiceImplPort")
    public PersonWebServiceImpl getPersonWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://personwsapplication.mycompany.com/", "PersonWebServiceImplPort"), PersonWebServiceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PERSONWEBSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw PERSONWEBSERVICEIMPLSERVICE_EXCEPTION;
        }
        return PERSONWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
