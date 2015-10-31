/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebooklogin;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author indrajit
 */
public class ReadFile {
    String path;
    public ReadFile(String file_path){
        path = file_path;
    }
    public void OpenFile(){
       try{   
            FileReader inputFile = new FileReader(path);
            BufferedReader bufRead = new BufferedReader(inputFile);
            String line;

            while((line = bufRead.readLine()) != null){
                System.out.println(line);
            }
            bufRead.close();
        }
        catch(Exception e)
        {
            System.out.println("Error"+ e.getMessage());
       
        }
    }
    
}
