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
public class Animal {
    
    Sexo sexo;
    public Animal(){
        
    }
    
    public Animal(Sexo sexo){
        
        this.sexo=sexo;
    }

    public Sexo getSexo() {
        return sexo;
    }
    
    @Override
    public String toString(){
        
        return "sexo:"+ this.sexo+ "\n";
    }
    
    public void duerme(){
        
        System.out.println("zzzz");
    }
}
