/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.ArrayList;

/**
 *
 * @author martiixx
 */
public class Registro {
    //Declaro ArrayList de persona
    ArrayList<Persona> listaPersona;

    public Registro(ArrayList<Persona> listaPersona) {
        this.listaPersona = listaPersona;
    }
    
    public Registro(){
        listaPersona = new ArrayList<Persona>();
    }
    
    public void agregarPersona(Persona persona){
        if (this.verificar(persona.getRut())==false){
            listaPersona.add(persona);
            if("Jugador".equals(persona.getTipo())){
                System.out.println("Jugador Ingresado");}            
            else 
            {System.out.println("Entredor ingresado");}
        }
        else {
            System.out.println("Persona Existe");            
            
        }
    }
    
    public void listar(){
        for (Persona tmp : listaPersona){
            System.out.println(tmp.mostrar());
        }
    }
    
    public boolean verificar(String rut1){
        boolean valida= false;
        for (Persona tmp : listaPersona){
            if(tmp.getRut().equals(rut1)){
                valida=true;
                break;
            }
        }
        return valida;
    }
   
    public int eliminarPersona(String rut1){
        int contador = 0;
        for (int i=0; i<listaPersona.size();i++){
            if (listaPersona.get(i).getRut().equals(rut1)){
                listaPersona.remove(i);
                contador++;
                i--;
            }
        }
        return contador;
    }
}
