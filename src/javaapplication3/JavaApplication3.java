
package javaapplication3;


public class JavaApplication3 {

    public static void main(String[] args) {
        //Creamos jugadores (Los datos son ficticios y no reflejan la realidad)
        Jugador j1 = new Jugador("UC", "Colo","Volante","1-9","Esteban","Paredes","Perez",40,"Jugador");
        Jugador j2 = new Jugador("U", "Colo","Defensa","1-8","Jose","Rojas", "Rojas", 65, "Jugador");
        //Creamos objeto para llamar la coleccion
        Registro rp= new Registro();
        //Guardar datos jugador en coleccion
        System.out.println("AgregarJugadores");
        System.out.println("---------------------");
        rp.agregarPersona(j1);
        rp.agregarPersona(j2);
        System.out.println("---------------------");
        
        //mostrar jugadores y entrenadores
        System.out.println("Mostrar jugadores ");
        rp.listar();
        System.out.println("---------------------");
        
        //eliminar productos y mostrar 
        System.out.println("La cantidad de eliminados fue:"+ rp.eliminarPersona("1-9"));
        System.out.println("---------------------");
        
        System.out.println("Metodo jugar en clase jugador");
        j1.jugar();
        System.out.println("---------------------");
        System.out.println("Entrevista de jugador 2 en clase jugador");
        j2.entrevistar();
    }
    
}
