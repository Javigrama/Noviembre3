/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

/**
 *
 * @author Semipresencial 1º
 */
public class Pinguino extends Ave {
    
    String patas;
    String picos;
    int dientes;
    
    public Pinguino(Sexo s, String p, String pi){
        
        super(s);
        patas=p;
        picos=pi;
        dientes=7;
        
    }
    
    @Override
    public String toString(){
        
         return super.toString();
        
        
    }
    
}
