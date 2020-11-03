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
public class Perro extends Animal{
    
    String nombre;
    String raza;
    
    public Perro(){
        
    }
    
    public Perro(String r, String n){
        
        nombre=n;
        raza=r;
        
    }
    
     
    public Perro(Sexo s, String r, String n){
        
        super(s);
        nombre=n;
        raza=r;
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }
    
    public void ladrar(){
        
        System.out.println("el perro ladra");
    }
    
    public void come(){
        
        System.out.println("el perro come comida");
    }
    
    public void sepelea(Gato g){
        
        System.out.println(this.getNombre()+"se pelea con el gato"+g);
    }
    
    @Override
    public String toString(){
        
        
        
        return "soy un perro llamado " +this.getNombre()+" de la raza "+ this.getRaza()+super.toString();
    }
    
}
