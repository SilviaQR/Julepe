import java.lang.reflect.Array;
import java.util.Random;
import java.util.ArrayList;
/**
 * Write a description of class Juego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Juego
{
    // instance variables - replace the example below with your own
    private Jugador[] nuevoJugador;
    private Mazo nuevoMazo; 
    private int paloPintado;
    private ArrayList<String> nombresAleatorios;
    private String nombreJugador;

    /**
     * Constructor for objects of class Juego
     */
    public Juego(int numeroJugadores, String nombreJugador)
    {
        nuevoMazo = new Mazo();   
        nuevoJugador = new Jugador[numeroJugadores];
        nombresAleatorios = new ArrayList<String>();
        this.nombreJugador = nombreJugador;
        nombresAleatorios.add("Pepe"); 
        nombresAleatorios.add("Maria"); 
        nombresAleatorios.add("Juan");
        nombresAleatorios.add("Jorge"); 
        nombresAleatorios.add("Miguel"); 
        nombresAleatorios.add("Sandra");
        nombresAleatorios.add("Paula");
        nombresAleatorios.add("Lucia");
        nombresAleatorios.add("Hector"); 
        nombresAleatorios.add("Ivan");
        Random random = new Random();
        nuevoJugador[0] = new Jugador(nombreJugador);
        for(int contadorJugadores = 1; contadorJugadores < numeroJugadores; contadorJugadores++){
            int numeroAleatorio = random.nextInt(nombresAleatorios.size());
            String nombreAleatorioEscogido = nombresAleatorios.get(numeroAleatorio);
            nombresAleatorios.remove(numeroAleatorio);
            Jugador jugador = new Jugador(nombreAleatorioEscogido);
            nuevoJugador[contadorJugadores] = jugador;
        }
        System.out.println("Bienvenido/a " + nombreJugador + ". Tus compañeros de partida son: ");
        int contadorNombres = 0;
        while(contadorNombres < nuevoJugador.length){
            System.out.println(nuevoJugador[contadorNombres].getNombre());
            contadorNombres++;
        }
    }
    
    public void hacerTrampasYVerCartasJugador(String nombre){
        int contadorJugador = 0;
        boolean buscando = true;
        while(contadorJugador < nuevoJugador.length && buscando){
            if(nombre.equals(nuevoJugador[contadorJugador].getNombre())){
                  nuevoJugador[contadorJugador].verCartasJugador();
                  buscando = false;
            }
            contadorJugador++;
        }
       }

    public int repartirCincoCartas(){
        nuevoMazo.barajar();
        Carta primeraCarta = null;
        for(int contadorCartas = 0; contadorCartas < 5; contadorCartas++){
            for(int contadorJugador = 0; contadorJugador < nuevoJugador.length; contadorJugador++){
                primeraCarta = nuevoMazo.sacarCarta();
                nuevoJugador[contadorJugador].recibirCarta(primeraCarta);
            }
        } 
        paloPintado = primeraCarta.getPalo();
        int valorPaloPintado = primeraCarta.getValor();
        String paloString = "";
        switch(paloPintado){
            case 0: paloString = "oros";
            break;
            case 1: paloString = "copas";
            break;
            case 2: paloString = "espadas";
            break;
            case 3: paloString = "bastos";
            break;
         }
        nuevoJugador[0].verCartasJugador();
        System.out.println("Pintan " + paloString + "."); 
        return valorPaloPintado;
    }

    public void verCartasJugadorHumano()
    {
        nuevoJugador[0].verCartasJugador();
    }
}
