/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.personwsapplication;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Администратор
 */

@WebService
public interface PersonWebService {
    
    @WebMethod
    public List<PersonInfo> getPersons();
    
    @WebMethod
    public PersonInfo getSalary(String name, String position);
    
    @WebMethod
    public String getAge(String name, String position);
    
}
