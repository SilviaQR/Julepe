
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

    /**
     * Constructor for objects of class Baza
     */
    public Baza(int numeroJugadores, int paloQuePinta)
    {
        // initialise instance variables
        baza = new Carta[numeroJugadores];
		nombresJugadores = new String[numeroJugadores];
		contadorTiradas = 0;
    }

    public void addCarta(Carta cartaTirada, String nombreJugador)
    {	
        while(contadorTiradas < baza.length){
			baza[contadorTiradas] = cartaTirada;
			nombresJugadores[contadorTiradas] = nombreJugador;
			contadorTiradas++;
		}
    }

	
}
