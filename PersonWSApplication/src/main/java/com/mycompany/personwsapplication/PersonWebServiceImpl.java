/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.personwsapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.mycompany.personwsapplication.ConnectionDB;

/**
 *
 * @author Администратор
 */
@WebService//(endpointInterface = "com.mycompany.personwsapplication.PersonWebService")
public class PersonWebServiceImpl implements PersonWebService {

    // Вспомогательный метод получения соединения
    private Connection getConnection() throws Exception {
  
        // Подгрузка драйвера БД Derby
        Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            // Получение соединения с БД
            return DriverManager.getConnection(
            "jdbc:derby://localhost:1527/TestDB;create=true;user=TestUser;password=TestPass"); 
	}

	/**
	 * Возвращает ФИО Сотрудников, которые работают в компании
	 * @return список ФИО
	 */
        @WebMethod(operationName = "RPerson")
	public List<PersonInfo> getPersons() {
            
            PersonInfo personInfo = null;
            int i=0;
		try {
			List<PersonInfo> persons = new ArrayList<PersonInfo>();
			// Получение соединения с БД
			//Connection con = getConnection();
                        ConnectionDB conDB = new ConnectionDB();
                        Connection con = conDB.getConnection();

			// Выполнение SQL-запроса
			ResultSet rs = con.createStatement().executeQuery(
					"Select * from Person");
			while (rs.next()) {
                            personInfo = new PersonInfo(
                                rs.getString(1), 
                                rs.getString(2), 
                                rs.getString(3), 
                                rs.getString(4));
                            
                                persons.add(i, personInfo);//.add(rs.getString(1));
			}
			// Закрываем выборку и соединение с БД
			rs.close();
			con.close();
			return persons;
                        
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	/**
	 * Возвращает информацию Сотрудниках
	 * @param name ФИО 
         * @param position Должность 
	 * @return Заработная плата
	 */
	@WebMethod(operationName = "RSalary")
	public PersonInfo getSalary(@WebParam(name = "Name")String name, @WebParam(name = "Position")String position) {
		try {
			PersonInfo personInfo = null;

			// Получение соединения с БД
			Connection con = getConnection();

			// Выполнение SQL-запроса
			ResultSet rs = con.createStatement().executeQuery(
		   		"Select name, position, age, salary from Person " +  
                                    "where (name like '" + name + "' and position like '" + position + "')");
			if (rs.next()) {

// Формирование нового объекта класса WeatherInfo 
// на основе данных выбранной записи
				personInfo = new PersonInfo(
rs.getString(1), 
rs.getString(2), 
rs.getString(3), 
rs.getString(4));
			}
			// Закрываем выборку и соединение с БД
			rs.close();
			con.close();

			return personInfo;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
        
        /**
	 * Возвращает информацию Сотрудниках
	 * @param name ФИО 
         * @param position Должность 
	 * @return Заработная плата
	 */
	@WebMethod(operationName = "RAge")
	public String getAge(@WebParam(name = "Name")String name, @WebParam(name = "Position")String position) {
            
            String result = null;
           
            try {
//                byte[] bytes = name.getBytes("Unicode");
//                name = new String(name.getBytes(), "windows-1251");// new String(bytes, "UTF-8"); windows-1251
                
                // Получение соединения с БД
		Connection con = getConnection();

                // Выполнение SQL-запроса
                Statement st =  con.createStatement();
		ResultSet rs = st.executeQuery(
                    "Select age from Person " +  
                        "where (name like '" + name + "' and position like '" + position + "')");
                while(rs.next()){
                   result = rs.getString(1);  
                }
/*
		if (rs.next()) {
                  result = rs.getString(1); 
                }
*/
        	// Закрываем выборку и соединение с БД
                rs.close();
		con.close();

		return result; //rs.getString(1);
            } catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }
        }
}
