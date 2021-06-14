/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pyramidsproject;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Mahmoud Eidarous
 */
public class DAOcsvPyramids {
    
    public List<Pyramid> readPyramidsFromCSV(String filePath){
        List<Pyramid> pyList = new ArrayList<>();
    try {
        File pyr = new File(filePath);
        Scanner sc = new Scanner(pyr);
        sc.useDelimiter(",|\\n");
        String next = sc.nextLine();
        while(sc.hasNext()){
            Pyramid pyramid = new Pyramid();
            
            pyramid.setPharoh(sc.next());
            pyramid.setAncentName(sc.next());
            pyramid.setModernName(sc.next());
            pyramid.setDynasty(sc.next());
            pyramid.setSite(sc.next());
            pyramid.setBase1(sc.next());
            pyramid.setBase2(sc.next());
            pyramid.setHeight(sc.next());
            pyramid.setSlope(sc.next());
            pyramid.setVol(sc.next());
            pyramid.setLat(sc.next());
            pyramid.setLog(sc.next());
            pyramid.setTy(sc.next());
            pyramid.setLep(sc.next());
            pyramid.setMat(sc.next());
            pyramid.setComm(sc.next());
            
            
            pyList.add(pyramid);

        }
        sc.close();
    }
    catch(FileNotFoundException e ){
        System.out.println("File Not Found");
    }
    return pyList ;
  }   
}
