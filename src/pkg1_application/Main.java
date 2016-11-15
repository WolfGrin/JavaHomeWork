/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_application;

/**
 *
 * @author WolfGrin
 */
public class Main {

        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String firstName = "Дмитрий";
        String middleName = "Сергеевич";
        String lastName = "Михайлик";
        String FIO = firstName + " " + middleName + " " + firstName;
        String dr = "30.05.1985";
        
        System.out.println("Михайлик Дмитрий Сргеевич");
        System.out.println(FIO);
        System.out.println(dr);
        System.out.println(FIO + " " + dr);
                
        //однострочный комментарий
        /* многострочный
        комментарий
        */
        
    }
    
}
