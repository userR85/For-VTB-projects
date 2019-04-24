
package com.mycompany.wsvalidator;

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
@WebServiceClient(name = "Validate", targetNamespace = "http://wsvalidator.mycompany.com/", wsdlLocation = "http://localhost:8080/WSValidator/Validate?wsdl")
public class Validate_Service
    extends Service
{

    private final static URL VALIDATE_WSDL_LOCATION;
    private final static WebServiceException VALIDATE_EXCEPTION;
    private final static QName VALIDATE_QNAME = new QName("http://wsvalidator.mycompany.com/", "Validate");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WSValidator/Validate?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VALIDATE_WSDL_LOCATION = url;
        VALIDATE_EXCEPTION = e;
    }

    public Validate_Service() {
        super(__getWsdlLocation(), VALIDATE_QNAME);
    }

    public Validate_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), VALIDATE_QNAME, features);
    }

    public Validate_Service(URL wsdlLocation) {
        super(wsdlLocation, VALIDATE_QNAME);
    }

    public Validate_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VALIDATE_QNAME, features);
    }

    public Validate_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Validate_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Validate
     */
    @WebEndpoint(name = "ValidatePort")
    public Validate getValidatePort() {
        return super.getPort(new QName("http://wsvalidator.mycompany.com/", "ValidatePort"), Validate.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Validate
     */
    @WebEndpoint(name = "ValidatePort")
    public Validate getValidatePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://wsvalidator.mycompany.com/", "ValidatePort"), Validate.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VALIDATE_EXCEPTION!= null) {
            throw VALIDATE_EXCEPTION;
        }
        return VALIDATE_WSDL_LOCATION;
    }

}