/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonClientServlet;

import com.mycompany.personwsapplication.PersonInfo;
import com.mycompany.personwsapplication.PersonWebServiceImplService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Администратор
 */
public class ClientServletSalary extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/PersonWSApplication/PersonWebServiceImplService.wsdl")
    private PersonWebServiceImplService service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        com.mycompany.personwsapplication.PersonInfo salary = null;
       
        try {
            com.mycompany.personwsapplication.PersonWebServiceImplService service = new com.mycompany.personwsapplication.PersonWebServiceImplService();
            com.mycompany.personwsapplication.PersonWebServiceImpl port = service.getPersonWebServiceImplPort();
             // TODO initialize WS operation arguments here
            java.lang.String strName = new String (request.getParameter("name").getBytes ("iso-8859-1"), "UTF-8");
            java.lang.String strPosition = new String (request.getParameter("position").getBytes ("iso-8859-1"), "UTF-8");
            
            // TODO process result here
            salary = port.rSalary(strName, strPosition);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ClientServletSalary</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ClientServletSalary at " + request.getContextPath() + "</h1>");
            if (salary != null){
                out.println("<table><tr><th></th></tr>"
                        + "<tr><td>ФИО Сотрудника</td><td>Должность</td><td>Заработная плата</td><td>Возвраст</td></tr>"
                                + "<tr><td>" + salary.getName() + "</td><td>" + salary.getPosition() + "</td><td>" + salary.getSalary() + "</td><td>" + salary.getAge() + "</td></tr></table>");
            }
            out.println("<p><a href='index.html'>Возврат на форму ввода</a></p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private PersonInfo rSalary(java.lang.String name, java.lang.String position) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.mycompany.personwsapplication.PersonWebServiceImpl port = service.getPersonWebServiceImplPort();
        return port.rSalary(name, position);
    }

}
