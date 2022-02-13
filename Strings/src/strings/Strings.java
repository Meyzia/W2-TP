/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.*;

/**
 *
 * @author lenovo
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn=new Scanner(System.in);
        
        String A,B;
        
        A=scn.next();
        B=scn.next();
        
        System.out.println("");
        
        System.out.println(A.length()+B.length());
        
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1) +" "+ B.substring(0, 1).toUpperCase()+B.substring(1));
    }
    
}
