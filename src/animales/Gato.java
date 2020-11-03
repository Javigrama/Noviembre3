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
public class Gato extends Animal {
    
    String raza;
    
    public Gato (Sexo s, String r){
        
        super(s);
        raza=r;
        
    }
    
    public Gato(Sexo s){
        super(s);
        raza="siames";
    }
    
    public Gato (String r){
        
        raza=r;
    }
    
    public void maulla(){
        
        System.out.println("miau");
    }
    
    public void ronronea(){
        System.out.println("ronronea");
    }
    
    public void come(String comida){
        
        if(comida.equals("pescado"))
        
        System.out.println("come pescado");
        
        else System.out.println("come otra cosa");
    }
    
    public void peleaCon(Gato contirncante){
        
        if(this.getSexo()==sexo.HEMBRA) System.out.println("no me gusta pelear");
        else System.out.println("ratatatataa tatatata");
    }
}
