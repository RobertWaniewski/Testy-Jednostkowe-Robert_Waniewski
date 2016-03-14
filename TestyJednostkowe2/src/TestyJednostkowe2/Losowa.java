/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestyJednostkowe2;

/**
 *
 * @author Seweryn
 */
public class Losowa implements Comparable<Losowa>{
    int losowa;
    
    public Losowa(int losowa){
    this.losowa = losowa;
    }
    
    @Override
    public int compareTo(Losowa o) {
        int roznica = 0;
        if (losowa>o.losowa)
            roznica = 1;
        else if (losowa<o.losowa)
            roznica = -1;
        
        return roznica;
        
    }
    
}
