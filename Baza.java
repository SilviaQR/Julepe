
/**
 * Write a description of class Baza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baza
{
    // instance variables - replace the example below with your own
    private Carta baza[];
    private String nombresJugadores[];
    private int contadorTiradas;
    private int paloQuePinta;

    /**
     * Constructor for objects of class Baza
     */
    public Baza(int numeroJugadores, int paloQuePinta)
    {
        // initialise instance variables
        baza = new Carta[numeroJugadores];
        nombresJugadores = new String[numeroJugadores];
        contadorTiradas = 0;
        this.paloQuePinta = paloQuePinta;
    }

    public void addCarta(Carta cartaTirada, String nombreJugador)
    {   
        while(contadorTiradas < baza.length){
            baza[contadorTiradas] = cartaTirada;
            nombresJugadores[contadorTiradas] = nombreJugador;
            contadorTiradas++;
        }
    }

    public int getPaloPrimeraCartaDeLaBaza()
    {
        int posicion = -1;
        posicion = baza[0].getPalo();
        return posicion;
    }

    public Carta cartaQueVaGanandoLaBaza()
    {
        Carta cartaQueGana = null;
        int index = 0;
        if(baza[index] != null){
            cartaQueGana = baza[index];
            index++;
            while(index < baza.length){
                if(cartaQueGana.ganaA(baza[index], paloQuePinta)){
                    cartaQueGana = baza[index];
                    index++;
                }
                index++;
            }   
        }
        return cartaQueGana;
        }
        
        
       
}

