/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestyJednostkowe2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Seweryn
 */
public class Testy_jednostkoweV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1E7 = 1 * 10 do potęgi 7 =  10 000 000
        
      
        
        
        Random gen = new Random();
        
        List<Losowa> Losowe = new ArrayList<Losowa>();
        
        
        for (int i = 0; i<10000000; i++){
       
        Losowe.add(new Losowa(gen.nextInt()));
        }
        
        Collections.sort(Losowe);
        
        // for(Losowa losowa : Losowe) {
        //   System.out.println(losowa.losowa);
        // }
        
        
    }
    
}
