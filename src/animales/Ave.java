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
public class Ave extends Animal {
    
    public Ave(Sexo s){
        
        super(s);
    }
    
    public void lavate(){
        
        System.out.println("se lava");
    }
    
    public void vuela(){
        
        System.out.println("vuela");
    }
    

    @Override
    public String toString(){
      
        super.toString();
        return "vuela mas";
    }
}
