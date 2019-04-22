
package com.mycompany.personwsapplication;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PersonWebServiceImpl", targetNamespace = "http://personwsapplication.mycompany.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PersonWebServiceImpl {


    /**
     * 
     * @return
     *     returns java.util.List<com.mycompany.personwsapplication.PersonInfo>
     */
    @WebMethod(operationName = "RPerson")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "RPerson", targetNamespace = "http://personwsapplication.mycompany.com/", className = "com.mycompany.personwsapplication.RPerson")
    @ResponseWrapper(localName = "RPersonResponse", targetNamespace = "http://personwsapplication.mycompany.com/", className = "com.mycompany.personwsapplication.RPersonResponse")
    @Action(input = "http://personwsapplication.mycompany.com/PersonWebServiceImpl/RPersonRequest", output = "http://personwsapplication.mycompany.com/PersonWebServiceImpl/RPersonResponse")
    public List<PersonInfo> rPerson();

    /**
     * 
     * @param name
     * @param position
     * @return
     *     returns com.mycompany.personwsapplication.PersonInfo
     */
    @WebMethod(operationName = "RSalary")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "RSalary", targetNamespace = "http://personwsapplication.mycompany.com/", className = "com.mycompany.personwsapplication.RSalary")
    @ResponseWrapper(localName = "RSalaryResponse", targetNamespace = "http://personwsapplication.mycompany.com/", className = "com.mycompany.personwsapplication.RSalaryResponse")
    @Action(input = "http://personwsapplication.mycompany.com/PersonWebServiceImpl/RSalaryRequest", output = "http://personwsapplication.mycompany.com/PersonWebServiceImpl/RSalaryResponse")
    public PersonInfo rSalary(
        @WebParam(name = "Name", targetNamespace = "")
        String name,
        @WebParam(name = "Position", targetNamespace = "")
        String position);

    /**
     * 
     * @param name
     * @param position
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "RAge")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "RAge", targetNamespace = "http://personwsapplication.mycompany.com/", className = "com.mycompany.personwsapplication.RAge")
    @ResponseWrapper(localName = "RAgeResponse", targetNamespace = "http://personwsapplication.mycompany.com/", className = "com.mycompany.personwsapplication.RAgeResponse")
    @Action(input = "http://personwsapplication.mycompany.com/PersonWebServiceImpl/RAgeRequest", output = "http://personwsapplication.mycompany.com/PersonWebServiceImpl/RAgeResponse")
    public String rAge(
        @WebParam(name = "Name", targetNamespace = "")
        String name,
        @WebParam(name = "Position", targetNamespace = "")
        String position);

}
