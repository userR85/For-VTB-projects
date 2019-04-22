<%-- 
    Document   : index
    Created on : 20.04.2019, 22:30:17
    Author     : Администратор
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>РАБОТА WEB-СЕРВИСА!</h1>
        <h2>МЕТОД RPerson</h2>
        <table>
            <tr><th>Список Сотрудников:</th></tr>
        
     <%-- start web service invocation --%><hr/>
    <%
    try {
	com.mycompany.personwsapplication.PersonWebServiceImplService service = new com.mycompany.personwsapplication.PersonWebServiceImplService();
	com.mycompany.personwsapplication.PersonWebServiceImpl port = service.getPersonWebServiceImplPort();
	// TODO process result here
	java.util.List<com.mycompany.personwsapplication.PersonInfo> persons = port.rPerson();
    
        for(com.mycompany.personwsapplication.PersonInfo iPerson : persons){
            %><tr><td><%out.println("Сотрудник:  " + iPerson.getName() + ", " + iPerson.getPosition() + ", " + iPerson.getAge() + " лет, размер зар. платы " + iPerson.getSalary());
            %></td></tr><%
        } %> </table> <%
    } catch (Exception ex) {
	// TODO handle custom exceptions here
        out.println("exception" + ex);
    }
    %>
    <%-- end web service invocation --%><hr/>
        
        <h2>МЕТОД RSalary</h2>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	com.mycompany.personwsapplication.PersonWebServiceImplService service = new com.mycompany.personwsapplication.PersonWebServiceImplService();
	com.mycompany.personwsapplication.PersonWebServiceImpl port = service.getPersonWebServiceImplPort();
	 // TODO initialize WS operation arguments here
	java.lang.String name = "Иван Петров";
	java.lang.String position = "Директор";
	// TODO process result here
	com.mycompany.personwsapplication.PersonInfo iPerson = port.rSalary(name, position);
	out.println("Сотрудник:  " + iPerson.getName() + ", " + iPerson.getPosition() + ", " + iPerson.getAge() + " лет, размер зар. платы " + iPerson.getSalary());
    } catch (Exception ex) {
	// TODO handle custom exceptions here
         out.println("exception" + ex);
    }
    %>
    <%-- end web service invocation --%><hr/>
    
        <h2>МЕТОД RAge</h2>
  <%-- start web service invocation --%><hr/> 
  <%
    try {
	com.mycompany.personwsapplication.PersonWebServiceImplService service = new com.mycompany.personwsapplication.PersonWebServiceImplService();
	com.mycompany.personwsapplication.PersonWebServiceImpl port = service.getPersonWebServiceImplPort();
	 // TODO initialize WS operation arguments here
	java.lang.String name = "Николай Печкин";
	java.lang.String position = "Заместитель Директора";
	// TODO process result here
	java.lang.String result = port.rAge(name, position);
	out.println("Возвраст Сотрудника: "+result);
    } catch (Exception ex) {
        // TODO handle custom exceptions here
	 out.println("exception" + ex);
    }
    %>
    <%-- end web service invocation --%><hr/>

    </body>
</html>
