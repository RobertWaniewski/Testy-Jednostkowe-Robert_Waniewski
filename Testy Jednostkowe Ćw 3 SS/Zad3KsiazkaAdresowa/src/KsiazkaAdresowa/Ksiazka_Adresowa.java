/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KsiazkaAdresowa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Robert_Waniewski
 */
public class Ksiazka_Adresowa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Person> Ksiazka = new ArrayList<Person>();
       
        
        for(int i = 0 ; i<30 ; i++){
        Ksiazka.add(new Person(RandomString.LosoweImie(), 
                                RandomString.LosoweNazwisko(), 
                                RandomString.LosowaUlica(), 
                                RandomString.LosowyNrDomu(), 
                                RandomString.LosowaMiejscowosc(), 
                                RandomString.LosowyKodPocztowy(), 
                                RandomString.LosowyTelefon()));
        }
       
        
         for(Person person : Ksiazka) {
            System.out.println(person);
        }
 
        Collections.sort(Ksiazka);
 
        System.out.println("\nPosortowane: ");
        
        
        for(Person person : Ksiazka) {
            System.out.println(person);
        }
        
    }
    
}
