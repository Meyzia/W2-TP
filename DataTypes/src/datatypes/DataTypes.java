/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatypes;
import java.util.*;
import java.io.*;
import java.math.BigInteger;

class DataTypes{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();

        BigInteger[] n=new BigInteger[T];

        for(int i=0;i<T;i++)
        {
            n[i]=sc.nextBigInteger();
        }
        
        for(int i=0;i<T;i++){
            if(n[i].compareTo(BigInteger.valueOf(Long.MAX_VALUE))<0 && n[i].compareTo(BigInteger.valueOf(Long.MIN_VALUE))>0)
                {System.out.println(n[i]+" can be fitted in: ");
            if(n[i].compareTo(BigInteger.valueOf(-128))>0 && n[i].compareTo(BigInteger.valueOf(127))<0) 
                {System.out.println("* byte");}
            if(n[i].compareTo(BigInteger.valueOf(Short.MIN_VALUE))>0 && n[i].compareTo(BigInteger.valueOf(Short.MAX_VALUE))<0)
                {System.out.println("* short");}
            if(n[i].compareTo(BigInteger.valueOf(Integer.MIN_VALUE))>0 && n[i].compareTo(BigInteger.valueOf(Integer.MAX_VALUE))<0)
                {System.out.println("* int");}
            if(n[i].compareTo(BigInteger.valueOf(Long.MIN_VALUE))>0 && n[i].compareTo(BigInteger.valueOf(Long.MAX_VALUE))<0)
                {System.out.println("* long");}
            } else {
                System.out.println(n[i]+" can't be fitted anywhere.");
            }
        }
    }
}