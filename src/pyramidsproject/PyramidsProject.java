/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramidsproject;
import java.util.*;

/**
 *
 * @author Mahmoud Eidarous
 */
public class PyramidsProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       DAOcsvPyramids dao = new DAOcsvPyramids();
       List<Pyramid> myList=dao.readPyramidsFromCSV("D:\\AI-Pro ITI\\Java\\Java Ass1\\pyramids.csv");
       
       for(Pyramid p: myList){
           System.out.println("Pharoh Name: "+p.getPharoh()+ "/ Modern Name: "+ p.getModernName() + "/ Height: " + p.getHeight() + "/ Site: " + p.getSite());
       
       }
    }
    
}
