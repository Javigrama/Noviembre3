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
public class Animales {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gato gato=new Gato(Sexo.MACHO, "persa");
        Gato gata=new Gato(Sexo.HEMBRA);
        Gato gaton=new Gato(Sexo.MACHO, "siames");

         /*  gato.peleaCon(gata);
           System.out.println(gato);
           gato.come("pescado");
           gata.peleaCon(gaton);
           gato.come("carne");
           Pinguino pin=new Pinguino(Sexo.HERMAFRODITA, "dos", "amarillo");
        System.out.println(pin);*/
        
        Perro perro=new Perro(Sexo.MACHO, "caniche", "Scooby");
        System.out.println(perro);
    }
    
}
