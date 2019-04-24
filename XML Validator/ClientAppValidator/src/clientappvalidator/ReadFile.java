/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientappvalidator;

import java.io.FileReader;
import java.util.Scanner;
/**
 *
 * @author Администратор
 */
public class ReadFile {
    
    String readData(String pathFile)
    {
        
        String resultData = "";
        try{
            FileReader fr = new FileReader(pathFile);
            Scanner scan = new Scanner(fr);
            
            while(scan.hasNextLine()){
               resultData = resultData + scan.nextLine();
               System.out.println(resultData);
            }
            
            fr.close();
            return resultData;
        }
        catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
            return null;
        }
    }
}
